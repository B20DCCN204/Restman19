package model;

public class Monan204 {
	private Integer id;
    private String Ten, Theloai, Mota, Hinhanh, Ghichu;
    private float Giaca;
	public Monan204() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Monan204(int id, String ten, String theloai, String mota, String hinhanh, String ghichu, float giaca) {
		super();
		this.id = id;
		Ten = ten;
		Theloai = theloai;
		Mota = mota;
		Hinhanh = hinhanh;
		Ghichu = ghichu;
		Giaca = giaca;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getTheloai() {
		return Theloai;
	}
	public void setTheloai(String theloai) {
		Theloai = theloai;
	}
	public String getMota() {
		return Mota;
	}
	public void setMota(String mota) {
		Mota = mota;
	}
	public String getHinhanh() {
		return Hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		Hinhanh = hinhanh;
	}
	public String getGhichu() {
		return Ghichu;
	}
	public void setGhichu(String ghichu) {
		Ghichu = ghichu;
	}
	public float getGiaca() {
		return Giaca;
	}
	public void setGiaca(float giaca) {
		Giaca = giaca;
	}
    
    
}
