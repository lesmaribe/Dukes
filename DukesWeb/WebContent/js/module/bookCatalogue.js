/**
 * @author LESETJA
 * @email lesmaribe@gmail.com
 */

var catalogueModule = angular.module('dukes.bookcataloguemodule', []);
console.log('book catalogue module loaded...')

catalogueModule.controller('BookCatalogueCtrl', ['$scope', '$location', '$rootScope', function($scope, $location, $rootScope){
	var books = [{'id': 1000, 'author_name': 'Lesetja', 'author_surname': 'Maribe', 'author_title': 'Mr', 'title': 'How to Program', 'price': 100.00, 'onSale': true, 'year': 2017, 
		'description': 'How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.', 'copies': 10},
		{'id': 1001, 'author_name': 'Lesetja', 'author_surname': 'Maribe', 'author_title': 'Mr', 'title': 'How to Program', 'price': 100.00, 'onSale': true, 'year': 2017, 
			'description': 'How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.', 'copies': 10},
			{'id': 1002, 'author_name': 'Lesetja', 'author_surname': 'Maribe', 'author_title': 'Mr', 'title': 'How to Program', 'price': 100.00, 'onSale': true, 'year': 2017, 
				'description': 'How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.', 'copies': 10},
				{'id': 1003, 'author_name': 'Lesetja', 'author_surname': 'Maribe', 'author_title': 'Mr', 'title': 'How to Program', 'price': 100.00, 'onSale': true, 'year': 2017, 
					'description': 'How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.', 'copies': 10},
					{'id': 1004, 'author_name': 'Lesetja', 'author_surname': 'Maribe', 'author_title': 'Mr', 'title': 'How to Program', 'price': 100.00, 'onSale': true, 'year': 2017, 
						'description': 'How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.', 'copies': 10}
	             ];
	$scope.books = books;
	
	$scope.addtocart = function(book){
		$rootScope.cart.push(book);
		console.log($rootScope.cart);
	};
	
//	$scope.back = function(){
//		 window.history.back();
//	};
	
	$scope.purchase = function(){
		$location.path('/purchase');
	};
	
	$scope.emptyCart = function(){
		$rootScope.cart = [];
	};
}]);