App.controller('InfraCtrl', function($scope, InfracaoService, $route,$routeParams,$location,EnvioService){
	$scope.infracao = [];
	$scope.infracaoEditar = {};

	$scope.notFound = false;
	InfracaoService.list().then(function(data){
		console.log("Ta chegando aqui man")
		$scope.infracao = data.data;
		console.log("Ta chegando ao infracao")
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.infracaoEditar = EnvioService.getParametro();
	
	$scope.deletar = function(id){
		InfracaoService.remover(id).then(function(id) {
			$route.reload();
			
		})
	}
	
	$scope.editar = function(item){
		$scope.infracaoEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarinfracao');
	}

	
	
	$scope.cadastrarInfracao = function(infracao){
		console.log(infracao);
		var data = {
			idlocal: infracao.idlocal,
			idtipo:  infracao.idtipo,
			placa:   infracao.placa,
			velocidade:infracao.velocidade
		};

		InfracaoService.create(data).then(function(data){
			$location.path('/');
		});
	}
	
	$scope.atualizar = function(infracao){
		InfracaoService.update(infracao).then(function(data){
				$location.path('/');
			});
	}
	
});