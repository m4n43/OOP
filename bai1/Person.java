
package bai1;
public class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public Person() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void hienThi() {
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Giới tính: "+gioiTinh);
        
    }
}
