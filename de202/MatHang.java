
package de202;

public class MatHang {
    protected String tenHang;
    protected String maHang;
    protected int giaVon;
    protected int soLuong;
    protected float tyLeGiaVon = (float)0.4;
    protected float gia;

    public MatHang() {
    }

    public MatHang(String tenHang, String maHang, int giaVon, int soLuong, float gia) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.giaVon = giaVon;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(int giaVon) {
        this.giaVon = giaVon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getTyLeGiaVon() {
        return tyLeGiaVon;
    }

    public void setTyLeGiaVon(float tyLeGiaVon) {
        this.tyLeGiaVon = tyLeGiaVon;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "MatHang{" + "tenHang=" + tenHang + ", maHang=" + maHang + ", giaVon=" + giaVon + ", soLuong=" + soLuong + ", tyLeGiaVon=" + tyLeGiaVon + ", gia=" + gia + '}';
    }
    
    public void hienThi() {
        System.out.println("Ten mat hang: "+tenHang);
        System.out.println("Ma hang: "+maHang);
        System.out.println("So luong: "+soLuong);
        System.out.println("Gia von: "+giaVon);
    }
}
