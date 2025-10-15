
package de102;

public class NhanVien {
    protected String hoTen;
    protected int thamNien;
    protected String queQuan;
    protected int soGio;
    protected int luongGio = 100000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int thamNien, String queQuan, int soGio) {
        this.hoTen = hoTen;
        this.thamNien = thamNien;
        this.queQuan = queQuan;
        this.soGio = soGio;
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

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public int getLuongGio() {
        return luongGio;
    }

    public void setLuongGio(int luongGio) {
        this.luongGio = luongGio;
    }
    public void inThongTin() {
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Thâm niên: "+thamNien);
        System.out.println("Quê quán: "+queQuan);
        System.out.println("Số giờ làm việc: "+soGio);
    }
}
