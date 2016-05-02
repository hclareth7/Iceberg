var servicesModule = angular.module('AppServices');
servicesModule.factory('zonaService', ['$http', function ($http) {
    return {
        apiUrl: apiUrl,
        getAllZona: function () {
            return $http.get(this.apiUrl + 'zona/');
        },
        getZonaById: function (zonaId) {
            return $http.get(this.apiUrl + 'zona/' + zonaId);

        },
        createZona: function (zona) {
            return $http.post(this.apiUrl + 'zona/', zona);
        },
        updateZona: function (zona) {
            return $http.put(this.apiUrl + 'zona/', zona);
        },
        deleteZona: function (zonaId) {
            return $http.delete(this.apiUrl + 'zona/' + zonaId);
        }
    };
    }]);