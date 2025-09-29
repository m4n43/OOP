
package bai1;

public class Student extends Person{
    private String maSinhVien;
    private String email;
    private float diemTongKet;

    public Student() {
    }

    public Student(String maSinhVien, String email, float diemTongKet, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Email: "+email);
        System.out.println("Điểm tổng kết: "+diemTongKet);
    }
    
}
