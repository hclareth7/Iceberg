/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var servicesModule = angular.module('AppServices');

servicesModule.factory('objetivoService', ['$http', function ($http) {
    return {
        apiUrl: apiUrl,
        getAllObjetivo: function () {
            return $http.get(this.apiUrl + 'objetivo/');
        },
        getObjetivoById: function (objetivoId) {
            return $http.get(this.apiUrl + 'objetivo/' + objetivoId);
        },
        createObjetivo: function (objetivo) {
            return $http.post(this.apiUrl + 'objetivo/', objetivo);
        },
        updateObjetivo: function (objetivo) {
            return $http.put(this.apiUrl + 'objetivo/', objetivo);
        },
        deleteObjetivo: function (objetivoId) {
            return $http.delete(this.apiUrl + 'objetivo/' + objetivoId);
        }
    };
    }]);
