<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form:form action="rgurl" method="post" modelAttribute="per">
<form:label path="pid">Enter Pid:</form:label>
<form:input path="pid"/>
<br><br>
<form:label path="pname">Enter PersonName:</form:label>
<form:input path="pname"/>
<br><br>
<form:label path="mobilenumber">Enter MobileNumber</form:label>
<form:input path="mobilenumber"/>
<br><br>
<form:label path="gender">select your gender</form:label>
<form:radiobutton path="gender" value="male"/>Male
<form:radiobutton path="gender" value="female"/>Female
<br><br>
<form:label path="address">Enter your address:</form:label>
<form:input path="address" rows="3" col="4"/>
<br><br>
<form:label path="qualification">select your qualification:</form:label>
<form:select path="qualification">
<form:option value="select">select</form:option>
<form:option value="MCA">MCA</form:option>
<form:option value="B.Tech">B.Tech</form:option>
<form:option value="BCA">BCA</form:option>
</form:select>
<br><br>
<form:label path="hobbies">Hobbies: </form:label>
<form:checkbox path="hobbies" value="swiming"/>swiming
<form:checkbox path="hobbies" value="cycling"/>cycling
<form:checkbox path="hobbies" value="running"/>running
<form:checkbox path="hobbies" value="jumping"/>jumping
<br><br>
<form:label path="date">enter date:</form:label>
<form:input path="date" type="date"/>
<br><br>
<form:label path="email">enter a email</form:label>
<form:input path="email" type="email"/>
<br><br>
<input type="submit" value="Register"/>
</form:form>
</center>
</body>
</html>

