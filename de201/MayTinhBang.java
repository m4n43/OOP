/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de201;

/**
 *
 * @author DELL
 */
public class MayTinhBang extends HangHoa{
    private String kichThuocManHinh;
    private float loiNhuan;

    public MayTinhBang() {
    }

    public MayTinhBang(String kichThuocManHinh, String tenHang, String maHang, int giaNhap, int giaBan) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public String getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(String kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public float getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(float loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
    
    public void tinhLoiNhuan() {
        loiNhuan = (giaBan-giaNhap)*(1-THUONG_BAN_HANG);
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Kich thuoc man hinh: "+kichThuocManHinh);
        System.out.println("Loi nhuan: "+loiNhuan);
    }
    
}
