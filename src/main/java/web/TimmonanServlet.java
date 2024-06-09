package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MonanDAO204;
import model.Monan204;

/**
 * Servlet implementation class ChonmonanServlet
 */
@WebServlet(name="TimmonanServlet", urlPatterns = "/Monan/search-food")
public class TimmonanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimmonanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Monan/gdChonmonan204.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyword = request.getParameter("keyword");
		MonanDAO204 monanDao = new MonanDAO204();
		List<Monan204> foods = monanDao.getDSMonan(keyword);
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h2>Kết quả tìm kiếm</h2>");
            out.println("<table class='table table-bordered'>");
            out.println("<thead><tr><th>ID món ăn</th><th>Tên món ăn</th><th>Loại</th><th>Mô tả</th><th>Ảnh</th><th>Giá</th><th></th></tr></thead>");
            out.println("<tbody>");
            for (Monan204 food : foods) {
                out.println("<tr>");
                out.println("<td>" + food.getId() + "</td>");
                out.println("<td>" + food.getTen() + "</td>");
                out.println("<td>" + food.getTheloai() + "</td>");
                out.println("<td>" + food.getMota() + "</td>");
                out.println("<td><img src='" + request.getContextPath() + food.getHinhanh() + "' alt='Ảnh món ăn' width='100' height='100'></td>");
                out.println("<td>" + food.getGiaca() + "</td>");
                out.println("<td><a class='btn btn-sm btn-primary' href='select-food?id=" + food.getId() + "'>Sửa</a></td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            
        }
	}

}
