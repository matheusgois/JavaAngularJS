App.controller('PropriCtrl', function($scope, proprietarioService, $route,$routeParams,$location,EnvioService){
	$scope.proprietario = [];
	$scope.proprietarioEditar = {};

	$scope.notFound = false;
	proprietarioService.list().then(function(data){
		$scope.proprietario = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.proprietarioEditar = EnvioService.getParametro();
	
	$scope.deletar = function(id){
		proprietarioService.remover(id).then(function(id) {
			$route.reload();
			
		})
	}
	
	$scope.editar = function(item){
		$scope.proprietarioEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarproprietario');
	}

	/*$scope.create = function(proprietarioEditar){
		console.log("Ta chegando aqui brother")
		
		proprietarioService.salvar(proprietario).then(function(data){
				$location.path('/');
			});
	}*/
	
	
	$scope.cadastrarproprietario = function(proprietario){
		console.log(proprietario);
		var data = {
			idlocal: proprietario.idlocal,
			idtipo:  proprietario.idtipo,
			placa:   proprietario.placa,
			velocidade:proprietario.velocidade
		};

		proprietarioService.create(data).then(function(data){
			$location.path('/');
		});
	}
	
	$scope.atualizar = function(proprietario){
		proprietarioService.update(proprietario).then(function(data){
				$location.path('/');
			});
	}
	
});