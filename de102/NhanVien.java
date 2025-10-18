
package de102;

public class NhanVien {
    protected String hoTen;
    protected int thamNien;
    protected String queQuan;
    protected int soGioLamViec;
    protected int LUONG_GIO = 100000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int thamNien, String queQuan, int soGioLamViec) {
        this.hoTen = hoTen;
        this.thamNien = thamNien;
        this.queQuan = queQuan;
        this.soGioLamViec = soGioLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public int getLUONG_GIO() {
        return LUONG_GIO;
    }

    public void setLUONG_GIO(int LUONG_GIO) {
        this.LUONG_GIO = LUONG_GIO;
    }

    @Override
    public String toString() {
        return "NhanVien: " + "hoTen=" + hoTen + ", thamNien=" + thamNien + ", queQuan=" + queQuan + ", soGioLamViec=" + soGioLamViec + ", LUONG_GIO=" + LUONG_GIO;
    }
    
}
