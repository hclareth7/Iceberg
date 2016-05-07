/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var controllerModule = angular.module('AppControllers');

controllerModule
        .controller('perfilController', ['$scope', 'perfilService',
            '$stateParams', '$rootScope',
            function ($scope, perfilService, $stateParams, $rootScope) {
                $rootScope.perfiles = [];
                $rootScope.getAllPerfiles = function () {
                    perfilService.getAllPerfil().then(function (response) {
                        $rootScope.perfiles = response.data;
                    });
                };

                $rootScope.getAllPerfiles();


            }])
        .controller('perfilCrearController', ['$scope', 'perfilService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, perfilService, $stateParams, $location, toastr, $rootScope) {
                $scope.titulo = "Crear nuevo perfil";
                $scope.boton = "Guardar";
                $scope.savePerfil = function () {
                    perfilService.createPerfil($scope.perfil).then(function () {
                        $rootScope.getAllPerfiles();
                        $scope.perfil = {};
                        toastr.success('Exito', 'Perfil creado.');
                    });

                };

            }])
        .controller('perfilEditarController', ['$scope', 'perfilService', '$stateParams', '$location', 'toastr', '$rootScope',
            function ($scope, perfilService, $stateParams, $location, toastr, $rootScope) {

                $scope.getPerfil = function (perfilId) {
                    perfilService.getPerfilById(perfilId).then(function successCallBack(response) {

                        $scope.perfil = response.data;
                    }, function errorCallBack(response) {
                        $location.path('/app/perfil');
                    });
                };
                $scope.getPerfil(parseInt($stateParams.perfilId));
                $scope.titulo = "Editar perfil";
                $scope.boton = "Actualizar";

                $scope.savePerfil = function () {
                    console.log("hnynjy");
                   $scope.perfil.usuarios = [];
                    $scope.perfil.acciones = [];
                    perfilService.updatePerfil($scope.perfil).then(function (response) {
                        $rootScope.getAllPerfiles();
                        toastr.success('Exito', 'Perfil actualizado');
                        $location.path('/app/perfil');


                    });
                };

            }])
