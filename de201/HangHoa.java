
package de201;

public abstract class HangHoa {
    protected String tenHang;
    protected String maHang;
    protected int giaNhap;
    protected int giaBan;
    protected float THUONG_BAN_HANG = (float) 0.2;

    public HangHoa() {
    }

    public HangHoa(String tenHang, String maHang, int giaNhap, int giaBan) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
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

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public float getTHUONG_BAN_HANG() {
        return THUONG_BAN_HANG;
    }

    public void setTHUONG_BAN_HANG(float THUONG_BAN_HANG) {
        this.THUONG_BAN_HANG = THUONG_BAN_HANG;
    }
    public abstract float loiNhuan();
    @Override
    public String toString() {
        return "HangHoa: " + "tenHang=" + tenHang + ", maHang=" + maHang + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", THUONG_BAN_HANG=" + THUONG_BAN_HANG;
    }
    
}
