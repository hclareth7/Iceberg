/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('AppControllers');

controllerModule
        .controller('programaController', ['$scope', 'programaService',
            '$stateParams', '$rootScope',
            function ($scope, programaService, $stateParams, $rootScope) {
                $rootScope.programas = [];
                $rootScope.getAllProgramas = function () {
                    programaService.getAllPrograma().then(function (response) {
                        $rootScope.programas = response.data;
                    });
                };

                $rootScope.getAllProgramas();


            }])
        .controller('programaCrearController', ['$scope', 'programaService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, programaService, $stateParams, $location, toastr, $rootScope) {
                $scope.titulo = "Crear nuevo programa";
                $scope.boton = "Guardar";
                $scope.savePrograma = function () {
                    programaService.createPrograma($scope.programa).then(function () {
                        $rootScope.getAllProgramas();
                        $scope.programa = {};
                        toastr.success('Exito', 'Programa creado.');
                    });

                };

            }])
        .controller('programaEditarController', ['$scope', 'programaService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, programaService, $stateParams, $location, toastr, $rootScope) {

                $scope.getPrograma = function (programaId) {
                    programaService.getProgramaById(programaId).then(function successCallBack(response) {

                        $scope.programa = response.data;
                    }, function errorCallBack(response) {
                        $location.path('/app/programa');
                    });
                };
                $scope.getPrograma(parseInt($stateParams.programaId));
                $scope.titulo = "Editar programa";
                $scope.boton = "Actualizar";

                $scope.savePrograma = function () {
                    console.log("hnynjy");
                   $scope.programa.beneficiarios = [];
                    $scope.programa.actividades = [];
                    programaService.updatePrograma($scope.programa).then(function (response) {
                        $rootScope.getAllProgramas();
                        toastr.success('Exito', 'Programa actualizado');
                        $location.path('/app/programa');


                    });
                };

            }])


