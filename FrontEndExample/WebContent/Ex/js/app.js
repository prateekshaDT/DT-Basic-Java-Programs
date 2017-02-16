
var app = angular.module('myApp', ['ngRoute']);



app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'Ex/view/home.html',
    	controller : 'HomeController'
   
  })

  .when('/blog', {
    templateUrl : 'Ex/view/blog.html',
    	controller : 'BlogController'
   
  })

  .when('/contact', {
    templateUrl : 'Ex/view/contact.html',
    controller : 'ContactController'
   
  })
  
   .when('/about', {
    templateUrl : 'Ex/view/about.html'
   
  })

  .otherwise({redirectTo: '/'});
});

