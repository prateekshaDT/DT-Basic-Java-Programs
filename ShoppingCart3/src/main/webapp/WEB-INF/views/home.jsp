<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="login">Login</a>
<c:if test="${showLoginpage}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>
<br>
<a href="registration">Registration</a>
<c:if test="${showRegistrationpage}">
<jsp:include page="registration.jsp"></jsp:include>
</c:if>

</body>
</html>