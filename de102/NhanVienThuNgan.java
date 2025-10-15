
package de102;

public class NhanVienThuNgan extends NhanVien{
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan() {
    }

    public NhanVienThuNgan(boolean isBietNgoaiNgu, String hoTen, int thamNien, String queQuan, int soGio) {
        super(hoTen, thamNien, queQuan, soGio);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    protected int tinhLuong() {
        return soGio*luongGio;
    }
    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("Lương: "+tinhLuong());
    }
    
}
