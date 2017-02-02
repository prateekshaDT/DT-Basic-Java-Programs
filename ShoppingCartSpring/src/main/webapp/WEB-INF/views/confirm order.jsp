<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<style> 
body {
    background-image: url("thankyou1.jpg"),url("thankyou1.jpg");
     
    background-color: #cccccc;
   
}

h2{
 text-align:"center";}
 a{
 text-color:"white"
 }
</style>
</head>
<body>
<BR><BR>
<h2> THANK YOU FOR SHOPPING</h2>
<br><br>
<a href="<c:url value="/index"/>"><h>CONTINUE SHOPPING</h1></a>

</body>
</html>
