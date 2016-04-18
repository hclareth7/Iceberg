/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var icebergApp = angular.module("icebergApp", [
    'ui.router',
	'AppControllers',
	'AppServices'
]);

icebergApp.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/login');

	$stateProvider
		.state('main', {
			url: '/app',
			templateUrl: 'assets/js/app/views/main.html'
		})
		.state('login', {
			url: '/login',
			templateUrl: 'assets/js/app/views/login.html'
		})
		.state('main.zonas', {
			url: '/zona',
			templateUrl: 'assets/js/app/views/zonas/base.html',
			controller: 'zonaController'
		})
		
		.state('main.zonas.detalle', {
			url: '/:zonaId',
			templateUrl: 'assets/js/app/views/zonas/detalle.html',
			controller: 'zonaDetalleController'
		})


}])