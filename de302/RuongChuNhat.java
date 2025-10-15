
package de302;

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

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.println("Chieu dai: "+chieuDai);
        System.out.println("Chieu rong: "+chieuRong);
    }
    
}
