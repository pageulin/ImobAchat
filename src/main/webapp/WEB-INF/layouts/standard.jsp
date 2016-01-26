<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="include_header" ignore="true"></tiles:insertAttribute>
	</head>
	
	<tiles:insertAttribute name="header" ignore="true"></tiles:insertAttribute>
	
	<tiles:insertAttribute name="body" ignore="true"></tiles:insertAttribute>

	<tiles:insertAttribute name="footer" ignore="true"></tiles:insertAttribute>

	<tiles:insertAttribute name="include_footer" ignore="true"></tiles:insertAttribute>
</html>