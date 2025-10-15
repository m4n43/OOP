
package ttfilebai2.obj;

import java.util.Scanner;

public class SinhvienHTTT extends Sinhvien{
    private int hocPhi;
    private transient Scanner sc = new Scanner(System.in);

    public SinhvienHTTT() {
    }

    public SinhvienHTTT(int hocPhi, String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, float diemTrungBinh) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.hocPhi = hocPhi;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString()+", hocPhi: "+hocPhi+"}"; 
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap hoc phi: ");
        hocPhi = sc.nextInt();
    }
    
}
