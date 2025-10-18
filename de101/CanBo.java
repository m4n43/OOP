
package de101;

public class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    protected int heSoLuong;
    protected int LUONG_CO_BAN = 2000000;

    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi, int heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getLUONG_CO_BAN() {
        return LUONG_CO_BAN;
    }

    public void setLUONG_CO_BAN(int LUONG_CO_BAN) {
        this.LUONG_CO_BAN = LUONG_CO_BAN;
    }

    @Override
    public String toString() {
        return "CanBo: " + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", heSoLuong=" + heSoLuong ;
    }
    
}
