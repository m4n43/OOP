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
    protected int giaSimGhep;

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
    public float loiNhuan() {
        return (giaBan-giaNhap)*(1-THUONG_BAN_HANG)-giaSimGhep;
    }

    @Override
    public String toString() {
        return super.toString()+", Gia sim ghep: "+giaSimGhep+", Loi nhuan: "+loiNhuan(); 
    }
    
}
