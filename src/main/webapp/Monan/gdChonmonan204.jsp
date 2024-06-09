<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Chọn món ăn</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Tìm kiếm món ăn</h1>
        <form id="searchForm" >
            <div class="form-group">
                <input type="text" id="keyword" class="form-control" placeholder="Nhập từ khóa">
            </div>
            <button type="submit" class="btn btn-primary">Tìm kiếm</button>
        </form>
        <div id="searchResults">
           
        </div>
    </div>

    
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#searchForm').submit(function(e) {
                e.preventDefault();
                var keyword = $('#keyword').val();
                $.ajax({
                    type: 'POST',
                    url: '<%= request.getContextPath()%>/Monan/search-food',
                    data: { keyword: keyword },
                    success: function(data) {
                        $('#searchResults').html(data);
                    }
                });
            });
        });
    </script>
</body>
</html>
