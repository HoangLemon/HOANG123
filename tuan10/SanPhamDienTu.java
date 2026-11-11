package QL_SanPham;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham {
	private int thoiGianBaoHanh;

	public SanPhamDienTu(String maSanPham, String tenSanPham, LocalDate ngaySanXuat, double giaNhap,
			int soLuongTonkho, int thoiGianBaoHanh) {
		super(maSanPham, tenSanPham, ngaySanXuat, giaNhap, soLuongTonkho);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public double tinhGiaBan() {
		return giaNhap+(giaNhap*0.10)+(thoiGianBaoHanh*50000);
	}

	@Override
	public String toString() {
		return "SanPhamDienTu [thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}
}
