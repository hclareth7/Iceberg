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

icebergApp.config(['$stateProvider', '$urlRouterProvider', 'toastrConfig', function ($stateProvider, $urlRouterProvider, toastrConfig) {
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
                .state('main.beneficiarios.detalle', {
                    url: '/detalle/:beneficiarioId',
                    templateUrl: 'assets/js/app/views/beneficiarios/detalle.html',
                    controller: 'beneficiarioDetalleController'
                })
                .state('main.beneficiarios.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/beneficiarios/crear.html',
                    controller: 'beneficiarioCrearController'
                })
                .state('main.beneficiarios.editar', {
                    url: '/editar/:beneficiarioId',
                    templateUrl: 'assets/js/app/views/beneficiarios/crear.html',
                    controller: 'beneficiarioEditarController'
                })

                //PERFILES ROUTES
                .state('main.perfiles', {
                    url: '/perfil',
                    templateUrl: 'assets/js/app/views/perfiles/base.html',
                    controller: 'perfilController'
                })
                .state('main.perfiles.detalle', {
                    url: '/detalle/:perfilId',
                    templateUrl: 'assets/js/app/views/perfiles/crear.html',
                    controller: 'perfilEditarController'
                })
                .state('main.perfiles.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/perfiles/crear.html',
                    controller: 'perfilCrearController'
                })
                
                
                //PROGRAMAS ROUTES
                .state('main.programas', {
                    url: '/programa',
                    templateUrl: 'assets/js/app/views/programas/base.html',
                    controller: 'programaController'
                })
                .state('main.programas.detalle', {
                    url: '/detalle/:programaId',
                    templateUrl: 'assets/js/app/views/programas/crear.html',
                    controller: 'programaEditarController'
                })
                .state('main.programas.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/programas/crear.html',
                    controller: 'programaCrearController'
                })
                
                //OBJETIVOS ROUTES
                .state('main.objetivos', {
                    url: '/objetivo',
                    templateUrl: 'assets/js/app/views/objetivos/base.html',
                    controller: 'objetivoController'
                })
                .state('main.objetivos.detalle', {
                    url: '/detalle/:objetivoId',
                    templateUrl: 'assets/js/app/views/objetivos/crear.html',
                    controller: 'objetivoEditarController'
                })
                .state('main.objetivos.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/objetivos/crear.html',
                    controller: 'objetivoCrearController'
                })
                
                //INDICADORES ROUTES
                .state('main.indicadores', {
                    url: '/indicador',
                    templateUrl: 'assets/js/app/views/indicadores/base.html',
                    controller: 'indicadorController'
                })
                .state('main.indicadores.detalle', {
                    url: '/detalle/:indicadorId',
                    templateUrl: 'assets/js/app/views/indicadores/crear.html',
                    controller: 'indicadorEditarController'
                })
                .state('main.indicadores.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/indicadores/crear.html',
                    controller: 'indicadorCrearController'
                })
                
                //ACTIVIDADES ROUTES
                .state('main.actividades', {
                    url: '/actividad',
                    templateUrl: 'assets/js/app/views/actividades/base.html',
                    controller: 'actividadController'
                })
                .state('main.actividades.detalle', {
                    url: '/detalle/:actividadId',
                    templateUrl: 'assets/js/app/views/actividades/crear.html',
                    controller: 'actividadEditarController'
                })
                .state('main.actividades.crear', {
                    url: '/crear',
                    templateUrl: 'assets/js/app/views/actividades/crear.html',
                    controller: 'actividadCrearController'
                })
                

    }]);
