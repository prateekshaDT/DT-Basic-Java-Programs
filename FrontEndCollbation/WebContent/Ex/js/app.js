
var app = angular.module('myApp', ['ngRoute' , 'ngCookies']);



app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'col/home/index.html'/*,
    	controller : 'HomeController'*/
   
  })

  .when('/', {
    templateUrl : 'col/home/home.html'/*,
    	controller : 'HomeController'*/
   
  })
  
  .when('/blog', {
    templateUrl : 'col/blog/blog.html',
    	controller : 'BlogController'
   
  })

  .when('/contact', {
    templateUrl : 'col/contact/contact.html'/*,
    controller : 'ContactController'*/
   
  })
  
   .when('/about', {
    templateUrl : 'col/about/about.html'
   
  })
  
  .when('/login', {
    templateUrl : 'col/login/login.html',
    controller : 'LoginController'
   
  })
  
  .when('/logout', {
    templateUrl : 'col/login/logout.html',
    controller : 'LogoutController'
   
  })
  
  .when('/register', {
    templateUrl : 'col/register/register.html',
    controller : 'RegisterController'
   
  })

  .otherwise({redirectTo: '/'});
});

