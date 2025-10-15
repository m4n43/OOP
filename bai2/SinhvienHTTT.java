
package bai2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienHTTT extends Sinhvien {
    private float hocPhi;
    ArrayList<Sinhvien> httt = new ArrayList<>();

    public SinhvienHTTT() {
    }

    public SinhvienHTTT(float hocPhi, String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); 
        System.out.println("Học phí: "+hocPhi);
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        System.out.print("Nhập học phí: ");
        this.hocPhi = sc.nextFloat();
        sc.nextLine();
    }
    public void ghiFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        fw.write("\nThông tin sinh viên: \n");
        fw.write("Mã sinh viên: "+maSinhVien+"|");
        fw.write(" Họ tên: "+hoTen+"|");
        fw.write(" Ngày sinh: "+ngaySinh+"|");
        fw.write(" Giới tính: "+gioiTinh+"|");
        fw.write(" Điểm trung binh: "+diemTB+"|");
        fw.write(" Học phí: "+hocPhi);
        fw.close();
    }
}
