<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>

<style type="text/css">

.form-group input{
	width:50%;
}
</style>

<!DOCTYPE HTML>
<html>
<head>
<!-- Latest compiled and minified CSS -->
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
<link href="src/main/webapp/WEB-INF/views/index.jsp" link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
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


		<div id="content">
			<div class="container">


			

			<section>
					<h2 class="text-uppercase">Category</h2>


					<hr>

					<!-- LOOK HERE -->

					<h3>Add a Category</h3>

					<c:url var="addAction" value="/category/add"></c:url>

					<form:form action="${addAction}" commandName="category">


						<div class="form-group">
							<c:choose>
								<c:when test="${!empty category.id}">

									<div class="form-group">
										<label for="name">ID</label>
										<div class="controls docs-input-sizes">
											<form:input placeholder="id" path="id" required="true"
												class="form-control" id="id" disabled="true" readonly="true" />
										</div>
									</div>

								</c:when>

								<c:otherwise>

									<div class="form-group">
										<form:input path="id" hidden="true" />
										<label for="id">ID</label>
										<div class="controls docs-input-sizes">
											<form:input placeholder="id" path="id" required="true"
												class="form-control" id="id"
												title="id should contains 6 to 7 characters"
												patttern=".{6,7}" />
										</div>
									</div>

								</c:otherwise>
							</c:choose>

						</div>

						<div class="form-group">
							<form:input path="id" hidden="true" />
							<label for="name">Name</label>
							<div class="controls docs-input-sizes">
								<form:input placeholder="name" path="name" required="true"
									class="form-control" id="name" />
							</div>
						</div>

						<div class="form-group">
							<label for="description">Description</label>
							<div class="controls docs-input-sizes">
								<form:input placeholder="description" path="description"
									class="form-control" id="description" />
							</div>
						</div>



						<div class="form-group">
							<div class="controls docs-input-sizes">
								<c:if test="${!empty category.name}">

									<button type="submit" class="btn btn-template-main pull-left">
										<i class="fa fa-user-md"></i> Edit Category
									</button>
								</c:if>
								<c:if test="${empty category.name}">

									<button type="submit" class="btn btn-template-main pull-left">
										<i class="fa fa-user-md"></i> Add Category
									</button>
								</c:if>
							</div>
						</div>
					</form:form>
				
<br><br>

			
					<div class="all">
						<c:if test="${!empty categoryList}">
							<h3>Category List</h3>
							<table class="tg table-hover">
								<tr>
									<th width="80">Category ID</th>
									<th width="120">Category Name</th>
									<th width="120">Category description</th>
									<th width="60">Edit</th>
									<th width="60">Delete</th>
								</tr>
								<c:forEach items="${categoryList}" var="category">
									<tr>
										<td>${category.id}</td>
										<td>${category.name}</td>
										<td>${category.description}</td>
										<td><a
											href="<c:url value='category/edit/${category.id}' />">Edit</a></td>
										<td><a
											href="<c:url value='category/remove/${category.id}' />">Delete</a></td>
									</tr>
								</c:forEach>
							</table>
						</c:if>
						<br> <br> <br>
			</div>
			</section>
			</div>

		</div>
		</div>
		
<!--footer strat here-->
<%@include file="footer.jsp" %>
<!--footer end here-->
</body>
</html>