<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${productList}" var="product">
	<div class="item">
		<div class="row">
			<div class="col-sm-7">

				<img class="img-responsive"
					src="<c:url value="/resources/img/productImages/${product.id}.jpg"/>"
					alt="">


			</div>
			<div class="col-sm-5">
				<h1>${product.name}</h1>
				<a href="<c:url value='/product/get/${product.id}'/>"> Price:
					Rs.${product.price} </a><br>
					<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
				<br> <a href="<c:url value="/usercart/cart/addItem/${product.id}"/>">Add
					to Cart</a> <br>
				<button>Buy</button>
				</c:if>
			</div>
		</div>
	</div>
</c:forEach>