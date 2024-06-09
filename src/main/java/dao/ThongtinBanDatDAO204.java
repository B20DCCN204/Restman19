package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.BanDat;
import model.Khachhang204;

public class ThongtinBanDatDAO204 extends DAO{

	public ThongtinBanDatDAO204() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<BanDat> getDSBanDat(Khachhang204 khachhang) {
		List<BanDat> list = new ArrayList<>();
		String sql = "SELECT T.id, B.sohieu, B.soluongghe as ghe, T.thoigian " +
	             "FROM tblthongtinbandat204 T " +
	             "INNER JOIN tblban204 B ON T.tblBan204Id = B.id " +
	             "WHERE T.tblKhachhang204Id = ?";

		try {
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, khachhang.getTblThanhvien204Id());
			ResultSet resultSet = pStatement.executeQuery();
			while(resultSet.next()) {
				BanDat banDat = new BanDat();
				banDat.setBandatId(resultSet.getInt("id"));
				banDat.setSohieu(resultSet.getString("sohieu"));
				banDat.setSoluongghe(resultSet.getInt("ghe"));
				banDat.setThoigian(resultSet.getTimestamp("thoigian"));
				list.add(banDat);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
