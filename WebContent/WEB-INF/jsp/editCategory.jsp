<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px; margin:0px auto; text-align:center">
	<div>
		<form method="post" action="../categories/${c.id}">
		<input type="hidden" name="_method" value="PUT">
		分类名称：<input name="name" value="${c.name}" type="text">
		<br>
		<input type="hidden" value="${c.id}" name="id">
		<input type="submit" value="更新分类">
		</form>
	</div>
</div>