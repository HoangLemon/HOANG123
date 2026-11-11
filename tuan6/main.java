package QL_ThucPham;

import java.time.LocalDate;

public class TestHangThucPham {

    public static void main(String[] args) {

        // Tao doi tuong quan ly
        QuanLyThucPham ql = new QuanLyThucPham();

        try {
            // Tao cac mat hang
            HangThucPham h1 = new HangThucPham(
                "001", "Gao", 100000,
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(5)
            );

            HangThucPham h2 = new HangThucPham(
                "002", "Mi", 5000,
                LocalDate.now().minusDays(10),
                LocalDate.now().minusDays(2)
            );

            HangThucPham h3 = new HangThucPham(
                "003", "Nuoc", 15000,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(1)
            );

            // Them hang vao danh sach
            ql.themHang(h1);
            ql.themHang(h2);
            ql.themHang(h3);

            // Xuat danh sach
            System.out.println("===== DANH SACH HANG THUC PHAM =====");
            ql.xuatDanhSach();

            // Dem so luong hang
            System.out.println("\nTong so mat hang: " + ql.demSoLuong());

            // Tim kiem hang
            System.out.println("\n===== TIM KIEM HANG =====");

            HangThucPham kq = ql.timHang("002");

            if (kq != null) {
                System.out.println("Tim thay mat hang:");
                System.out.println(kq);
            } else {
                System.out.println("Khong tim thay mat hang!");
            }

            // Xuat hang het han
            ql.xuatHangHetHan();

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
