/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var servicesModule = angular.module('AppServices');

servicesModule.factory('perfilService', ['$http', function ($http) {
    return {
        apiUrl: apiUrl,
        getAllPerfil: function () {
            return $http.get(this.apiUrl + 'perfil/');
        },
        getPerfilById: function (perfilId) {
            return $http.get(this.apiUrl + 'perfil/' + perfilId);
        },
        createPerfil: function (perfil) {
            return $http.post(this.apiUrl + 'perfil/', perfil);
        },
        updatePerfil: function (perfil) {
            return $http.put(this.apiUrl + 'perfil/', perfil);
        },
        deletePerfil: function (perfilId) {
            return $http.delete(this.apiUrl + 'perfil/' + perfilId);
        }
    };
    }]);
