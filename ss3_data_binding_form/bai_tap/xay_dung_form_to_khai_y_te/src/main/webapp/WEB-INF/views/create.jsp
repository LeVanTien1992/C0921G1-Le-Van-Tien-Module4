
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>View customer</title>
</head>
<style>
  table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
  }

  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
  }

  tr:nth-child(even) {
    background-color: #dddddd;
  }
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
          <span class="h1 fw-bold mb-0">Kê khai y tế</span>
        </div>

        <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

          <form:form style="width: 23rem;" method="post" action="/createMedical" modelAttribute="medical">
            <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Create Medical</h3>

            <div class="form-outline mb-4">
              <form:input path="name" class="form-control form-control-lg" />
              <label class="form-label" >Họ và tên (ghi chữ in hoa)(*)</label>
            </div>

            <div class="form-outline mb-4">
              <form:select path="year" items="${yearList}" class="form-control form-control-lg" />
              <label class="form-label" >Giới tính </label>
            </div>



            <div class="form-outline mb-4">
              <form:radiobutton path="gender" value="1" label="Male"  />
              <form:radiobutton path="gender" value="0" label="Female"  />
              <form:radiobutton path="gender" value="2" label="LGBT"  />
              <label class="form-label" >Gender </label>
            </div>


            <div class="form-outline mb-4">
              <form:select path="nationality" items="${nationalityList}" class="form-control form-control-lg" />
              <label class="form-label" >Quốc tịch </label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="passport" class="form-control form-control-lg" />
              <label class="form-label" >Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác(*) </label>
            </div>

            <div class="form-outline mb-4">
              <form:radiobutton path="travelInformation" label="Tàu bay" />
              <form:radiobutton path="travelInformation" label="Tàu thuyền" />
              <form:radiobutton path="travelInformation" label="Ô tô" />
              <form:radiobutton path="travelInformation" label="Khác(ghi rõ)"  />
              <label class="form-label" >Thông tin đi lại(*) </label>
            </div>


            <div class="form-outline mb-4">
              <form:input path="vehicleData" class="form-control form-control-lg" />
              <label class="form-label" >Số phương tiện </label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="seats" class="form-control form-control-lg" />
              <label class="form-label" >Số ghế </label>
            </div>


            <div class="form-outline mb-4">
              <form:input path="startDate" class="form-control form-control-lg" />
              <label class="form-label" >Ngày khởi hành </label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="endDate" class="form-control form-control-lg" />
              <label class="form-label" >Ngày kết thúc </label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="travelDescription" class="form-control form-control-lg" />
              <label class="form-label" >Trong vòng 14 ngày qua, Anh/ Chị có đến tỉnh /thành phố nào?(*)  </label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="contactAddress" class="form-control form-control-lg" />
              <label class="form-label" >Địa chỉ liên lạc </label>
            </div>


            <div class="form-outline mb-4">
              <form:input path="homeAddress" class="form-control form-control-lg" />
              <label class="form-label" >Địa chỉ nơi ở</label>
            </div>

            <div class="form-outline mb-4">
              <form:input path="phone" class="form-control form-control-lg" />
              <label class="form-label" >Điện thoại</label>
            </div>


            <div class="form-outline mb-4">
              <form:input path="email" class="form-control form-control-lg" />
              <label class="form-label" >Email</label>
            </div>

            <div class="form-outline mb-4">
              <label class="form-label" >Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không?</label>
              <table>
                <tr>
                  <th>Triệu chứng</th>
                  <th>Có</th>
                  <th>Không</th>
                  <th>Triệu chứng</th>
                </tr>
                <tr>
                  <td>Sốt</td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td>Nôn/Buồn nôn</td>
                </tr>
                <tr>
                  <td>Ho</td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td>Tiêu chảy</td>
                </tr>
                <tr>
                  <td>Khó Thở</td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td>Xuất huyết ngoài da</td>
                </tr>
                <tr>
                  <td>Đau Họng</td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td><form:radiobutton path="symptomsDescription"/></td>
                  <td>Nổi ban ngoài da</td>
                </tr>
              </table>
            </div>

            <div class="form-outline mb-4">
              <form:input path="exposureHistory" class="form-control form-control-lg" />
              <label class="form-label" >Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/ Chị có (*)</label>
            </div>

            <div class="pt-1 mb-4">
              <button class="btn btn-info btn-lg btn-block" type="submit">Add Medical</button>
            </div>

          </form:form>

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
