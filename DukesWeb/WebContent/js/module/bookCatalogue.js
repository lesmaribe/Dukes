/**
 * @author LESETJA
 * @email lesmaribe@gmail.com
 */

var catalogueModule = angular.module('dukes.bookcataloguemodule', []);
console.log('book catalogue module loaded...')


catalogueModule.factory('bookFactory', ['$http', '$rootScope', function($http, $rootScope){
	var bookFactory = {};
	
	bookFactory.getBooks = function(){
		return $http.get($rootScope.urlBase + 'books');
	};
	
	bookFactory.getBook = function(id){
		return $http.get($rootScope.urlBase + id);
	};
	
	bookFactory.createBook = function(book){
		return $http.post($rootScope.urlBase, book);
	};
	
	bookFactory.updateBook = function(book){
		return $http.put($rootScope.urlBase, book);
	};
	
	return bookFactory;
}]);


catalogueModule.controller('BookCatalogueCtrl', ['$scope', '$location', '$rootScope', 'orderByFilter', 'bookFactory', 
                                                 function($scope, $location, $rootScope, orderBy, bookFactory){	
	getBooks();
	
	function getBooks(){
		bookFactory.getBooks().then(function(response){
			console.log(response.data);
			$scope.books = response.data;
		}, function(error){
			console.log(error.message);
		});
	};
	
	$scope.addtocart = function(book){
		$rootScope.cart.push(book);
		console.log($rootScope.cart);
	};
	
	$scope.purchase = function(){
		$location.path('/purchase');
	};
	
	$scope.emptyCart = function(){
		$rootScope.cart = [];
	};
}]);