/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var servicesModule = angular.module('AppServices');

servicesModule.factory('indicadorService', ['$http', function ($http) {
    return {
        apiUrl: apiUrl,
        getAllIndicador: function () {
            return $http.get(this.apiUrl + 'indicador/');
        },
        getIndicadorById: function (indicadorId) {
            return $http.get(this.apiUrl + 'indicador/' + indicadorId);
        },
        createIndicador: function (indicador) {
            return $http.post(this.apiUrl + 'indicador/', indicador);
        },
        updateIndicador: function (indicador) {
            return $http.put(this.apiUrl + 'indicador/', indicador);
        },
        deleteIndicador: function (indicadorId) {
            return $http.delete(this.apiUrl + 'indicador/' + indicadorId);
        }
    };
    }]);
