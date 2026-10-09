package nguyenTranKhanhHoang25683611;

import java.time.LocalDate;

class KhachHangVietNam extends KhachHang{
	private String doiTuong;
	private double dinhMuc;
	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			double thanhTien, String doiTuong, double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia, thanhTien);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	//dong goi
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	@Override
	public double getThanhTien() {
		if(soKW <= dinhMuc)
		{
			return soKW * donGia;
		}
		else
		{
			return dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;
		}
	}
	//toString
	@Override
	public String toString() {
		return "KhachHangVietNam [doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + ", maKhachHang=" + maKhachHang
				+ ", hoTen=" + hoTen + ", ngayLapHoaDon=" + ngayLapHoaDon + ", soKW=" + soKW + ", donGia=" + donGia
				+ ", thanhTien=" + getThanhTien() + "]";
	}

}
