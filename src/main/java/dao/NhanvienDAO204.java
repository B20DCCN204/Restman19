package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Thanhvien204;

public class NhanvienDAO204 extends DAO{
	
	public NhanvienDAO204() {
    }
    
    public String getPosition(Thanhvien204 thanhvien){
        String vitri = null;
        String query = "select vitri from tblnhanvien204 where tblThanhvien204Id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, thanhvien.getId());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                vitri = rs.getString("vitri");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vitri;
    }
}
