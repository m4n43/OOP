
package bai2;

import java.util.Scanner;

public class Sinhvien {
    protected String maSinhVien;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected float diemTB;

    public Sinhvien() {
    }

    public Sinhvien(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Giới tính: "+gioiTinh);
        System.out.println("Điểm trung binh: "+diemTB);
    }
    Scanner sc = new Scanner(System.in);
    public void nhapThongTin() {
        System.out.print("Nhập mã sinh viên: ");
        this.maSinhVien = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.diemTB = sc.nextFloat();
        sc.nextLine();
    }
}
