<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css' />" />
</head>
<body class="container mt-5">

    <%@ include file="common/navigation.jspf" %>

    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card shadow-sm">
                <div class="card-body text-center">

                    <div class="alert alert-success" role="alert">
                        Successfully logged in!
                    </div>

                    <h1 class="display-6 mb-4">Welcome, <strong>${name}</strong></h1>

                    <a href="list-order" class="btn btn-primary btn-lg">
                        Click to See Todos
                    </a>

                </div>
            </div>
        </div>
    </div>

    <script src="<c:url value='/webjars/jquery/3.7.1/jquery.min.js' />"></script>
    <script src="<c:url value='/webjars/bootstrap/5.1.3/js/bootstrap.min.js' />"></script>
    <script src="<c:url value='/webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js' />"></script>
</body>
</html>
