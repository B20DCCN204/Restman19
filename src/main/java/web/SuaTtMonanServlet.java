package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MonanDAO204;
import model.Monan204;

/**
 * Servlet implementation class SuaTtMonanServlet
 */
@WebServlet(urlPatterns="/Monan/update-food")
public class SuaTtMonanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaTtMonanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        String theloai = request.getParameter("theloai");
        String mota = request.getParameter("mota");
        String hinhanh = request.getParameter("hinhanh");
        float giaca = Float.parseFloat(request.getParameter("giaca"));
        String ghichu = request.getParameter("ghichu");
        
        Monan204 food = new Monan204(id, ten, theloai, mota, hinhanh, ghichu, giaca);
        MonanDAO204 monanDao = new MonanDAO204();
        monanDao.suaTtMonan(food);
        request.setAttribute("food", food);
        request.setAttribute("successMessage", "Thông tin món ăn đã được cập nhật thành công.");
        request.getRequestDispatcher("/Monan/gdSuattMonan204.jsp").forward(request, response);
	}

}
