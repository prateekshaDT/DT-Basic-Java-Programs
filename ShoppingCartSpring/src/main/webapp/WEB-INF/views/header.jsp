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
		
</div>
</div>
</div>
			
		


<div class="clearfix"></div>

</body>
</html>     