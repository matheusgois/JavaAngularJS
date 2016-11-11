App.controller('PropriCtrl', function($scope, ProprietarioService, $route,$routeParams,$location,EnvioService){
	$scope.proprietario = [];
	$scope.proprietarioEditar = {};

	$scope.notFound = false;
	ProprietarioService.list().then(function(data){
		
		$scope.proprietario = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.proprietarioEditar = EnvioService.getParametro();
	
	$scope.deletar = function(id){
		ProprietarioService.remover(id).then(function(id) {
			$route.reload();
			
		})
	}
	
	$scope.editar = function(item){
		$scope.proprietarioEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarProprietario');
	}

	/*$scope.create = function(agenteEditar){
		console.log("Ta chegando aqui brother")
		
		AgenteService.salvar(agente).then(function(data){
				$location.path('/');
			});
	}*/
	
	
	$scope.cadastrar = function(proprietario){
		console.log("CHEAASDASD");
		var data = {
			nome: proprietario.nome,
		};

		ProprietarioService.create(data).then(function(data){
			$location.path('/');
		});
	}
	
	
	$scope.atualizar = function(proprietario){
		ProprietarioService.update(proprietario).then(function(data){
				$location.path('/');
			});
	}
	
});