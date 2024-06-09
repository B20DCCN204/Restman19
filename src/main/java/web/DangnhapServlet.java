package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NhanvienDAO204;
import dao.ThanhvienDAO204;
import model.Khachhang204;
import model.Thanhvien204;

/**
 * Servlet implementation class DangnhapServlet
 */
@WebServlet(name="Dangnhap",urlPatterns = "/login")
public class DangnhapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangnhapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("gdDangnhap204.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        ThanhvienDAO204 thanhvienDAO = new ThanhvienDAO204();
        
        Thanhvien204 thanhvien = thanhvienDAO.KiemtraDangnhap(username, password);
        
        if(thanhvien != null){
            HttpSession session = request.getSession();
            if("khach hang".equalsIgnoreCase(thanhvien.getVaitro())){
            	Khachhang204 khachhang = new Khachhang204();
            	khachhang.setTblThanhvien204Id(thanhvien.getId());
            	khachhang.setHoten(thanhvien.getHoten());
            	khachhang.setDiachi(thanhvien.getDiachi());
            	session.setAttribute("khachhang", khachhang);
                response.sendRedirect("Khachhang\\gdKhachhang204.jsp");
            }else if("nhan vien".equalsIgnoreCase(thanhvien.getVaitro())){
                NhanvienDAO204 nhanvienDao = new NhanvienDAO204();
                String vitri = nhanvienDao.getPosition(thanhvien);
                if(vitri != null){
                    if("quan li".equalsIgnoreCase(vitri)){
                    	response.sendRedirect("Quanli\\gdQuanli204.jsp");
                    }
                }
            }   
        }else{
            String msg = "Bạn nhập sai. Hãy nhập lại!";
            request.setAttribute("error", msg);
            request.getRequestDispatcher("gdDangnhap204.jsp").forward(request, response);
        }
	}

}
