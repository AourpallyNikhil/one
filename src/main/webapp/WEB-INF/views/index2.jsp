<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<style>
h2 {
    background-color:blue;
    color:white;
    text-align:center;
    padding:5px;
}
 
</style>
</head>
<body>
<h2>Hello World!</h2>
<p>
I am feeling: ${ mood.feeling }.
</p>
</body>
</html>