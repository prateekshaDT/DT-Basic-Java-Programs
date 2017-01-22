<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>

<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>Shoplist A Ecommerce Category Flat Bootstrap Responsive  Website Template | Sign up :: w3layouts</title>
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
<!--header strat here-->
<%@include file="header.jsp" %>
<!--header end here-->

<!--sign in start here-->
<div class="signin">
	<div class="container">
		<div class="signin-main">
			<h1>Sign up</h1>
			<h2>Informations</h2>
			<div class="error" style="color: #ff0000;">${usernameError}${emailError}${userPhoneError }</div>
						
						
						<c:if test="${not empty message}">
								<div class="error" style="color: #ff0000;">${message}${usernameError}</div>
						</c:if>
						
					
			
			<form:form action="signup" method="post" commandName="usersDetail">
			
			    				
				<div class="form-group">
								<label for="fullname-signup">Full Name</label>
								
								<form:errors path="userFullName" cssStyle="color: #ff0000" />
								<div class="controls docs-input-sizes">
									<form:input type="text" placeholder="user full name" path="userFullName" class="form-control" id="userFullName" />
								</div> </div>



								<div class="form-group">
								<label for="name-signup">Name</label>
								
								<form:errors path="username" cssStyle="color: #ff0000" /> 
								<div class="controls docs-input-sizes">
									<form:input type="text" placeholder="user name" path="username" class="form-control" id="username" />
								</div> </div>


								<div class="form-group">
									<label for="name-signup">Phone</label>
									
									<div class="controls docs-input-sizes">
										<form:input type="text" placeholder="phone" path="userPhone" 
										class="form-control" id="phone-signup" max="10" />
									</div>
								</div>


								
								<div class="form-group">
									<label for="email-signup">Email</label>
									
									<form:errors path="userEmail" cssStyle="color: #ff0000" />
									<div class="controls docs-input-sizes">
										<form:input placeholder="email" path="userEmail" 
										class="form-control" id="email-signup" />
									</div>
								</div>

								


								<div class="form-group">
									<label for="password-signup">Password</label>
									
									<form:errors path="password" cssStyle="color: #ff0000" />
									<div class="controls docs-input-sizes">
										<form:input type="password" path="password" class="form-control"
											placeholder="password" id="password-signup" min="7" max="15" />
									</div>
								</div>


								<div class="form-group">
								<div class="text-center">
									<button type="submit" class="btn btn-template-main pull-left">
										<i class="fa fa-user-md"></i> Register
									</button>
								</div></div>
								
								<div class="form-group">
								<div class="text-center">
									<button type="reset" class="btn btn-template-main"
										value="Reset">Clear</button>
								</div></div>
							

			</form:form>
		</div>
	</div>
</div>
<!--sign in end here-->
<!--footer strat here-->
<%@include file="footer.jsp" %>
<!--footer end here-->
</body>
</html>