package nguyenTranKhanhHoang25683611;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Tao danh sach khach hang
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();

        try {
            // Khach hang Viet Nam
            KhachHangVietNam kh1 = new KhachHangVietNam(
                "KH001",
                "Nguyen Van An",
                LocalDate.of(2026, 10, 10),
                100,
                2000,
                0,
                "Sinh hoat",
                50
            );

            KhachHangVietNam kh2 = new KhachHangVietNam(
                "KH002",
                "Tran Van Binh",
                LocalDate.of(2026, 10, 15),
                40,
                2000,
                0,
                "Kinh doanh",
                50
            );

            // Khach hang nuoc ngoai
            KhachHangNuocNgoai kh3 = new KhachHangNuocNgoai(
                "KH003",
                "John",
                LocalDate.of(2026, 10, 20),
                80,
                3000,
                0,
                "My"
            );

            KhachHangNuocNgoai kh4 = new KhachHangNuocNgoai(
                "KH004",
                "David",
                LocalDate.of(2026, 10, 25),
                120,
                2500,
                0,
                "Anh"
            );

            // Them khach hang vao danh sach
            ds.add(kh1);
            ds.add(kh2);
            ds.add(kh3);
            ds.add(kh4);

            // Xuat danh sach khach hang
            System.out.println("========== DANH SACH KHACH HANG ==========");

            for (KhachHang kh : ds) {
                System.out.println(kh);
                System.out.println("Thanh tien: "
                        + kh.getThanhTien() + " VND");
                System.out.println("------------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
