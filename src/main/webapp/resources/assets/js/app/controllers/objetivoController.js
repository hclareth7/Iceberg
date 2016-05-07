/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('AppControllers');

controllerModule
        .controller('objetivoController', ['$scope', 'objetivoService',
            '$stateParams', '$rootScope',
            function ($scope, objetivoService, $stateParams, $rootScope) {
                $rootScope.objetivos = [];
                $rootScope.getAllObjetivos = function () {
                    objetivoService.getAllObjetivo().then(function (response) {
                        $rootScope.objetivos = response.data;
                    });
                };

                $rootScope.getAllObjetivos();


            }])
        .controller('objetivoCrearController', ['$scope', 'objetivoService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, objetivoService, $stateParams, $location, toastr, $rootScope) {
                $scope.titulo = "Crear nuevo objetivo";
                $scope.boton = "Guardar";
                $scope.saveObjetivo = function () {
                    objetivoService.createObjetivo($scope.objetivo).then(function () {
                        $rootScope.getAllObjetivos();
                        $scope.objetivo = {};
                        toastr.success('Exito', 'Objetivo creado.');
                    });

                };

            }])
        .controller('objetivoEditarController', ['$scope', 'objetivoService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, objetivoService, $stateParams, $location, toastr, $rootScope) {

                $scope.getObjetivo = function (objetivoId) {
                    objetivoService.getObjetivoById(objetivoId).then(function successCallBack(response) {

                        $scope.objetivo = response.data;
                    }, function errorCallBack(response) {
                        $location.path('/app/objetivo');
                    });
                };
                $scope.getObjetivo(parseInt($stateParams.objetivoId));
                $scope.titulo = "Editar objetivo";
                $scope.boton = "Actualizar";

                $scope.saveObjetivo = function () {
                    console.log("hnynjy");
                   $scope.objetivo.objetivos_indocadores = [];
                    //$scope.objetivo.acciones = [];
                    objetivoService.updateObjetivo($scope.objetivo).then(function (response) {
                        $rootScope.getAllObjetivos();
                        toastr.success('Exito', 'Objetivo actualizado');
                        $location.path('/app/objetivo');


                    });
                };

            }])

