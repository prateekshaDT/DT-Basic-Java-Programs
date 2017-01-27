
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<!-- <script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
 -->
<!-- <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
 -->

<!DOCTYPE html>
<html>
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
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not (.active ) {
	background-color: #111;
}

.active {
	background-color: #4CAF50;
}
p{text-align:"center"}
</style>
</head>


<ul>

	<li><a class="active" href="<c:url value="/products"/>">PRODUCT</a></li>
	<ul>

	<div class=" h_menu4">
			<ul class="memenu skyblue">

				<li><a class="color4" href="<c:url value="/"/>">LOGIN</a></li>
				<li><a class="color6" href="contact">CONTACT</a></li>

				<c:choose>
					<c:when test="${pageContext.request.userPrincipal.name != null}">
						<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">

							<li><a class="color2" href="<c:url value='/categories'/>">CATEGORY</a></li>

							<li><a class="color2" href="<c:url value="/products"/>">PRODUCT</a></li>
							<li><a class="active" href="<c:url value="/suppliers"/>">SUPPLIER</a></li>



						</c:if>
						<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
							<li><a class="color2" href="<c:url value="/user/cart"/>">CART</a></li>





						</c:if>
					</c:when>

					<c:otherwise>



					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${pageContext.request.userPrincipal.name != null}">
						<li class="grid"><a class="color2"
							href="<c:url value="/j_spring_security_logout"/>">SIGN OUT</a>
					</c:when>
					<c:otherwise>
					</c:otherwise>
				</c:choose>
			</ul>



			<div>
</ul>

</ul>
</head>
<body>

	<h3>PRODUCT DETAILS</h3>
	<div id="all">
		<div id="heading-breadcrumbs">
			<div class="container">
				<div class="row">
					<div class="col-md-7">
						<div class="col-md-5">
							<ul class="breadcrumb">
								<%-- <li><a href="<c:url value="/"/>">Home</a></li> --%>
								<li>${selectedProduct.name}</li>
							</ul>

						</div>
					</div>

				</div>
			</div>
		</div>
		<c:if test="${!empty selectedProduct.name}">
			<section class="bar background-gray no-mb padding-big text-center-sm">

				<div class="container">
					<div class="row">
						<div class="col-md-4">
							<!-- <h2 class="text-uppercase">Product details</h2> -->
							<p>
								<br>${selectedProduct.id} <br>${selectedProduct.name}
								<br>${selectedProduct.description} <br>Rs.${selectedProduct.price}
								<br>${selectedProduct.category.name} <br>${selectedProduct.supplier.name}

								<c:if
									test="${pageContext.request.userPrincipal.name != 'Admin'}">
									<p>
										<%-- <a href="<c:url value="${url}" />" class="btn btn-primary">Back</a> --%>
										<c:if
											test="${pageContext.request.userPrincipal.name  != 'Admin'}">
											<a href="<c:url value="/usercart/cart/addItem/${selectedProduct.id}"/>" class="btn btn-primary"><span
												class="glyphicon glyphicon-shopping-cart"></span>Add to cart
											</a>

											<a href="<spring:url value="/user/cart"/>"
												class="btn btn-primary"><span
												class="glyphicon glyphicon-hand-right"></span>View Cart</a>
										</c:if>
									</p>
								</c:if>
								<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
								<p>
										<a href="<c:url value="/product/edit/${selectedProduct.id}"/>" 
										class="btn btn-primary">Edit product
											</a>
											</p>			
								</c:if>
								<br>
								<br>
							
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

		<div data-role="footer" style="text-align:center;">
    
    <a href="index" class="ui-btn ui-corner-all ui-shadow ui-icon-plus ui-btn-icon-left">VIEW MORE PRODUCTS</a>
    <%@include file="/WEB-INF/views/footer.jsp"%>
   
  </div>

		

	</div>
	<!-- /#all -->




	<!-- #### JAVASCRIPT FILES ### -->
	<%@include file="/WEB-INF/views/scriptfiles.jsp"%>
</body>
</html>
