<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
html{

	height:100%;
	min-height:25cm;
	width:100%;
     
}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>Shoplist A Ecommerce Category Flat Bootstrap Responsive  Website Template | Login :: w3layouts</title>
<link href="resource/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="resource/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="resource/css/style.css" rel="stylesheet" type="text/css" media="all"/>
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

</head>
<body>
<div class="header">
	<div class="container">
	<div class="row">
	<div class="col-sm-4">
	<div class="social pull-left">
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
					    </nav>
					 </div>   
					 </div>
					 </div>
					 </div>
				</div>
			</div>		 
			</div>
		</div>			 
					 
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
					 
					     							 
					        
					        	    <li><a href="index">HOME</a></li> 
					        	   <li><a href="contact">CONTACT</a></li>
					        	   
					        	   <li><a href="loginPage">LOGIN</a></li>
					        	   
					 <ul></ul>       
					<c:choose>
					<c:when test="${pageContext.request.userPrincipal.name != null}">
						<li class="grid"><a class="color2"
							href="<c:url value="/j_spring_security_logout"/>">SIGN OUT</a>
					</c:when>
			 
				</c:choose>
					        	<ul></ul>
					        	
                                        <c:choose>
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													
														<li><a href="<c:url value='/categories'/>">CATEGORY</a></li>
														<li><a href="<c:url value="/suppliers"/>">SUPPLIER</a></li>
														<li><a href="<c:url value="/products"/>">PRODUCT</a></li>
													</c:if>
													
													<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													    
													    <li class="grid"><a class="color2" href="<c:url value="/j_spring_security_logout"/>">SIGN OUT</a>
												
													    
													</c:if>
													</c:when>
													
													
											</c:choose>
					       
					        	   
					        	   
					        	<ul> </ul>
						        </li>
						         <li class="dropdown"></li>
				<!-- 		        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Kids<b class="caret"></b></a> -->
						        	<c:forEach items="${categoryList}" var="category">
						        
				<li class="dropdown"><a  href="${category.name}" class="dropdown-toggle" data-toggle="dropdown" >${category.name}<b class="caret"></b></a>
				     <ul></ul>
				     
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
								            <ul class="multi-column-dropdown">
								            
								            <div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
									 </div>
					 </div>
					  </div>	
					   </div>
					    </div>
					     </div>		            
										         <c:forEach items="${category.products}" var="product"><br>

						<li class="grid"><a class="color2" href="<c:url value='product/get/${product.id}' />">${product.name}</a></li>

					</c:forEach>  
									            </ul></c:forEach>
								            </div>
								    </div> 
								            
								            </nav></div>
								            
							            </div>
						           
			<ul></ul>	
					 
				</div>
			</div>
	<!-- 	
</div>
</div>
</div>
		 -->	
		


<div class="clearfix"></div>

</body>
</html>     