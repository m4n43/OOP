/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de201;

/**
 *
 * @author DELL
 */
public class DienThoai extends HangHoa{
    private int giaSimGhep;
    private float loiNhuan;

    public DienThoai() {
    }

    public DienThoai(int giaSimGhep, String tenHang, String maHang, int giaNhap, int giaBan) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }

    public int getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(int giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    public float getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(float loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
    
    public float tinhLoiNhuan() {
        loiNhuan = (giaBan-giaNhap)*(1-THUONG_BAN_HANG)-giaSimGhep;
        return loiNhuan;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Gia sim ghep: "+giaSimGhep);
        System.out.println("Loi nhuan: "+loiNhuan);
    }
    
}
