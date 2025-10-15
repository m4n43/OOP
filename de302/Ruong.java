
package de302;

public class Ruong {
    protected String maRuong;
    protected String tenChuHo;
    protected String loaiCayTrong;
    protected int DIEN_TICH_MAX = 100;

    public Ruong() {
    }

    public Ruong(String maRuong, String tenChuHo, String loaiCayTrong) {
        this.maRuong = maRuong;
        this.tenChuHo = tenChuHo;
        this.loaiCayTrong = loaiCayTrong;
    }

    public String getMaRuong() {
        return maRuong;
    }

    public void setMaRuong(String maRuong) {
        this.maRuong = maRuong;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getLoaiCayTrong() {
        return loaiCayTrong;
    }

    public void setLoaiCayTrong(String loaiCayTrong) {
        this.loaiCayTrong = loaiCayTrong;
    }

    public int getDIEN_TICH_MAX() {
        return DIEN_TICH_MAX;
    }

    public void setDIEN_TICH_MAX(int DIEN_TICH_MAX) {
        this.DIEN_TICH_MAX = DIEN_TICH_MAX;
    }

    @Override
    public String toString() {
        return "Ruong{" + "maRuong=" + maRuong + ", tenChuHo=" + tenChuHo + ", loaiCayTrong=" + loaiCayTrong + ", DIEN_TICH_MAX=" + DIEN_TICH_MAX + '}';
    }
    
    public void hienThi() {
        System.out.println("Ma ruong:"+maRuong);
        System.out.println("Ten chu ho: "+tenChuHo);
        System.out.println("Loai cay trong: "+loaiCayTrong);
    }
}
