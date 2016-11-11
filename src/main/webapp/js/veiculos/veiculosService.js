App.factory('VeiculosService', function($http, API){
	return {
		list: function(){
			return $http.get(API+'Veiculos');
		},
		create: function(item){
			return $http.post(API+'Veiculos', item);
		},
		update: function(item){
			return $http.put(API+'Veiculos', item);	
		},
		remover: function(id){
			return $http.delete(API+'Veiculos/'+id);
		}
	}
})