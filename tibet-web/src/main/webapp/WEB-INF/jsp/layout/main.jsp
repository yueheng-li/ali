<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring Boot with Apache Tiles</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<script type="text/javascript"
	src="js/jquery-1.7.2.min.js"></script>
</head>
<body>
	<header role="banner">
		<tiles:insertAttribute name="header" />
	</header>
	<div id="container">
		<div id="errors">
			<tiles:insertAttribute name="errors" />
		</div>
		<div id="main">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<footer role="contentinfo">
		<tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>