
package bai2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienUTT extends Sinhvien{
    private String donVi;
    private float luong;
    ArrayList<Sinhvien> utt = new ArrayList<>();

    public SinhvienUTT() {
    }

    public SinhvienUTT(String donVi, float luong, String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); 
        System.out.println("Đơn vị: "+donVi);
        System.out.println("Lương: "+luong);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        System.out.print("Nhập đơn vị: ");
        this.donVi = sc.nextLine();
        System.out.print("Nhập lương: ");
        this.luong = sc.nextFloat();
    }
    public void ghiFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        fw.write("\nThông tin sinh viên: \n");
        fw.write("Mã sinh viên: "+maSinhVien+"|");
        fw.write(" Họ tên: "+hoTen+"|");
        fw.write(" Ngày sinh: "+ngaySinh+"|");
        fw.write(" Giới tính: "+gioiTinh+"|");
        fw.write(" Điểm trung binh: "+diemTB+"|");
        fw.write(" Đơn vị: "+donVi+"|");
        fw.write(" Lương: "+luong+"\n");
        fw.close();
    }
    
}
