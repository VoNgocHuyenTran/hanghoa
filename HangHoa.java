package huyenTran;

import java.text.DecimalFormat;

public abstract class HangHoa {
protected final String maHang;
protected String tenHang;
protected double donGia;
protected int soLuongTon;
public HangHoa (String maHang) throws IllegalAccessException {
	this(maHang, "xxx", 0.0,0);
	
}
public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws IllegalAccessException {
this.maHang = "";
	//	this.maHang = maHang;
	if(maHang==null|| maHang.trim().length()==0)
		throw new IllegalArgumentException("Ma hang khong duoc de trong");
	setTenHang(tenHang);
	setDonGia (donGia);
	setSoLuongTon (soLuongTon);
}
public String getTenHang() {
	return tenHang;
}
public void setTenHang(String tenHang) {
	if(maHang==null|| maHang.trim().length()==0)
		throw new IllegalArgumentException("Ma hang khong duoc de trong");
	this.tenHang = tenHang;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) throws IllegalAccessException {
	if(donGia<0)
		throw new IllegalAccessException("Don gia phai >=0");
	this.donGia = donGia;
}
public int getSoLuongTon() {
	return soLuongTon;
}
public void setSoLuongTon(int soLuongTon) throws IllegalAccessException {
	if(soLuongTon <0)
		throw new IllegalAccessException("so luong ton phai >=0");
	this.soLuongTon = soLuongTon;
}
public String getMaHang() {
	return maHang;
}
public abstract double getTienVAT();
public abstract String danhGia();
@Override
	public String toString() {
	DecimalFormat df = new DecimalFormat("#,##0.#");
	return String.format("%-10s %-20s %-10s %-10s %-10s %-10s", maHang,tenHang, df.format(donGia), soLuongTon, df.format(getTienVAT()), danhGia() );
	
	}
}
