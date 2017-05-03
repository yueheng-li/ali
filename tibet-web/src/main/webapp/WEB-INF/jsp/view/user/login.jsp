<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form:form method="POST" action="/login" modelAttribute="form">
	<div>
		<label>Serial Number : <form:input path="serialNumber"/>
		</label>
	</div>
	<div>
		<input type="submit" value="login" />
	</div>
</form:form>
