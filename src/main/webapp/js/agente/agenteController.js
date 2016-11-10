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
	
	$scope.remove = function(deletarId, index){
		console.log('deletando');
		/*
		$http.get("AgenteService" + deletarId)
        .success(function(data){
            $scope.data.splice(index, 1);
        })*/
		
		
		//AgenteService.delete(id).then(function(data){
		//	console.log(data);
			//$route.reload();
	//	});	
	}
	
	$scope.editar = function(item){
		$scope.agenteEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarAgente');
	}

	$scope.atualizar = function(agenteEditar){
		console.log("Ta chegando aqui brother")
		var data = {
			nome: agenteEditar.nome,
			dtContratacao: agenteEditar.dtContratacao,
			tempoServico: agenteEditar.tempoServico
		};
		AgenteService.update(agente).then(function(data){
				$location.path('/');
			});
	}
	
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
	
});