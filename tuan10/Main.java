package QL_SanPham;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		QuanLySanPham ql= new QuanLySanPham();
		SanPham sp1=new SanPhamDienTu("01", "Laptop", LocalDate.of(2026, 10, 20), 100000, 15, 24);
		SanPham sp2=new SanPhamDienTu("02", "SamSung", LocalDate.of(2027, 12, 20), 200000, 15, 24);
		SanPham sp3=new SanPhamDienTu("03", "Tu lanh", LocalDate.of(2028, 11, 20), 300000, 15, 24);
		SanPham sp4=new SanPhamThucPham("05", "My", LocalDate.of(2028, 11, 20), 10000, 20, LocalDate.of(2029, 11, 20));
		SanPham sp5=new SanPhamThucPham("05", "Ot", LocalDate.of(2028, 11, 20), 10000, 20, LocalDate.of(2029, 12, 20));
			System.out.println(sp1);
			System.out.println(sp2);
			System.out.println(sp3);
			System.out.println(sp4);
			System.out.println(sp5);
  }
}
