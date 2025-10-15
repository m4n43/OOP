
package ttfilebai2.obj;

import java.io.Serializable;
import java.util.Scanner;

public class Sinhvien implements Serializable{
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private float diemTrungBinh;

    private transient Scanner sc = new Scanner(System.in);
    public Sinhvien() {
    }

    public Sinhvien(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
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

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemTrungBinh=" + diemTrungBinh;
    }
    public void nhap() {
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTrungBinh = sc.nextFloat();
        sc.nextLine();
    }
}
