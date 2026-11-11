package QL_SanPham;

import java.time.LocalDate;

public abstract class SanPham {
	protected String maSanPham;
	protected String tenSanPham;
	protected LocalDate ngaySanXuat;
	protected double giaNhap;
	protected int soLuongTonkho;
  
	public SanPham(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap, int soLuongTonkho) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.ngaySanXuat = ngaySanXuat;
		this.giaNhap = giaNhap;
		this.soLuongTonkho = soLuongTonkho;
	}
	public SanPham() {
		
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public int getSoLuongTonkho() {
		return soLuongTonkho;
	}
	public void setSoLuongTonkho(int soLuongTonkho) {
		this.soLuongTonkho = soLuongTonkho;
	}
	@Override
	public String toString() {
		return String.format("MaSP:%s || TenSP:%s || NgaySX:%s || Gia Nhap:%..0f VND||SoLuongTonKho:%s||Gia Ban:%..0f VND");
	}
	
}
