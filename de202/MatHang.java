
package de202;

public abstract class MatHang {
    protected String tenMatHang;
    protected String maHang;
    protected int soLuong;
    protected int giaVon;
    protected float TY_LE_GIA_VON = (float) 0.4;

    public MatHang() {
    }

    public MatHang(String tenMatHang, String maHang, int soLuong, int giaVon) {
        this.tenMatHang = tenMatHang;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(int giaVon) {
        this.giaVon = giaVon;
    }

    public float getTY_LE_GIA_VON() {
        return TY_LE_GIA_VON;
    }

    public void setTY_LE_GIA_VON(float TY_LE_GIA_VON) {
        this.TY_LE_GIA_VON = TY_LE_GIA_VON;
    }

    public abstract float gia();
    @Override
    public String toString() {
        return "MatHang: " + "tenMatHang=" + tenMatHang + ", maHang=" + maHang + ", soLuong=" + soLuong + ", giaVon=" + giaVon + ", TY_LE_GIA_VON=" + TY_LE_GIA_VON;
    }
    
}
