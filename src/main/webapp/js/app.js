var App = angular.module('App', [ 'ngRoute', 'controllers', 'services' ]);

App.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'views/agente/agente.html',
		controller : 'AgenteCtrl'
	})

	.when('/infracao', {
		templateUrl : 'views/infracoes/infracoes.html',
		controller : 'InfraCtrl'
	})
	
	.when('/create', {
		templateUrl : 'views/agente/cadastrarAgente.html',
		controller : 'AgenteCtrl'
	})

	.when('/editarAgente', {
		templateUrl : 'views/agente/editarAgente.html',
		controller : 'AgenteCtrl'
	})


	.when('/cadinfracao', {
		templateUrl : 'views/infracoes/cadastroInfracao.html',
		controller : 'InfraCtrl'//,
	})

	   .when('/veiculos', {
		templateUrl : 'views/Veiculos/veiculos.html',
		controller : 'VeiculosCtrl'//,
	})
		.when('/cadveiculos', {
		templateUrl : 'views/Veiculos/cadastroVeiculos.html',
		controller : 'VeiculosCtrl'//,
	})
	
	
	   .when('/propri', {
		templateUrl : 'views/proprietario/proprietario.html',
		controller : 'PropriCtrl'//,
	})
	
		.when('/cadpropri', {
		templateUrl : 'views/proprietario/cadastroproprietario.html',
		controller : 'PropriCtrl'//,
	})
	

});

App.value('API', 'http://localhost:8080/primefaces-app/service/');