var controllerModule = angular.module('AppControllers');

controllerModule
	.controller('zonaController', ['$scope', 'zonaService',
    '$stateParams', '$rootScope',
    function ($scope, zonaService, $stateParams, $rootScope) {
			$rootScope.zonas = [];
			$rootScope.getAllZonas = function () {
				zonaService.getAllZona().then(function (response) {
					$rootScope.zonas = response.data;

				});

			};

			$rootScope.getAllZonas();


    }])
	.controller('zonaDetalleController', ['$scope', 'zonaService',
    '$stateParams', '$location', 'toastr', '$rootScope',
	function ($scope, zonaService, $stateParams, $location, toastr, $rootScope) {

			$scope.getZona = function (zonaId) {
				zonaService.getZonaById(zonaId).then(function (response) {
					$scope.zona = response.data;

				}, function (response) {
					console.log(response);
					$location.path('/app/zona');
				});
			};

			$scope.getZona(parseInt($stateParams.zonaId));
			//Metodo para eliminar la Zona
			$scope.removeZona = function (zonaId) {
				zonaService.deleteZona(zonaId).then(function (response) {
					$rootScope.getAllZonas();
					$location.path('/app/zona');
					toastr.success('Exito', 'Zona eliminada');

				}, function (response) {
					console.log(response);
					$location.path('/app/zona');
				});
			};

	}])
	.controller('zonaCrearController', ['$scope', 'zonaService', '$stateParams', '$location', 'toastr', '$rootScope',
		function ($scope, zonaService, $stateParams, $location, toastr, $rootScope) {
			$scope.titulo = "Crear nueva zona";
			$scope.boton = "Guardar";
			$scope.saveZona = function () {
				zonaService.createZona($scope.zona).then(function () {
					$rootScope.getAllZonas();
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
					$rootScope.getAllZonas();
					toastr.success('Exito', 'Zona actualizada');
					$location.path('/app/zona');


				});
			};

	}])
