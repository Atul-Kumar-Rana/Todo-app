<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Todo List</title>
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css' />" />
</head>
<body class="container mt-4">
<%@ include file="common/navigation.jspf" %>

<div class="container">

    <form:form action="${mode}" method="post" modelAttribute="todocontent">
        <div class="mb-3">
            Description:
            <form:input path="description" cssClass="form-control" required="required"/>
            <form:errors path="description" cssClass="text-danger"/>
        </div>

        <div class="mb-3">
            TargerDate:
            <form:input path="targetdate"  id="targetdate" cssClass="form-control" required="required"/>
            <form:errors path="targetdate" id="targetdate"  cssClass="text-danger"/>
        </div>

        <!-- Hidden fields for ID, done, and targetdate -->
        <form:hidden path="id" />
        <form:hidden path="done" />

        <input type="submit" value="Update Todo" class="btn btn-primary" />
    </form:form>
</div>

<script src="<c:url value='/webjars/jquery/3.7.1/jquery.min.js' />"></script>
<script src="<c:url value='/webjars/bootstrap/5.1.3/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js' />"></script>
<script>
$(document).ready(function () {
 $('#targetdate').datepicker({
    format: 'yyyy-mm-dd',
    autoclose: true,
    todayHighlight: true
    });
   });
</script>
</body>
</html>
