<%@page import="model.Monan204"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh sửa món ăn</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<%
	    Monan204 food = (Monan204) request.getAttribute("food");
	%>
    <div class="container">
        <h1>Chỉnh sửa món ăn</h1>
        <% if (request.getAttribute("successMessage") != null) { %>
        <div class="alert alert-success">
            <%= request.getAttribute("successMessage") %>
        </div>
    <% } %>
        <form id="editForm" method="post" action="<%= request.getContextPath() %>/Monan/update-food">
            <div class="form-group">
                <label for="id">ID món ăn:</label>
                <input type="text" id="id" name="id" class="form-control" value="<%= food.getId() %>" readonly>
            </div>
            <div class="form-group">
                <label for="ten">Tên món ăn:</label>
                <input type="text" id="ten" name="ten" class="form-control" value="<%= food.getTen() %>">
            </div>
            <div class="form-group">
                <label for="theloai">Loại:</label>
                <input type="text" id="theloai" name="theloai" class="form-control" value="<%= food.getTheloai() %>">
            </div>
            <div class="form-group">
                <label for="mota">Mô tả:</label>
                <textarea id="mota" name="mota" class="form-control"><%= food.getMota() %></textarea>
            </div>
            <div class="form-group">
                <label for="hinhanh">Ảnh:</label>
                <input type="text" id="hinhanh" name="hinhanh" class="form-control" value="<%= food.getHinhanh() %>">
            </div>
            <div class="form-group">
                <label for="giaca">Giá:</label>
                <input type="text" id="giaca" name="giaca" class="form-control" value="<%= food.getGiaca() %>">
            </div>
            <div class="form-group">
                <label for="ghichu">Ghi chú:</label>
                <% 
                    String ghiChu = food.getGhichu();
                    if (ghiChu != null) {
                %>
                <input type="text" id="ghichu" name="ghichu" class="form-control" value="<%= ghiChu %>">
                <%
                    } else {
                %>
                <input type="text" id="ghichu" name="ghichu" class="form-control">
                <%
                    }
                %>
            </div>
            <button type="submit" class="btn btn-primary">Lưu</button>
        </form>
        <form method="get" action="<%= request.getContextPath() %>/Monan/search-food">
            <button type="submit" class="btn btn-secondary">Tiếp tục</button>
        </form>
    </div>
</body>
</html>
