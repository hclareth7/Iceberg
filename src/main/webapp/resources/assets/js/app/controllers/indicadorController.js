/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('AppControllers');

controllerModule
        .controller('indicadorController', ['$scope', 'indicadorService',
            '$stateParams', '$rootScope',
            function ($scope, indicadorService, $stateParams, $rootScope) {
                $rootScope.indicadores = [];
                $rootScope.getAllIndicadores = function () {
                    indicadorService.getAllIndicador().then(function (response) {
                        $rootScope.indicadores = response.data;
                    });
                };

                $rootScope.getAllIndicadores();


            }])
        .controller('indicadorCrearController', ['$scope', 'indicadorService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, indicadorService, $stateParams, $location, toastr, $rootScope) {
                $scope.titulo = "Crear nuevo indicador";
                $scope.boton = "Guardar";
                $scope.saveIndicador = function () {
                    indicadorService.createIndicador($scope.indicador).then(function () {
                        $rootScope.getAllIndicadores();
                        $scope.indicador = {};
                        toastr.success('Exito', 'Indicador creado.');
                    });

                };

            }])
        .controller('indicadorEditarController', ['$scope', 'indicadorService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, indicadorService, $stateParams, $location, toastr, $rootScope) {

                $scope.getIndicador = function (indicadorId) {
                    indicadorService.getIndicadorById(indicadorId).then(function successCallBack(response) {

                        $scope.indicador = response.data;
                    }, function errorCallBack(response) {
                        $location.path('/app/indicador');
                    });
                };
                $scope.getIndicador(parseInt($stateParams.indicadorId));
                $scope.titulo = "Editar indicador";
                $scope.boton = "Actualizar";

                $scope.saveIndicador = function () {

                    //$scope.indicador.usuarios = [];
                    $scope.indicador.objetivos_indocadores = [];
                    indicadorService.updateIndicador($scope.indicador).then(function (response) {
                        $rootScope.getAllIndicadores();
                        toastr.success('Exito', 'Indicador actualizado');
                        $location.path('/app/indicador');


                    });
                };

            }])

