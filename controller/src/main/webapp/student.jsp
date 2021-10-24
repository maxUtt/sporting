<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>com.sport.model.Student</title>
</head>
<body>
    <jsp:include page="student.jsp"></jsp:include>
    <p>Dear ${loginedUser.name}, you grade in this month is ${loginedUser. grade}</p>
</body>
</html>
