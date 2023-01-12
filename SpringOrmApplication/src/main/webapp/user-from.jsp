<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="Header.jsp" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Management App</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<br>

	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">

				<c:if test="${book != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${book == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${book != null}">
            			Edit Book
            		</c:if>
						<c:if test="${book == null}">
            			Add New Book
            		</c:if>
					</h2>
				</caption>

				<c:if test="${book != null}">
					<input type="hidden" name="id" value="<c:out value='${book.id}' />" />
				</c:if>
				<fieldset class="form-group">
					<label><b>Book Name</b></label> <input type="text"
						value="<c:out value="${book.bname}" />" class="form-control"
						name="bname" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Author Name</b></label> <input type="text"
						value="<c:out value="${book.aname}" />" class="form-control"
						name="aname">
				</fieldset>

				<fieldset class="form-group">
					<label><b>Price(in $)</b></label> <input type="text"
						value="<c:out value="${book.price}"/>" class="form-control"
						name="price">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>


			</div>
		</div>
	</div>

</body>
</html>