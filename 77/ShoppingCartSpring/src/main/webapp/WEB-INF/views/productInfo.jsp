<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>Shoplist A Ecommerce Category Flat Bootstrap Responsive  Website Template | Home :: w3layouts</title>
<link href="resource/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="resource/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="src/main/webapp/WEB-INF/views/index.jsp"link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoplist Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Hind:400,500,300,600,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="resource/js/move-top.js"></script>
<script type="text/javascript" src="resource/js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
<script src="resource/js/simpleCart.min.js"> </script>
<script src="resource/js/bootstrap.min.js"></script>

<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: red;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}
</style>
</head>
<body>

<ul>
  <li><a class="active" href="#home">Home</a></li>
  
 
</ul>



<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>



	<div id="all">
		<div id="heading-breadcrumbs">
			<div class="container">
				<div class="row">
					<div class="col-md-7">
						<h1>Product details</h1>
					</div>
					<%-- <div class="col-md-5">
						<ul class="breadcrumb">
							<li><a href="<c:url value="/"/>">Home</a></li> --%>
							<li>${selectedProduct.name}</li>
						</ul>

					</div>
				</div>
			</div>
		</div>
		<c:if test="${!empty selectedProduct.name}">
			<section class="bar background-gray no-mb padding-big text-center-sm">

				<!-- <div class="container" ng-app="addToCartApp">
					<div class="row">
						<div class="col-md-4">
							<h2 class="text-uppercase">Product details</h2> -->
							<p>
								<br>${selectedProduct.id} <br>${selectedProduct.name}
								<br>${selectedProduct.description} <br>Rs.${selectedProduct.price}
								<br>${selectedProduct.category.name} <br>${selectedProduct.supplier.name}

								<c:if
									test="${pageContext.request.userPrincipal.name != 'Admin'}">
									<p ng-controller="addToCartCtrl">
										<a href="<c:url value="${url}" />" class="btn btn-primary">Back</a>
										<c:if
											test="${pageContext.request.userPrincipal.name  != 'Admin'}">
											<a href="#" class="btn btn-primary"
												ng-click="addItemToCart('${selectedProduct.id}')"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to cart
											</a>

											<a href="<spring:url value="/user/cart"/>"
												class="btn btn-primary"><span
												class="glyphicon glyphicon-hand-right"></span>View Cart</a>
										</c:if>
									</p>
								</c:if>
								<script src="<c:url value="/resources/js/ordercontroller.js"/>"></script>




								<br>
								<br>
								<%-- <button type="button"
									ng-click="addItemToCart('${selectedProduct.id}')"
									class="btn btn-template-main">Add to Cart</button>
								<br>
								<br>
								<button class="btn btn-template-main">Buy</button> --%>
								<br>
							</p>
						</div>
						<div class="col-md-8 text-center">
							<img alt=""
								src="<c:url value="/resources/img/productImages/${selectedProduct.id}.jpg"/>" />
						</div>
					</div>
				</div>
			</section>
		</c:if>

		<%@include file="/WEB-INF/views/footer.jsp"%>

	</div>
	<!-- /#all -->




	<!-- #### JAVASCRIPT FILES ### -->
	<%-- <%@include file="/WEB-INF/views/scriptfiles.jsp"%> --%>
</body>
</html>
