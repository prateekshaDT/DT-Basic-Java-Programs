<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<div class="header">
	<div class="container">
		<div class="header-main">
			<div class="top-nav">
				<div class="content white">
	              <nav class="navbar navbar-default" role="navigation">
					    <div class="navbar-header">
					        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						        <span class="sr-only">Toggle navigation</span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
					        </button>
					        <div class="navbar-brand logo">
								<a href="index"><img src="resource/images/logo1.png" alt=""></a>
							</div>
					    </div>
					    
					  <!--   
					    <div class="search-box">
					<div id="sb-search" class="sb-search">
						<form action="#" method="post">
							<input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div> -->
				
				 <c:choose>
						<c:when test="${pageContext.request.userPrincipal.name != null}">

							<li>
							<li><h4>
									<a>hello, ${pageContext.request.userPrincipal.name}</a>
								</h4></li>
							<li>
						</c:when>
					</c:choose>
					    
					    <!--/.navbar-header-->
					 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					        <ul class="nav navbar-nav">
					 
									 
					        
					        	    <li><a href="index">Home</a></li> 
					        	   <li><a href="contact">Contact</a></li>
					        	   
					        	   <li><a href="loginPage">Login</a></li>
					        	   
					        
					        	
					        	<%-- <c:choose>
						<c:when test="${pageContext.request.userPrincipal.name != null}">

							<li>
							<li><h4>
									<a>hello, ${pageContext.request.userPrincipal.name}</a>
								</h4></li>
							<li>
						</c:when>
					</c:choose>
					 --%>
					<c:choose>
					<c:when test="${pageContext.request.userPrincipal.name != null}">
						<li class="grid"><a class="color2"
							href="<c:url value="/j_spring_security_logout"/>">Sign Out</a>
					</c:when>
			 
				</c:choose>
					        	
					        	
                                        <c:choose>
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													
														<li><a href="<c:url value='/categories'/>">Category</a></li>
														<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
														<li><a href="<c:url value="/products"/>">Product</a></li>
													</c:if>
													
													<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													    
													    <li class="grid"><a class="color2" href="<c:url value="/j_spring_security_logout"/>">SIGN OUT</a>
												
													    
													</c:if>
													</c:when>
													
													<%-- <c:otherwise>
													
														<li><a href="<c:url value="/register"/>">Register</a></li>
														<li><a href="<c:url value="/loginPage"/>">Login</a></li>
													
													</c:otherwise> --%>
											</c:choose>
					        	   
					        	   
					        	   <div class="head-signin">
						<!-- <h5><a href="loginPage"><i class="nav navbar-nav"></i>Login</a></h5> -->
					</div> 
						             <li class="dropdown">
						        	<!-- <a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m">Accessories</a></li>
										            <li><a href="product-m">Bags</a></li>
										            <li><a href="product-m">Cap & Hats</a></li>
										            <li><a href="product-m">Tops</a></li>
										            <li><a href="product-m">Jackets & Coats</a></li>
										            <li><a href="product-m">wallets</a></li>
										            <li><a href="product-m">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m">Shirts</a></li>
										            <li><a href="product-m">Shoes,Boots</a></li>
										            <li><a href="product-m">Shorts</a></li>
										             <li><a href="product-m">Watches</a></li>
										            <li><a href="product-m">Sunglasses</a></li>
										             <li><a href="product-m">Bands</a></li>
										            <li><a href="product-m">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m">Jewellery</a></li>
										            <li><a href="product-m">Jack & Jones</a></li>
										            <li><a href="product-m">Ray-Ban</a></li>
										             <li><a href="product-m">Lipsticks</a></li>
										            <li><a href="product-m">Longer wear</a></li>
										            <li><a href="product-m">sarees</a></li>
										            <li><a href="product-m">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
						            <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Women <b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product">Accessories</a></li>
										            <li><a href="product">Bags</a></li>
										            <li><a href="product">Cap & Hats</a></li>
										            <li><a href="product">Tops</a></li>
										            <li><a href="product">Jackets & Coats</a></li>
										            <li><a href="product">wallets</a></li>
										            <li><a href="product">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product">Shirts</a></li>
										            <li><a href="product">Shoes,Boots</a></li>
										            <li><a href="product">Shorts</a></li>
										             <li><a href="product">Watches</a></li>
										            <li><a href="product">Sunglasses</a></li>
										             <li><a href="product">Bands</a></li>
										            <li><a href="product">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product">Jewellery</a></li>
										            <li><a href="product">Jack & Jones</a></li>
										            <li><a href="product">Ray-Ban</a></li>
										             <li><a href="product">Lipsticks</a></li>
										            <li><a href="product">Longer wear</a></li>
										            <li><a href="product">sarees</a></li>
										            <li><a href="product">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
						         <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Kids<b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k">Accessories</a></li>
										            <li><a href="product-k">Bags</a></li>
										            <li><a href="product-k">Cap & Hats</a></li>
										            <li><a href="product-k">Tops</a></li>
										            <li><a href="product-k">Jackets & Coats</a></li>
										            <li><a href="product-k">wallets</a></li>
										            <li><a href="product-k">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k">Shirts</a></li>
										            <li><a href="product-k">Shoes,Boots</a></li>
										            <li><a href="product-k">Shorts</a></li>
										             <li><a href="product-k">Watches</a></li>
										            <li><a href="product-k">Sunglasses</a></li>
										             <li><a href="product-k">Bands</a></li>
										            <li><a href="product-k">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k">Jewellery</a></li>
										            <li><a href="product-k">Jack & Jones</a></li>
										            <li><a href="product-k">Ray-Ban</a></li>
										             <li><a href="product-k">Lipsticks</a></li>
										            <li><a href="product-k">Longer wear</a></li>
										            <li><a href="product-k">sarees</a></li>
										            <li><a href="product-k">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
 -->						        					        </ul>
					    </div>
					    <!--/.navbar-collapse-->
					</nav>
					<!--/.navbar-->
				</div>
			</div>
			<!-- <div class="header-right">
				<div class="search">
					<div class="search-text">
					    <input class="serch" type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"/>
					</div> -->
					<!-- <div class="cart box_1">
						<a href="checkout">
						<h3>
							<img src="resource/images/cart.png" alt=""/>
							<div class="total">
							<span class="simpleCart_total"></span></div>
							</h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
					</div>     -->
					
					
					
                                     <%--    <c:choose>
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													
														<li><a href="<c:url value='/categories'/>">Category</a></li>
														<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
														<li><a href="<c:url value="/products"/>">Product</a></li>
													</c:if>
													
													<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													
													</c:if>
													</c:when>
													
													<c:otherwise>
													
														<li><a href="<c:url value="/register"/>">Register</a></li>
														<li><a href="<c:url value="/loginPage"/>">Login</a></li>
													
													</c:otherwise>
											</c:choose> --%>
					             
                     <div class="clearfix"> </div>					
				</div>
			</div>
		 <div class="clearfix"> </div>
		</div>
	</div>
</div>

</body>
</html>