package QL_ThucPham;

import java.time.LocalDate;

public class HangThucPhamMain {
    public static void main(String[] args) {

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

            // Xuat tieu de
            System.out.printf(
                "%-10s %-15s %15s %-15s %-15s %-15s%n",
                "Ma hang",
                "Ten hang",
                "Don gia",
                "Ngay san xuat",
                "Ngay het han",
                "Ghi chu"
            );

            System.out.println(
                "--------------------------------------------------------------------------"
            );

            // Xuat danh sach hang thuc pham
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);

            // Kiem tra het han
            System.out.println("\n===== KIEM TRA HAN SU DUNG =====");

            System.out.println("Gao het han: " + h1.hetHan());
            System.out.println("Mi het han: " + h2.hetHan());
            System.out.println("Nuoc het han: " + h3.hetHan());

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }

        // Kiem tra cac rang buoc
        System.out.println("\n===== KIEM TRA RANG BUOC =====");

        // 1. Ma hang rong
        try {
            HangThucPham h = new HangThucPham(
                "", "Gao", 100000,
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(5)
            );
        } catch (Exception e) {
            System.out.println("Ma hang rong: " + e.getMessage());
        }

        // 2. Ten hang rong
        try {
            HangThucPham h = new HangThucPham(
                "004", "", 100000,
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(5)
            );
        } catch (Exception e) {
            System.out.println("Ten hang rong: " + e.getMessage());
        }

        // 3. Don gia am
        try {
            HangThucPham h = new HangThucPham(
                "005", "Banh", -1000,
                LocalDate.now().minusDays(5),
                LocalDate.now().plusDays(5)
            );
        } catch (Exception e) {
            System.out.println("Don gia am: " + e.getMessage());
        }

        // 4. Ngay san xuat trong tuong lai
        try {
            HangThucPham h = new HangThucPham(
                "006", "Sua", 20000,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(5)
            );
        } catch (Exception e) {
            System.out.println("Ngay san xuat sai: " + e.getMessage());
        }

        // 5. Ngay het han truoc ngay san xuat
        try {
            HangThucPham h = new HangThucPham(
                "007", "Banh", 30000,
                LocalDate.now().minusDays(5),
                LocalDate.now().minusDays(10)
            );
        } catch (Exception e) {
            System.out.println("Ngay het han sai: " + e.getMessage());
        }
    }
}
