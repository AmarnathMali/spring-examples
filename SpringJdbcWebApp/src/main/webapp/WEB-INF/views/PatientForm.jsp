<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Patient</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Patient</h1>
        <form:form action="savePatient" method="post" modelAttribute="contact">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Patient Name:</td>
                <td><form:input path="patientname" /></td>
            </tr>
            <tr>
                <td>Blood Group:</td>
                <td><form:input path="bloodgroup" /></td>
            </tr>
            <tr>
                <td>Disease:</td>
                <td><form:input path="disease" /></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>