App.factory('PropriCtrl', function($http, API){
	return {
		list: function(){
			return $http.get(API+'Proprietario');
		},
		create: function(item){
			return $http.post(API+'Proprietario', item);
		},
		update: function(item){
			return $http.put(API+'Proprietario', item);	
		},
		remover: function(id){
			return $http.delete(API+'Proprietario/'+id);
		}
	}
})