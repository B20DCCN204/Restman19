<%@page import="model.Khachhang204"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chọn Bàn Ăn</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Chọn Bàn Ăn</h1>

        <!-- Hiển thị thông tin của Khách hàng -->
        <div class="customer-info">
            <p>Tên Khách hàng: ${khachhang.getHoten()}</p>
            <p>Địa chỉ: ${khachhang.getDiachi()}</p>
        </div>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Stt</th>
                    <th>Số hiệu</th>
                    <th>Số lượng ghế</th>
                    <th>Ngày đặt</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${listBanDat}" var="banDat">
                    <tr>
                        <td>${i}</td>
                        <td>${banDat.getSohieu()}</td>
                        <td>${banDat.getSoluongghe()}</td>
                        <td>${banDat.getThoigian()}</td>
                        <td>
                            <a class='btn btn-sm btn-primary' href="select-food?id=${banDat.getBandatId()}">Chọn</a>
                        </td>
                    </tr>
                    <c:set var="i" value="${i + 1}" />
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
