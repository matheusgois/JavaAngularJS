App.controller('VeiculosCtrl', function($scope, VeiculosService, $route,$routeParams,$location,EnvioService){
	$scope.Veiculos = [];
	$scope.VeiculosEditar = {};

	$scope.notFound = false;
	VeiculosService.list().then(function(data){
		$scope.Veiculos = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.VeiculosEditar = EnvioService.getParametro();
	
	$scope.deletar = function(id){
		VeiculosService.remover(id).then(function(id) {
			$route.reload();
			
		})
	}
	
	$scope.editar = function(item){
		$scope.VeiculosEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarVeiculos');
	}

	/*$scope.create = function(VeiculosEditar){
		console.log("Ta chegando aqui brother")
		
		VeiculosService.salvar(Veiculos).then(function(data){
				$location.path('/');
			});
	}*/
	
	
	$scope.cadastrarVeiculos = function(Veiculos){
		console.log(Veiculos);
//		var data = {
//			idlocal: Veiculos.idlocal,
//			idtipo:  Veiculos.idtipo,
//			placa:   Veiculos.placa,
//			velocidade:Veiculos.velocidade
//		};
//
//		VeiculosService.create(data).then(function(data){
//			$location.path('/');
//		});
	}
	
	$scope.atualizar = function(Veiculos){
		VeiculosService.update(Veiculos).then(function(data){
				$location.path('/');
			});
	}
	
});