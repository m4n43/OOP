/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de202;

/**
 *
 * @author DELL
 */
public class DoUong extends MatHang{
    protected boolean coNongKhong;

    public DoUong() {
    }

    public DoUong(boolean coNongKhong, String tenMatHang, String maHang, int soLuong, int giaVon) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.coNongKhong = coNongKhong;
    }

    public boolean isCoNongKhong() {
        return coNongKhong;
    }

    public void setCoNongKhong(boolean coNongKhong) {
        this.coNongKhong = coNongKhong;
    }
    public float gia() {
        return giaVon/TY_LE_GIA_VON;
    }

    @Override
    public String toString() {
        return super.toString()+", Co nong khong: "+coNongKhong+", Gia: "+gia(); 
    }
}
