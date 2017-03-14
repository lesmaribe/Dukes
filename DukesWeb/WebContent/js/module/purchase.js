/**
 * @author LESETJA
 * @email lesmaribe@gmail.com
 */

var purchaseModule = angular.module('dukes.purchasemodule', []);

purchaseModule.controller('PurchaseCtrl', ['$scope', '$rootScope', '$location', function($scope, $rootScope, $location){
	console.log('purchase module loaded...');
	
	$scope.grandtotal = calulateTotal();
	
	$scope.pay = function (){
		console.log('paid...');
		$rootScope.cart = [];
		$location.path('/home');
	};
	
	function calulateTotal(){
		var total = 0;
		for(var book of $rootScope.cart){
			total += (book.price * book.copies);
		}
		return total;
	};
}]);