/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de302;

/**
 *
 * @author DELL
 */
public class RuongChuNhat extends Ruong{
    protected int chieuDai;
    protected int chieuRong;

    public RuongChuNhat() {
    }

    public RuongChuNhat(int chieuDai, int chieuRong, String maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    public int tinhDienTich() {
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return super.toString()+", Chieu dai: "+chieuDai+", Chieu rong: "+chieuRong+", Dien tich: "+tinhDienTich();
    }
    
}
