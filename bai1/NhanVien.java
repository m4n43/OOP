
package bai1;

public class NhanVien extends Person{
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCoBan;
    private float luong;

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, float luongCoBan, float luong, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public float tinhLuong() {
        luong = (float) (luongCoBan*(1.0+thamNien/100.0));
        return luong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); 
        System.out.println("Phòng ban: "+phongBan);
        System.out.println("Hệ số lương: "+heSoLuong);
        System.out.println("Thâm niên: "+thamNien);
        System.out.println("Lương thực lĩnh: "+luong);
    }
    
    
}
