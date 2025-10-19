/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de302;

/**
 *
 * @author DELL
 */
public class RuongVuong extends Ruong{
    protected int canh;

    public RuongVuong() {
    }

    public RuongVuong(int canh, String maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
    public int tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return super.toString()+", Canh: "+canh+", Dien tich: "+tinhDienTich(); 
    }
    
}
