package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Monan204;

public class MonanDAO204 extends DAO{

	public MonanDAO204() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Monan204> getDSMonan(String tenMonan){
		List<Monan204> list = new ArrayList<>();
		String sql = "select * from tblmonan204 where ten like ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, "%"+tenMonan+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Monan204 monan = new Monan204();
				monan.setId(rs.getInt("id"));
				monan.setTen(rs.getString("ten"));
				monan.setTheloai(rs.getString("theloai"));
				monan.setMota(rs.getString("mota"));
				monan.setHinhanh(rs.getString("hinhanh"));
				monan.setGiaca(rs.getFloat("giaca"));
				monan.setGhichu(rs.getString("ghichu"));
				list.add(monan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public Monan204 getMonanById(int id) {
		Monan204 monan = new Monan204();
		String sql = "select * from tblmonan204 where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				monan.setId(rs.getInt("id"));
				monan.setTen(rs.getString("ten"));
				monan.setTheloai(rs.getString("theloai"));
				monan.setMota(rs.getString("mota"));
				monan.setHinhanh(rs.getString("hinhanh"));
				monan.setGiaca(rs.getFloat("giaca"));
				monan.setGhichu(rs.getString("ghichu"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return monan;
	}
	public void suaTtMonan(Monan204 monan) {
		String sql = "update tblmonan204 set ten=?, theloai=?, mota=?, hinhanh=?, giaca=?, ghichu=? where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, monan.getTen());
			ps.setString(2, monan.getTheloai());
			ps.setString(3, monan.getMota());
			ps.setString(4, monan.getHinhanh());
			ps.setFloat(5, monan.getGiaca());
			ps.setString(6, monan.getGhichu());
			ps.setInt(7, monan.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
