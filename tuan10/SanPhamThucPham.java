package QL_SanPham;

import java.time.LocalDate;


public class SanPhamThucPham extends SanPham {
	private LocalDate ngayHetHan;

	public SanPhamThucPham(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap,
			int soLuongTonkho, LocalDate ngayHetHan) {
		super(maSanPham, tenSanPham, ngaySanXuat, giaNhap, soLuongTonkho);
		this.ngayHetHan = ngayHetHan;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public double tinhGiaBan() {
		if(ngayHetHan.isAfter(LocalDate.now())) {
			return 0;
		}
		return giaNhap+(giaNhap*0.05);
	}

	@Override
	public String toString() {
		return "SanPhamThucPham [ngayHetHan=" + ngayHetHan + "]";
	}
}
