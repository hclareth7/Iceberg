var controllerModule = angular.module('AppControllers');

controllerModule
	.controller('zonaController', ['$scope', 'zonaService',
    '$stateParams',
    function ($scope, zonaService, $stateParams) {
			$scope.zonas = [];
			$scope.getAllZonas = function () {
				zonaService.getAllZona().then(function (response) {
					console.log(response.data);
					$scope.zonas = response.data;

				});

			};

			//$scope.getAllZonas();
			//

    }])
	.controller('zonaDetalleController', ['$scope', 'zonaService',
    '$stateParams', '$location',
	function ($scope, zonaService, $stateParams, $location) {

			$scope.getZona = function (zonaId) {
				zonaService.getZonaById(zonaId).then(function successCallBack(response) {
					$scope.zona = response.data;
					console.log(response.data);

				}, function errorCallBack(response) {
					console.log(response);
					$location.path('/app/zona');
					console.log($location);
				});
			};

			$scope.getZona(parseInt($stateParams.zonaId));

	}])
	.controller('zonaCrearController', ['$scope', 'zonaService', '$stateParams', '$location',
		function ($scope, zonaService, $stateParams, $location) {

	}])
	