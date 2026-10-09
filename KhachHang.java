package nguyenTranKhanhHoang25683611;

import java.time.LocalDate;

abstract class KhachHang {
	protected String maKhachHang;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	protected double thanhTien;
	//dong goi
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) throws Exception {
		if(ngayLapHoaDon.isBefore(LocalDate.now()))
		{
			this.ngayLapHoaDon = ngayLapHoaDon;
		}
		else 
		{
			throw new Exception("Loi ngay!");
		}
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public abstract double getThanhTien();
	//constructor
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			double thanhTien) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKW = soKW;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}
	//toString
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", ngayLapHoaDon=" + ngayLapHoaDon
				+ ", soKW=" + soKW + ", donGia=" + donGia + ", thanhTien=" + thanhTien + "]";
	}
}
