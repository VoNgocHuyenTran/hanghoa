package huyenTran;

public class DanhSachHangHoa {

	private HangHoa[] ds;
	private int dem=0;
	public DanhSachHangHoa() {
		ds =new HangHoa[10];
	}
	public DanhSachHangHoa(int n) {
		if(n<=0)
			throw new RuntimeException(" Số lượng hàng hóa phải lớn hơn 0");
		ds= new HangHoa[n];

}
	public boolean them (HangHoa hh) {
		if(dem==ds.length)
			return false;
		for (int i=0; i<dem;i++)
			if(ds[i].getMaHang().equalsIgnoreCase(hh.getMaHang()))
				return false;
				ds[dem++]=hh;
				return true;
	}
	
	
}
