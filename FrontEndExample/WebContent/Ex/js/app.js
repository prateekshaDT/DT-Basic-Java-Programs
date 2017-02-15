
var app = angular.module('myApp', ['ngRoute']);



app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'Ex/view/home.html'
   
  })

  .when('/blog', {
    templateUrl : 'Ex/view/blog.html'
   
  })

  .when('/contact', {
    templateUrl : 'Ex/view/contact.html'
   
  })
  
   .when('/about', {
    templateUrl : 'Ex/view/about.html'
   
  })

  .otherwise({redirectTo: '/'});
});

