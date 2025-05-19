<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo List</title>
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />" />
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h2 class="text-primary">Your Todo List</h2>
        <h5 class="text-muted">Welcome, <span class="fw-bold text-dark"><c:out value="${username}" /></span></h5>
    </div>

    <div class="table-responsive">
        <table class="table table-bordered table-hover align-middle">
            <thead class="table-dark text-center">
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Status</th>
                    <th>Action</th>
                    <th>Update</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${values}" var="todos">
                    <tr>
                        <td class="text-center">${todos.id}</td>
                        <td>${todos.description}</td>
                        <td>${todos.targetdate}</td>
                        <td>
                            <c:choose>
                                <c:when test="${todos.done}">
                                    <span class="badge bg-success">Completed</span>
                                </c:when>
                                <c:otherwise>
                                    <span class="badge bg-warning text-dark">Pending</span>
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td class="text-center">
                            <a href="delete-todo?id=${todos.id}" class="btn btn-sm btn-outline-danger">
                                 Delete
                            </a>
                        </td>
                         <td class="text-center">
                          <a href="update-todo?id=${todos.id}" class="btn btn-sm btn-outline-success">
                           Update
                             </a>
                           </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="d-flex justify-content-end">
        <a href="add-todos" class="btn btn-success"> +Add New Todo</a>
    </div>
</div>

<script src="<c:url value='/webjars/jquery/3.7.1/jquery.min.js' />"></script>
<script src="<c:url value='/webjars/bootstrap/5.1.3/js/bootstrap.min.js' />"></script>
</body>
</html>
