package QL_ThucPham;

import java.util.ArrayList;

public class QuanLyThucPham {

    // Khai bao danh sach hang thuc pham
    private ArrayList<HangThucPham> ds;

    // Constructor
    public QuanLyThucPham() {
        ds = new ArrayList<HangThucPham>();
    }

    // Them hang thuc pham
    public void themHang(HangThucPham h) {
        ds.add(h);
    }

    // Xuat danh sach hang thuc pham
    public void xuatDanhSach() {
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

        for (HangThucPham h : ds) {
            System.out.println(h);
        }
    }

    // Tim hang theo ma hang
    public HangThucPham timHang(String maHang) {
        for (HangThucPham h : ds) {
            if (h.getMaHang().equalsIgnoreCase(maHang)) {
                return h;
            }
        }
        return null;
    }

    // Dem so luong hang thuc pham
    public int demSoLuong() {
        return ds.size();
    }

    // Xuat danh sach hang da het han
    public void xuatHangHetHan() {
        System.out.println("\n===== DANH SACH HANG HET HAN =====");

        for (HangThucPham h : ds) {
            if (h.hetHan()) {
                System.out.println(h);
            }
        }
    }
}
