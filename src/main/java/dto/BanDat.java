package dto;

import java.sql.Timestamp;

public class BanDat {
	private int bandatId;
	private String sohieu;
	private int soluongghe;
	private Timestamp thoigian;
	public BanDat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanDat(int bandatId, String sohieu, int soluongghe, Timestamp thoigian) {
		super();
		this.bandatId = bandatId;
		this.sohieu = sohieu;
		this.soluongghe = soluongghe;
		this.thoigian = thoigian;
	}
	public int getBandatId() {
		return bandatId;
	}
	public void setBandatId(int bandatId) {
		this.bandatId = bandatId;
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
	public Timestamp getThoigian() {
		return thoigian;
	}
	public void setThoigian(Timestamp thoigian) {
		this.thoigian = thoigian;
	}
	@Override
	public String toString() {
		return "BanDat [bandatId=" + bandatId + ", sohieu=" + sohieu + ", soluongghe=" + soluongghe + ", thoigian="
				+ thoigian + "]";
	}
	
	
}
