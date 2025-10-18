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
    protected String kichThuocManHinh;

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
    public float loiNhuan() {
        return (giaBan-giaNhap)*(1-THUONG_BAN_HANG);
    }

    @Override
    public String toString() {
        return super.toString()+", Kich thuoc man hinh: "+kichThuocManHinh+", Loi nhuan: "+loiNhuan(); 
    }
    
}
