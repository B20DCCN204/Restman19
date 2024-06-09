package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.exceptions.RSAException;

import model.Khachhang204;
import model.Thanhvien204;

public class ThanhvienDAO204 extends DAO{
	public ThanhvienDAO204() {
    }
    
    public Thanhvien204 KiemtraDangnhap(String username, String password){
        String query = "select * from tblthanhvien204 where username=? and password=?";
        Thanhvien204 thanhvien = null;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                thanhvien = new Thanhvien204();
                thanhvien.setId(rs.getInt("id"));
                thanhvien.setHoten(rs.getString("hoten"));
                thanhvien.setDiachi(rs.getString("diachi"));
                thanhvien.setEmail(rs.getString("email"));
                thanhvien.setSdt(rs.getString("sodienthoai"));
                thanhvien.setGhichu(rs.getString("ghichu"));
                thanhvien.setVaitro(rs.getString("vaitro"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return thanhvien;
    }
}
