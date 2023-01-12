<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tile" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tile:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<center>
	<div>
	<div style="background-color:yellow"><tile:insertAttribute name ="header"/></div>
	<div style=" float: left; width: 15%; height:450px; background-color:green"><tile:insertAttribute name ="menu"/></div>
	<div style=" float: left; width: 85%; height:450px;background-color:pink"><tile:insertAttribute name ="body"/></div>
	<div style="background-color:blue"><tile:insertAttribute name ="footer"/></div>
	
	</div>
	
	</center>

</body>
</html>