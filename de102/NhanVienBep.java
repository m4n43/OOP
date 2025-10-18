
package de102;

public class NhanVienBep extends NhanVien{
    protected boolean isBepTruong;
    protected int thuongChucVu;

    public NhanVienBep() {
    }

    public NhanVienBep(boolean isBepTruong, int thuongChucVu, String hoTen, int thamNien, String queQuan, int soGioLamViec) {
        super(hoTen, thamNien, queQuan, soGioLamViec);
        this.isBepTruong = isBepTruong;
        this.thuongChucVu = thuongChucVu;
    }
    public int tinhLuong() {
        if(isBepTruong)
            return soGioLamViec*LUONG_GIO+thuongChucVu;
        else 
            return soGioLamViec*LUONG_GIO;
    }

    @Override
    public String toString() {
        return super.toString()+", isBepTruong: "+isBepTruong+", Thuong chuc vu: "+thuongChucVu+", Luong: "+tinhLuong();
    }
    
}
