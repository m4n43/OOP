/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttfilebai1.obj;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhanVien extends Person{
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCoBan;
    private float luong;
    private transient Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, float luongCoBan, float luong, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float tinhLuong() {
        luong = (float)(luongCoBan*(1.0+(thamNien/100.0)));
        return luong;
    }
    @Override
    public String toString() {
        return super.toString()+", phongBan: "+phongBan+"z heSoLuong: "+heSoLuong+", thamNien: "+thamNien+", luongCoBan: "+luongCoBan+", luong: "+luong+"}"; 
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        System.out.print("Nhap phong ban: ");
        phongBan = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap tham nien: ");
        thamNien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextFloat();
        sc.nextLine();
    }
    
}
