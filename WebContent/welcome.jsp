<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/main.css" />
<title>welcome page</title>
</head>
<body>
	<%
		/* if (session.getAttribute("user") == null) {
			response.sendRedirect("/login.jsp");
		} */
	%>

	<div id="main" align="center">
		<div id="content">
			<div id="menu">
				<ul>
					<li class="inline"><button class="btn btn-primary">Home</button></li>
					<li class="inline"><div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" type="button"
								data-toggle="dropdown">
								Dropdown Example <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li><a href="">account summery</a></li>
								<li><a href="#">trainsaction details</a></li>
							</ul>
						</div></li>
					<li class="inline"></li>
				</ul>
			</div>
			<div id="">
				<iframe src="home.jsp" name="contentFrame" frameborder="0" class="img-rounded"></iframe>
			</div>
			<h1>welcome page</h1>
			<a href="logout">logout</a>
		</div>
	</div>
</body>
</html>