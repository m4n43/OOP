
package de102;

public class NhanVienThuNgan extends NhanVien{
    protected boolean isBietNgoaiNgu;

    public NhanVienThuNgan() {
    }

    public NhanVienThuNgan(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }
    public int tinhLuong() {
        return soGioLamViec*LUONG_GIO;
    }

    @Override
    public String toString() {
        return super.toString()+", isBietNgoaiNgu: "+isBietNgoaiNgu+", Luong: "+tinhLuong(); 
    }
    
}
