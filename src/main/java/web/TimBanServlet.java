package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ThongtinBanDatDAO204;
import dto.BanDat;
import model.Khachhang204;
import model.ThongtinBanDat204;

/**
 * Servlet implementation class TimBanServlet
 */
@WebServlet(urlPatterns = "/search-table")
public class TimBanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimBanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ThongtinBanDatDAO204 thongtinBanDatDAO204 = new ThongtinBanDatDAO204();
		HttpSession session = request.getSession();
		Khachhang204 khachhang = (Khachhang204) session.getAttribute("khachhang");
		List<BanDat> listBanDats = thongtinBanDatDAO204.getDSBanDat(khachhang);
		request.setAttribute("listBanDat", listBanDats);
		request.setAttribute("khachhang", khachhang);
		request.getRequestDispatcher("/Banan/gdTimBan204.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
