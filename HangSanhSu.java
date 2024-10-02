package huyenTran;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu (String maHang) throws IllegalAccessException {
		super(maHang);
		this.nhaSanXuat="";
		this.ngayNhapKho= LocalDate.now();
		
	}
	
	

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws IllegalAccessException {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat (nhaSanXuat);
		setNgayNhapKho (ngayNhapKho);
		
	}
	
public String getNhaSanXuat() {
		return nhaSanXuat;
	}


public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
public void setNgayNhapKho(LocalDate ngayNhapKho) {
	if(ngayNhapKho.isAfter(LocalDate.now()))
		throw new IllegalArgumentException(" ngay nhap kho phai lon hon ngay hien tai");
	this.ngayNhapKho = ngayNhapKho;
	}



	@Override
	public double getTienVAT() {
		
		return donGia*0.1;
	}

	@Override
	public String danhGia() {
		LocalDate now= LocalDate.now();
		long ngayLuuKho = Math.abs(ChronoUnit.DAYS.between(ngayNhapKho, now));
		return soLuongTon > 5&& ngayLuuKho >10 ? "Ban cham":"";
	}
	

}