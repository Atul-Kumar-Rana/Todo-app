<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Todo List</title>
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />" />
</head>
<body class="container mt-4">
<div class="container">
<form:form action="updatetodo" method="post" modelAttribute="todocontent">
     Description :<form:input type="text"  path="description"  required="required"/>
     <form:errors path="description"/>
     <form:input type="hidden"  path="id"  />
     <form:input type="hidden"  path="done"  />

    <input type="submit" value="Update Todo" />
</form:form>
</div>
    <script src="<c:url value='/webjars/jquery/3.7.1/jquery.min.js' />"></script>
    <script src="<c:url value='/webjars/bootstrap/5.1.3/js/bootstrap.min.js' />"></script>
</body>
</html>
