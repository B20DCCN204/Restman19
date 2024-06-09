package model;

public class Khachhang204 extends Thanhvien204{
	
	private Integer tblThanhvien204Id;

	public Khachhang204() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Khachhang204(Integer id, String username, String password, String hoten, String diachi, String email, String sdt,
			String vaitro, String ghichu, Integer tblThanhvien204Id) {
		super(id, username, password, hoten, diachi, email, sdt, vaitro, ghichu);
		this.tblThanhvien204Id = tblThanhvien204Id;
	}

	public Integer getTblThanhvien204Id() {
		return tblThanhvien204Id;
	}

	public void setTblThanhvien204Id(Integer tblThanhvien204Id) {
		this.tblThanhvien204Id = tblThanhvien204Id;
	}
	
}
