/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var icebergApp = angular.module("icebergApp", [
    'ui.router'
]);

icebergApp.config(['$stateProvider','$urlProvider',function($stateProvider,$urlProvider){
	$stateProvider
		.state('main',{
			url:'/main',
			templateUrl:'views/main.html'
	})
		.state('',{})

}]);
