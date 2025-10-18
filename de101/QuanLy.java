
package de101;

public class QuanLy extends CanBo{
    private float heSoChucVu;

    public QuanLy() {
    }

    public QuanLy(float heSoChucVu, String hoTen, int namSinh, String gioiTinh, String diaChi, int heSoLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.heSoChucVu = heSoChucVu;
    }

    public float getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(float heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public String toString() {
        return super.toString()+", He so chuc vu: "+heSoChucVu+", Luong: "+tinhLuong(); 
    }
    public float tinhLuong() {
        return heSoLuong*LUONG_CO_BAN*(1+heSoChucVu);
    }
}
