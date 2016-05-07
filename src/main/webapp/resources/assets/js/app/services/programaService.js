/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var servicesModule = angular.module('AppServices');

servicesModule.factory('programaService', ['$http', function ($http) {
    return {
        apiUrl: apiUrl,
        getAllPrograma: function () {
            return $http.get(this.apiUrl + 'programa/');
        },
        getProgramaById: function (programaId) {
            return $http.get(this.apiUrl + 'programa/' + programaId);
        },
        createPrograma: function (programa) {
            return $http.post(this.apiUrl + 'programa/', programa);
        },
        updatePrograma: function (programa) {
            return $http.put(this.apiUrl + 'programa/', programa);
        },
        deletePrograma: function (programaId) {
            return $http.delete(this.apiUrl + 'programa/' + programaId);
        }
    };
    }]);
