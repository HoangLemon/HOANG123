package QL_ThucPham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	//khai bao bien
	private String MaHang;
	private String TenHang;
	private double DonGia;
	private LocalDate NgaySanXuat;
	private LocalDate NgayHetHan;
    //Dong goi
	/**
	 * @return the maHang
	 */
	public String getMaHang() {
		return MaHang;
	}

	/**
	 * @param maHang the maHang to set
	 */
	private void setMaHang(String maHang) throws Exception {
		if(maHang == null || maHang.trim().isEmpty())
		{
			throw new Exception("Ma hang khong duoc rong!");
		}
		this.MaHang = maHang;
	}

	/**
	 * @return the tenHang
	 */
	public String getTenHang() {
		return TenHang;
	}

	/**
	 * @param tenHang the tenHang to set
	 */
	public void setTenHang(String tenHang) throws Exception {
		if(tenHang == null || tenHang.trim().isEmpty())
		{
			throw new Exception("Ten hang khong duoc rong!");
		}
		this.TenHang = tenHang;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return DonGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) throws Exception {
		if(donGia < 0)
		{
			throw new Exception("Don gia phai >= 0!");
		}
		this.DonGia = donGia;
	}

	/**
	 * @return the ngaySanXuat
	 */
	public LocalDate getNgaySanXuat() {
		return NgaySanXuat;
	}

	/**
	 * @param ngaySanXuat the ngaySanXuat to set
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) throws Exception {
		if(ngaySanXuat == null)
		{
			throw new Exception("Phai co ngay san xuat!");
		}
		else if(!ngaySanXuat.isBefore(LocalDate()))
		{
			throw new Exception("Ngay san xuat khong duoc sau ngay hien tai!");
		}
		this.NgaySanXuat = ngaySanXuat;
	}

	private ChronoLocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return NgayHetHan;
	}

	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if(ngayHetHan == null)
		{
			throw new Exception("Ngay het han phai sau ngay san xuat!");
		}
		if(ngayHetHan != null && !ngayHetHan.isAfter(NgaySanXuat))
		{
			throw new Exception("Ngày hết hạn phải sau ngày sản xuất!");
		}
		this.NgayHetHan  = ngayHetHan;
	}
	//tao ham Constructor
	/**
	 * @param maHang
	 * @param tenHang
	 * @param donGia
	 * @param ngaySanXuat
	 * @param ngayHetHan
	 */
	public HangThucPham() {
        try {
            setMaHang("000");
            setTenHang("Chưa xác định");
            setDonGia(0);

            LocalDate ngaySX = LocalDate.now().minusDays(1);
            setNgaySanXuat(ngaySX);
            setNgayHetHan(ngaySX.plusDays(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	//Construct day du
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
            setMaHang(maHang);
            setTenHang(tenHang);
            setDonGia(donGia);
            setNgaySanXuat(ngaySanXuat);
            setNgayHetHan(ngayHetHan);
    }
	//kiem tra nagy het han
	public boolean hetHan() {
        return NgayHetHan.isBefore(LocalDate.now());
    }
	 
	@Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format(
            "%-10s %-15s %15sVNĐ %-15s %-15s %-15s",
            getMaHang(),
            getTenHang(),
            df.format(getDonGia()),
            dtf.format(getNgaySanXuat()),
            dtf.format(NgayHetHan),
            hetHan() ? "Hàng hết hạn" : ""
        );
    }
	//xuat thong tin
	import java.time.LocalDate;
	public class TestHangThucPham {
	    public static void main(String[] args) {

	        try {
	            // Tạo 3 mặt hàng
	            HangThucPham h1 = new HangThucPham(
	                    "001",
	                    "Gạo",
	                    100000,
	                    LocalDate.now().minusDays(5),
	                    LocalDate.now().plusDays(5)
	            );

	            HangThucPham h2 = new HangThucPham(
	                    "002",
	                    "Mì",
	                    5000,
	                    LocalDate.now().minusDays(10),
	                    LocalDate.now().minusDays(2)
	            );

	            HangThucPham h3 = new HangThucPham(
	                    "003",
	                    "Nước",
	                    100000,
	                    LocalDate.now().minusDays(20),
	                    LocalDate.now().minusDays(1)
	            );

	            // Xuất tiêu đề
	            System.out.printf(
	                    "%-10s %-15s %15s %-15s %-15s %-15s%n",
	                    "Mã hàng",
	                    "Tên hàng",
	                    "Đơn giá",
	                    "Ngày sản xuất",
	                    "Ngày hết hạn",
	                    "Ghi chú"
	            );

	            System.out.println(
	                    "--------------------------------------------------------------------------"
	            );

	            // Xuất thông tin
	            System.out.println(h1);
	            System.out.println(h2);
	            System.out.println(h3);

	        } catch (Exception e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }
	    }

	public static void main1(String[] args) {
		System.out.println("\n===== KIỂM TRA RÀNG BUỘC =====");

		// Mã hàng rỗng
		try {
		    HangThucPham h = new HangThucPham(
		            "", "Gạo", 100000,
		            LocalDate.now().minusDays(5),
		            LocalDate.now().plusDays(5)
		    );
		} catch (Exception e) {
		    System.out.println("Mã hàng rỗng: " + e.getMessage());
		}

		// Tên hàng rỗng
		try {
		    HangThucPham h = new HangThucPham(
		            "004", "", 100000,
		            LocalDate.now().minusDays(5),
		            LocalDate.now().plusDays(5)
		    );
		} catch (Exception e) {
		    System.out.println("Tên hàng rỗng: " + e.getMessage());
		}

		// Đơn giá âm
		try {
		    HangThucPham h = new HangThucPham(
		            "005", "Bánh", -1000,
		            LocalDate.now().minusDays(5),
		            LocalDate.now().plusDays(5)
		    );
		} catch (Exception e) {
		    System.out.println("Đơn giá âm: " + e.getMessage());
		}

		// Ngày sản xuất sau ngày hiện tại
		try {
		    HangThucPham h = new HangThucPham(
		            "006", "Sữa", 20000,
		            LocalDate.now().plusDays(1),
		            LocalDate.now().plusDays(5)
		    );
		} catch (Exception e) {
		    System.out.println("Ngày sản xuất sai: " + e.getMessage());
		}

		// Ngày hết hạn trước ngày sản xuất
		try {
		    HangThucPham h = new HangThucPham(
		            "007", "Bánh", 30000,
		            LocalDate.now().minusDays(5),
		            LocalDate.now().minusDays(10)
		    );
		} catch (Exception e) {
		    System.out.println("Ngày hết hạn sai: " + e.getMessage());
		}


	}

}
