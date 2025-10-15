
package de202;

public class DoUong extends MatHang{
    private boolean nongKhong;

    public DoUong() {
    }

    public DoUong(boolean nongKhong, String tenHang, String maHang, int giaVon, int soLuong, float gia) {
        super(tenHang, maHang, giaVon, soLuong, gia);
        this.nongKhong = nongKhong;
    }

    public boolean isNongKhong() {
        return nongKhong;
    }

    public void setNongKhong(boolean nongKhong) {
        this.nongKhong = nongKhong;
    }
    public float tinhGia() {
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
