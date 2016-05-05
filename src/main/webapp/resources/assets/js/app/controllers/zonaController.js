var controllerModule = angular.module('AppControllers');

controllerModule
    .controller('zonaController', ['$scope', 'zonaService',
    '$stateParams', '$rootScope',
    function ($scope, zonaService, $stateParams, $rootScope) {
            $rootScope.zonas = [];
            $scope.getAllZonas = function () {
                zonaService.getAllZona().then(function (response) {
                    console.log(response.data);
                    $rootScope.zonas = response.data;

                });

            };

            $scope.getAllZonas();


    }])
    .controller('zonaDetalleController', ['$scope', 'zonaService',
    '$stateParams', '$location', 'toastr', '$rootScope',
	function ($scope, zonaService, $stateParams, $location, toastr, $rootScope) {

            $scope.getZona = function (zonaId) {
                zonaService.getZonaById(zonaId).then(function (response) {
                    $scope.zona = response.data;
                    console.log(response.data);

                }, function (response) {
                    console.log(response);
                    $location.path('/app/zona');
                    console.log($location);
                });
            };

            $scope.getZona(parseInt($stateParams.zonaId));
            //Metodo para eliminar la Zona
            $scope.removeZona = function (zonaId) {
                zonaService.deleteZona(zonaId).then(function (response) {
                   /* _.remove($rootScope.zonas, function (e) {
                        return e.id == zonaId;
                    });*/
                    $location.path('/app/zona');
                    toastr.success('Exito', 'Zona eliminada');


                }, function (response) {
                    console.log(response);
                    $location.path('/app/zona');
                    console.log($location);
                });

            };

	}])
    .controller('zonaCrearController', ['$scope', 'zonaService', '$stateParams', '$location', 'toastr', '$rootScope',
		function ($scope, zonaService, $stateParams, $location, toastr, $rootScope) {
            $scope.titulo = "Crear nueva zona";
            $scope.boton = "Guardar";
            $scope.saveZona = function () {
                zonaService.createZona($scope.zona).then(function () {
                    $rootScope.zonas.push($scope.zona);
                    $scope.zona = {};
                    toastr.success('Exito', 'Zona creada');
                });

            };

	}])

.controller('zonaEditarController', ['$scope', 'zonaService', '$stateParams', '$location', 'toastr', '$rootScope',
		function ($scope, zonaService, $stateParams, $location, toastr, $rootScope) {

        $scope.getZona = function (zonaId) {
            zonaService.getZonaById(zonaId).then(function successCallBack(response) {
                $scope.zona = response.data;
            }, function errorCallBack(response) {
                console.log(response);
                $location.path('/app/zona');
            });
        };
        $scope.getZona(parseInt($stateParams.zonaId));
        $scope.titulo = "Crear nueva zona";
        $scope.boton = "Actualizar";

        $scope.saveZona = function () {
            $scope.zona.usuario = {};
            $scope.zona.consejos_comunitario = [];
            zonaService.updateZona($scope.zona).then(function (response) {
                var index = _.indexOf($rootScope.zonas, _.find($rootScope.zonas, {
                    id: $scope.zona.id
                }));
                $rootScope.zonas.splice(index, $scope.zona.id, $scope.zona);
                toastr.success('Exito', 'Zona actualizada');
                $location.path('/app/zona');
            });
        };

	}])
