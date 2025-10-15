
package de302;

public class RuongVuong extends Ruong{
    protected int canh;

    public RuongVuong() {
    }

    public RuongVuong(int canh, String maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.println("Canh: "+canh);
    }
    
}
