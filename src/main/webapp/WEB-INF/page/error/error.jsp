<%--
  Created by IntelliJ IDEA.
  User: wjb
  Date: 2018/8/4
  Time: 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>错误信息</title>
</head>
<body>
${requestScope.message}
</body>
</html>
