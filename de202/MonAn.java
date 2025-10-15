
package de202;

public class MonAn extends MatHang{
    private boolean canTrinhDien;

    public MonAn() {
    }

    public MonAn(boolean canTrinhDien, String tenHang, String maHang, int giaVon, int soLuong, float gia) {
        super(tenHang, maHang, giaVon, soLuong, gia);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }
    public float tinhGia() {
        if(canTrinhDien)
            return giaVon/tyLeGiaVon + 200000;
        else
            return giaVon/tyLeGiaVon;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.println("Gia tren menu: "+tinhGia());
    }
    
}
