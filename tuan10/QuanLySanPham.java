package QL_SanPham;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuanLySanPham {
	List<SanPham> danhSachSP;
	public QuanLySanPham () {
		danhSachSP=new ArrayList<SanPham>();
	}
	
	public boolean themSanPham(SanPham sp) {
		if(danhSachSP.contains(sp.getMaSanPham())) {{
			System.out.println("Loi:ma san Pham");
			
		}
		return false;
	}
	return true;}

	public boolean xoaSanPham(String maSP) {
		if(danhSachSP.contains(maSP)) {
			danhSachSP.remove(maSP);
			System.out.println("Xoa San Pham Thanh Cong");
			return true;
		}
		return false;
	}
	
	public boolean suaSoLuongTon(int maSP, int soLuongMoi) {
		SanPham sp =danhSachSP.get(maSP);
		if(sp!=null) {
			sp.setSoLuongTonkho(soLuongMoi);
			return true;
		}
		return false;
	}
}
