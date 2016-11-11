App.factory('InfracaoService', function($http, API){
	return {
		list: function(){
			return $http.get(API+'Infracao');
		},
		create: function(item){
			return $http.post(API+'Infracao', item);
		},
		update: function(item){
			return $http.put(API+'Infracao', item);	
		},
		remover: function(id){
			return $http.delete(API+'Infracao/'+id);
		}
	}
})