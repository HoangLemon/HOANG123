package QLSV;

import java.util.Scanner;

public class QLSV_ThongTin {
	//khai bao bien
	private int MaSV;
	private String Hoten;
	private double DiemLT;
	private double DiemTH;
	
	//dong goi
	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return MaSV;
	}
	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(int MaSV) throws Exception {
		if(MaSV>0) {
		this.MaSV = MaSV;
		} else {
			throw new Exception("Loi ma > 0");
		}
	}
	/**
	 * @return the hoten
	 */
	public String getHoten() {
		return Hoten;
	}
	/**
	 * @param hoten the hoten to set
	 */
	public void setHoten(String hoten) {
		this.Hoten = hoten;
	}
	/**
	 * @return the diemLT
	 */
	public double getDiemLT() {
		return DiemLT;
	}
	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(double diemLT) {
		this.DiemLT = diemLT;
	}
	/**
	 * @return the diemTH
	 */
	public double getDiemTH() {
		return DiemTH;
	}
	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(double diemTH) {
		this.DiemTH = diemTH;
	}
	
    //tao ham Constructor
	/**
	 * @param maSV
	 * @param hoten
	 * @param diemLT
	 * @param diemTH
	 */
	public QLSV_ThongTin(int maSV, String hoten, double diemLT, double diemTH) {
		MaSV = maSV;
		Hoten = hoten;
		DiemLT = diemLT;
		DiemTH = diemTH;
	}
	public QLSV_ThongTin() {
		this.MaSV = 1;
		this.Hoten = "Chua Co";
		this.DiemLT = 0.0;
		this.DiemTH = 0.0;
	}
	public double getDiemTB() {
		return (getDiemLT() + getDiemTH()) / 2;
	}
	public static final QLSV_ThongTin nhap() {
		int MaSV;
		String Hoten;
		double DiemLT, DiemTH;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma SV");
		MaSV = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap diem LT");
		DiemLT = sc.nextLine();
		System.out.println("Nhap diem TH");
		DiemTH = sc.nextLine();
		System.out.println("Nhap ho ten");
		Hoten = sc.nextLine();
		QLSV_ThongTin sv = new QLSV_ThongTin(MaSV, Hoten, DiemLT, DiemTH);
		return sv;
	}
	@Override
	public String toString() {
	    return String.format("%-10d %-22s %-15.2f %-10.2f %8.2f",
	            MaSV, Hoten, DiemLT, DiemTH, getDiemTB());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    // Tạo sinh viên bằng constructor đầy đủ
		    QLSV_ThongTin sv1 = new QLSV_ThongTin(101, "Nguyen Van A", 8.0, 9.0);

		    // Tạo sinh viên bằng constructor mặc định
		    QLSV_ThongTin sv2 = new QLSV_ThongTin();

		    // Gán dữ liệu cho sv2 bằng setter
		    try {
		        sv2.setMaSV(102);
		        sv2.setHoten("Nguyen Van B");
		        sv2.setDiemLT(7.5);
		        sv2.setDiemTH(8.5);
		    } catch (Exception e) {
		        System.out.println(e.getMessage());
		    }

		    // In thông tin
		    System.out.println("MaSV\t\tHo ten\t\tDiem LT\t\tDiem TH\t\tDiem TB");

		    System.out.println(sv1);
		    System.out.println(sv2);
		}
}
