App.controller('AgenteCtrl', function($scope, AgenteService, $route,$routeParams,$location,EnvioService){
	$scope.agente = [];
	$scope.agenteEditar = {};

	$scope.notFound = false;
	AgenteService.list().then(function(data){
		
		$scope.agente = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.agenteEditar = EnvioService.getParametro();
	
	$scope.deletar = function(id){
		AgenteService.remover(id).then(function(id) {
			$route.reload();
			
		})
	}
	
	$scope.editar = function(item){
		$scope.agenteEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarAgente');
	}

	/*$scope.create = function(agenteEditar){
		console.log("Ta chegando aqui brother")
		
		AgenteService.salvar(agente).then(function(data){
				$location.path('/');
			});
	}*/
	
	
	$scope.cadastrar = function(agente){
		console.log("CHEAASDASD");
		var data = {
			nome: agente.nome,
			dtContratacao: agente.dtContratacao,
			tempoServico: agente.tempoServico
		};

		AgenteService.create(data).then(function(data){
			$location.path('/');
		});
	}
	
	
	$scope.atualizar = function(agente){
		AgenteService.update(agente).then(function(data){
				$location.path('/');
			});
	}
	
});