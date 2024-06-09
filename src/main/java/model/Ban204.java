package model;

import java.security.KeyStore.PrivateKeyEntry;

public class Ban204 {
	private int id;
	private String sohieu;
	private int soluongghe;
	private int trangthai;
	private String ghichu;
	public Ban204() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ban204(int id, String sohieu, int soluongghe, int trangthai, String ghichu) {
		super();
		this.id = id;
		this.sohieu = sohieu;
		this.soluongghe = soluongghe;
		this.trangthai = trangthai;
		this.ghichu = ghichu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSohieu() {
		return sohieu;
	}
	public void setSohieu(String sohieu) {
		this.sohieu = sohieu;
	}
	public int getSoluongghe() {
		return soluongghe;
	}
	public void setSoluongghe(int soluongghe) {
		this.soluongghe = soluongghe;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	
}
