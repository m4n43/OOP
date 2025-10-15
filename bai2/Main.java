
package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLysv qlsv = new QuanLysv();
        SinhvienHTTT svhttt = new SinhvienHTTT();
        svhttt.nhapThongTin();
        qlsv.themSV(svhttt);
        qlsv.luuFile();
        SinhvienUTT svutt = new SinhvienUTT();
        svutt.nhapThongTin();
        qlsv.themSV(svutt);
        qlsv.luuFile();
    }
}
