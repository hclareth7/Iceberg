/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var servicesModule = angular.module('AppServices');

servicesModule.factory('authService', ['$http', '$q', function ($http, $q) {
        return {
            apiUrl: apiUrl,
            _isLoggedIn: false,
            login: function (user) {
                var deferred = $q.defer();
                var headers = user ? {
                    authorization: 'Basic ' + btoa(user.userName + ":" + user.password)
                } : {};
                $http.get(this.apiUrl + 'user', {headers: headers}).then(function (response) {

                    if (response.data.name)
                        this._isLoggedIn = true;
                    else
                        this._isLoggedIn = false;
                    deferred.resolve({success: response.data.name !== undefined, response: response});
                },
                        function (response) {
                            deferred.resolve({success: false, response: response});
                        });
                return deferred.promise;
            },
            logout: function () {
                this._isLoggedIn = false;
                return $http.post(this.apiUrl + 'logout', {});
            },
            isUserLoggedIn: function () {
                var deferred = $q.defer();
                if (this._isLoggedIn) {
                    deferred.resolve(true);
                } else {
                    $http.get(this.apiUrl + 'user/isLoggedIn')
                            .then(function (response) {
                                if (response.data)
                                    deferred.resolve(true);
                                else
                                    deferred.reject(false);
                            });
                }
                return deferred.promise;
            }

        };
    }]);


