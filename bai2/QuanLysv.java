
package bai2;

import java.io.IOException;
import java.util.ArrayList;

public class QuanLysv {
    private ArrayList<Sinhvien> dssv = new ArrayList<>();
    public void themSV(Sinhvien sv) {
        dssv.add(sv);
    }
    public void hienThiDS() {
        System.out.println("Danh sách sinh viên: ");
        for (Sinhvien sinhvien : dssv) {
            sinhvien.hienThiThongTin();
        }
    }
    public void luuFile() {
        try {
            for (Sinhvien sinhvien : dssv) {
                if (sinhvien instanceof SinhvienHTTT)
                    ((SinhvienHTTT)sinhvien).ghiFile("svhttt.dat");
                else 
                    ((SinhvienUTT)sinhvien).ghiFile("svutt.dat");
            }
        } catch (IOException e){
            
        }
    }
}
