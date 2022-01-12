

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<style>
    .bg-image-vertical {
        position: relative;
        overflow: hidden;
        background-repeat: no-repeat;
        background-position: right center;
        background-size: auto 100%;
    }

    @media (min-width: 1025px) {
        .h-custom-2 {
            height: 100%;
        }
    }
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<h1>Customer details</h1>
<p>
    <a href="/customer?actionUser=showList">Back to customer list</a>
    </br>
    <a href="/customer">Back to home furama</a>
</p>
<section class="vh-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-6 text-black">

                <div class="px-5 ms-xl-4">
                    <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
                    <span class="h1 fw-bold mb-0">Furama</span>
                </div>

                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form style="width: 23rem;" method="post" action="/student" >
                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Create Student</h3>


                        <div class="form-outline mb-4">
                            <input type="text" name="id" class="form-control form-control-lg" />
                            <label class="form-label" >Id </label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="text" name="name" class="form-control form-control-lg" />
                            <label class="form-label" >Name </label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="age" class="form-control form-control-lg" />
                            <label class="form-label" >Age </label>
                        </div>


                        <div class="form-outline mb-4">
                            <input type="text" name="address" class="form-control form-control-lg" />
                            <label class="form-label" >Address</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" name="phone" class="form-control form-control-lg" />
                            <label class="form-label" >Phone </label>
                        </div


                        <div class="pt-1 mb-4">
                            <button class="btn btn-info btn-lg btn-block" type="submit">Add Student</button>
                        </div>

                    </form>

                </div>

            </div>
            <div class="col-sm-6 px-0 d-none d-sm-block">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img3.webp" alt="add image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
            </div>
        </div>
    </div>
</section>
</body>
</html>
