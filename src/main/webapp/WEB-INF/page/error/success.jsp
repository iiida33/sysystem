<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>测试成功</title>
</head>
<body>
<input type="text" id="test" name="test" value="test"/>
<input type="text" id="custId" name="custId" value="${sessionScope.custId}"/>
<label> ${customer.custUsername}</label>
</body>
</html>