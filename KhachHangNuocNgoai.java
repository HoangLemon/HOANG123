package nguyenTranKhanhHoang25683611;

import java.time.LocalDate;

class KhachHangNuocNgoai extends KhachHang {
	private String quocTich;
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			double thanhTien, String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia, thanhTien);
		this.quocTich = quocTich;
	}
	//dong goi
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	@Override
	public double getThanhTien() {
		return soKW * donGia;
	}
	//toString
	@Override
	public String toString() {
		return "KhachHangNuocNgoai [quocTich=" + quocTich + ", maKhachHang=" + maKhachHang + ", hoTen=" + hoTen
				+ ", ngayLapHoaDon=" + ngayLapHoaDon + ", soKW=" + soKW + ", donGia=" + donGia + ", thanhTien="
				+ getThanhTien() + "]";
	}
	
}
