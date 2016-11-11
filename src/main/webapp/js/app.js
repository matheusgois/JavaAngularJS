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
		//controller : 'AgenteCtrl'
	})

	   .when('/veiculos', {
		templateUrl : 'views/Veiculos/veiculos.html',
		controller : 'VeiculosCtrl'//,
		//controller : 'AgenteCtrl'
	})
		.when('/cadveiculos', {
		templateUrl : 'views/Veiculos/cadastroVeiculos.html',
		controller : 'VeiculosCtrl'//,
		//controller : 'AgenteCtrl'
	})
	
	
	   .when('/propri', {
		templateUrl : 'views/proprietario/proprietario.html',
		controller : 'PropriCtrl'//,
		//controller : 'AgenteCtrl'
	})
	
		.when('/cadpropri', {
		templateUrl : 'views/proprietario/cadastroproprietario.html',
		controller : 'PropriCtrl'//,
		//controller : 'AgenteCtrl'
	})
	

});

App.value('API', 'http://localhost:8080/primefaces-app/service/');