App.factory('InfracaoService', function($http, API){
	return {
		list: function(){
			return $http.get(API+'infracao');
		},
		create: function(item){
			return $http.post(API+'infracao', item);
		},
		update: function(item){
			return $http.put(API+'infracao', item);	
		},
		remover: function(id){
			return $http.delete(API+'infracao/'+id);
		}
	}
})