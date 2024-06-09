package model;

import java.sql.Timestamp;

public class ThongtinBanDat204 {
	private int id;
	private Timestamp thoigian;
	private int soluongkhach;
	private String ghichu;
	private int banId;
	private int khachhangId;
	
	public ThongtinBanDat204() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThongtinBanDat204(int id, Timestamp thoigian, int soluongkhach, String ghichu, int banId, int khachhangId) {
		super();
		this.id = id;
		this.thoigian = thoigian;
		this.soluongkhach = soluongkhach;
		this.ghichu = ghichu;
		this.banId = banId;
		this.khachhangId = khachhangId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getThoigian() {
		return thoigian;
	}

	public void setThoigian(Timestamp thoigian) {
		this.thoigian = thoigian;
	}

	public int getSoluongkhach() {
		return soluongkhach;
	}

	public void setSoluongkhach(int soluongkhach) {
		this.soluongkhach = soluongkhach;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public int getBanId() {
		return banId;
	}

	public void setBanId(int banId) {
		this.banId = banId;
	}

	public int getKhachhangId() {
		return khachhangId;
	}

	public void setKhachhangId(int khachhangId) {
		this.khachhangId = khachhangId;
	}
	
	
}
