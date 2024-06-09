package model;

public class Thanhvien204 {
	private Integer Id;
    private String Username, Password, Hoten, Diachi, Email, Sdt, Vaitro, Ghichu;
	public Thanhvien204() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thanhvien204(Integer id, String username, String password, String hoten, String diachi, String email, String sdt,
			String vaitro, String ghichu) {
		super();
		Id = id;
		Username = username;
		Password = password;
		Hoten = hoten;
		Diachi = diachi;
		Email = email;
		Sdt = sdt;
		Vaitro = vaitro;
		Ghichu = ghichu;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSdt() {
		return Sdt;
	}
	public void setSdt(String sdt) {
		Sdt = sdt;
	}
	public String getVaitro() {
		return Vaitro;
	}
	public void setVaitro(String vaitro) {
		Vaitro = vaitro;
	}
	public String getGhichu() {
		return Ghichu;
	}
	public void setGhichu(String ghichu) {
		Ghichu = ghichu;
	}
    
}
