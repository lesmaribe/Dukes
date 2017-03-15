/**
 * @author LESETJA
 * @email lesmaribe@gmail.com
 */

var app = angular.module('dukes', ['ngRoute', 'dukes.homemodule', 'dukes.bookcataloguemodule', 'dukes.purchasemodule']);

app.run(function($rootScope){
	$rootScope.cart = [];
	
	$rootScope.back = function(){
		 window.history.back();
	};
});

app.config(function($routeProvider){
	$routeProvider.when('/home', {templateUrl: 'views/home.html', controller: 'HomeCtrl'});
	$routeProvider.when('/viewcatalogue', {templateUrl: 'views/bookcatalogue.html', controller: 'BookCatalogueCtrl'});
	$routeProvider.when('/purchase', {templateUrl: 'views/purchase.html', controller: 'PurchaseCtrl'});
	/*$routeProvider.when('/assess', {templateUrl: 'views/assess.html', controller: 'AssesCtrl'});
	$routeProvider.when('/viewassessment', {templateUrl: 'views/viewassessment.html', controller: 'ViewAssesCtrl'});*/
	$routeProvider.otherwise({redirectTo: '/home'});
});