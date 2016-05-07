/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var controllerModule = angular.module('AppControllers');

controllerModule
        .controller('actividadController', ['$scope', 'actividadService',
            '$stateParams', '$rootScope',
            function ($scope, actividadService, $stateParams, $rootScope) {
                $rootScope.actividades = [];
                $rootScope.getAllActividades = function () {
                    actividadService.getAllActividad().then(function (response) {
                        $rootScope.actividades = response.data;
                    });
                };

                $rootScope.getAllActividades();


            }])
        .controller('actividadCrearController', ['$scope', 'actividadService', 'programaService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, actividadService, programaService, $stateParams, $location, toastr, $rootScope) {
                $scope.titulo = "Crear nuevo actividad";
                $scope.boton = "Guardar";

                programaService.getAllPrograma().then(function (response) {
                    $scope.programas = response.data;
                });


                $scope.saveActividad = function () {
                    actividadService.createActividad($scope.actividad).then(function () {
                        $rootScope.getAllActividades();
                        $scope.actividad = {};
                        toastr.success('Exito', 'Actividad creado.');
                    });

                };

            }])
        .controller('actividadEditarController', ['$scope', 'actividadService', 'programaService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, actividadService, programaService, $stateParams, $location, toastr, $rootScope) {

                $scope.getActividad = function (actividadId) {
                    actividadService.getActividadById(actividadId).then(function successCallBack(response) {

                        $scope.actividad = response.data;
                    }, function errorCallBack(response) {
                        $location.path('/app/actividad');
                    });
                };
                $scope.getActividad(parseInt($stateParams.actividadId));
                $scope.titulo = "Editar actividad";
                $scope.boton = "Actualizar";
                
                programaService.getAllPrograma().then(function (response) {
                    $scope.programas = response.data;
                });

                $scope.saveActividad = function () {
//                   $scope.actividad.usuarios = [];
                    $scope.actividad.programaciones = [];
                    actividadService.updateActividad($scope.actividad).then(function (response) {
                        $rootScope.getAllActividades();
                        toastr.success('Exito', 'Actividad actualizado');
                        $location.path('/app/actividad');


                    });
                };

            }])