
package de102;

public class NhanVienBep extends NhanVien{
    private boolean isBepTruong;
    private int thuong;

    public NhanVienBep() {
    }

    public NhanVienBep(boolean isBepTruong, String hoTen, int thamNien, String queQuan, int soGio) {
        super(hoTen, thamNien, queQuan, soGio);
        this.isBepTruong = isBepTruong;
    }

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }
    protected int tinhLuong() {
        if(isBepTruong)
            return soGio*luongGio+thuong;
        else 
            return soGio*luongGio;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Lương: "+tinhLuong());
    }
    
}
