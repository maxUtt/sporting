<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>com.sport.model.Teacher</title>
</head>
<body>
    <jsp:include page="teacher.jsp"></jsp:include>
    <p>Dear ${loginedUser.name} your salary in this month is ${loginedUser.salary}</p>
</body>
</html>
