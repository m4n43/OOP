/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de202;

/**
 *
 * @author DELL
 */
public class MonAn extends MatHang{
    protected boolean canTrinhDien;

    public MonAn() {
    }

    public MonAn(boolean canTrinhDien, String tenMatHang, String maHang, int soLuong, int giaVon) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }

    public float gia() {
        if(canTrinhDien) 
            return giaVon/TY_LE_GIA_VON+200000;
        else 
            return giaVon/TY_LE_GIA_VON;
    }
    @Override
    public String toString() {
        return super.toString()+", Can trinh dien: "+canTrinhDien+", Gia: "+gia(); 
    }
    
}
