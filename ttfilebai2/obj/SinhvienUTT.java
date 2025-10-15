
package ttfilebai2.obj;

import java.util.Scanner;

public class SinhvienUTT extends Sinhvien{
    private String donVi;
    private int luong;
    private transient Scanner sc = new Scanner(System.in);

    public SinhvienUTT() {
    }

    public SinhvienUTT(String donVi, int luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString()+", donVi:"+donVi+", luong: "+luong+"}";
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap don vi: ");
        donVi = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextInt();
        sc.nextLine();
    }
    
}
