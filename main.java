package CongNhan;

public class main {
	public static void main(String[] args) {
//tao danh sach voi so n nhap tu ban phim
		DanhSachCongNhan ds = new DanhSachCongNhan(2);
//tao cong nhan
		CongNhan cn1 = new CongNhan("CN01", "Nguyen Thi", "Lanh", "150");
		CongNhan cn2 = new CongNhan("CN01", "Bui Tien", "Dung", "150");
//them cong nhan vao danh sach
		ds.themCongNhan(cn1);
		ds.themCongNhan(cn2);
//xuat toan bo danh sach
	System.out.println("--DANH SACH CONG NHAN--");
	ds.xuatDanhSach();
//xuat so luong
	System.out.println("So luong cong nhan: "+ ds.tinhSoLuong());
//cac cong nhan co tren 200 san pham
	System.out.println("--DANH SACH CAC CONG NHAN TREN 200 SAN PHAM--");
	ds.congNhanTren200();
//danh sach giam dan theo san pham
	System.out.println("--DANH SACH GIAM DAN THEO SAN PHAM--");
	ds.sapXepGiamDan();
	}
}
