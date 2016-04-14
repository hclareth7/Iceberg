/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var controllerModule = angular.module('AppControllers');

controllerModule.controller('loginController', ['$scope', '$rootScope', '$location', 'authService',
    function ($scope, $rootScope, $location, authService) {
        $scope.user = {
            userName: "",
            password: ""
        };


        $scope.login = function(user) {
            authService.login(user).then(function(response) {
                if (response.success) {
                    $rootScope.loggedIn = true;
                    $location.path('/admin');

                } else {
                    $rootScope.loggedIn = false;
                    $scope.error = true;
                }
            }, function(response) {
                $scope.error = true;
            });
        };
    }]);




