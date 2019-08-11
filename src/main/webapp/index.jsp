<%--
  Created by IntelliJ IDEA.
  User: lh141
  Date: 2019/8/10
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false"%>

<%-- 引入struts2 的标签库--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>ssh测试</title>
</head>
<body>

<%-- 获取值栈中的user对象的userName的值--%>
用户名:<s:property value="user.userName"></s:property>

</body>
</html>
