
package src;

class QuanLy extends CanBo {
    private double heSoChucVu;
    public static final double LUONG_CO_BAN = 2000000;

    public QuanLy(String hoTen, int namSinh, String gioiTinh, String diaChi, double heSoLuong, double heSoChucVu) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN * (1 + heSoChucVu);
    }

    @Override
    public String toString() {
        return super.toString() + " - He so chuc vu: " + heSoChucVu;
    }
}