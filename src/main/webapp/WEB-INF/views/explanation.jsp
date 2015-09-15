<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<body>
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

<h2>Here is the reason</h2>

I am feeling ${ mood } because ${explanation}

<p>
<a href="/one">Maybe my mood has changed?</a>
</body>
</html>	