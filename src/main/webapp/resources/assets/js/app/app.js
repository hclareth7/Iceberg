/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var icebergApp = angular.module("icebergApp", [
    'ui.router',
	'AppControllers',
	'AppServices',
    'ngAnimate',
    'toastr'
]);

icebergApp.filter('capitalize', function () {
    return function (input) {
        return (!!input) ? input.charAt(0).toUpperCase() : '';
    }
});

icebergApp.config(['$stateProvider', '$urlRouterProvider','toastrConfig', function ($stateProvider, $urlRouterProvider,toastrConfig) {
        angular.extend(toastrConfig, {
        autoDismiss: false,
        containerId: 'toast-container',
        maxOpened: 0,
        newestOnTop: true,
        positionClass: 'toast-top-right',
        preventDuplicates: false,
        preventOpenDuplicates: false,
        target: 'body'
    });

    $urlRouterProvider.otherwise('/login');

    $stateProvider
        .state('main', {
            url: '/app',
            templateUrl: 'assets/js/app/views/main.html'
        })
        .state('login', {
            url: '/login',
            templateUrl: 'assets/js/app/views/login.html'
        }) //ZONAS ROUTES
        .state('main.zonas', {
            url: '/zona',
            templateUrl: 'assets/js/app/views/zonas/base.html',
            controller: 'zonaController'
        })

    .state('main.zonas.detalle', {
            url: '/detalle/:zonaId',
            templateUrl: 'assets/js/app/views/zonas/detalle.html',
            controller: 'zonaDetalleController'
        })
        .state('main.zonas.crear', {
            url: '/crear',
            templateUrl: 'assets/js/app/views/zonas/crear.html',
            controller: 'zonaCrearController'
        })
        .state('main.zonas.editar', {
            url: '/editar/:zonaId',
            templateUrl: 'assets/js/app/views/zonas/crear.html',
            controller: 'zonaEditarController'
        })
        

    //BENEFICIARIO ROUTES
    .state('main.beneficiarios', {
        url: '/beneficiario',
        templateUrl: 'assets/js/app/views/beneficiarios/base.html',
        controller: 'beneficiarioController'
    })

    .state('main.beneficiario.detalle', {
            url: '/detalle/:beneficiarioId',
            templateUrl: 'assets/js/app/views/beneficiarios/detalle.html',
            controller: 'beneficiarioDetalleController'
        })
        .state('main.beneficiario.crear', {
            url: '/crear',
            templateUrl: 'assets/js/app/views/beneficiarios/crear.html',
            controller: 'beneficiarioCrearController'
        })

}]);
