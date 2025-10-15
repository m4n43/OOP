
package ttfilebai2.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhvienUTT> dsutt = new ArrayList<>();
        ArrayList<SinhvienHTTT> dshttt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int c;
        int n, m;
        try {
            ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("svutt.obj"));
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("svhttt.obj"));
            
            System.out.println("Nhap sinh vien muon dien: ");
            System.out.println("1. Sinh vien UTT");
            System.out.println("2. Sinh vien HTTT");
            
            c = sc.nextInt();
            sc.nextLine();
            if (c==1) {
                System.out.print("Nhap so sinh vien: ");
                n = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap sinh vien thu "+(i+1));
                    SinhvienUTT sv = new SinhvienUTT();
                    sv.nhap();
                    dsutt.add(sv);
                    oos1.writeObject(dsutt);
                }
                oos1.close();
            } else if (c==2){
                System.out.print("Nhap so sinh vien: ");
                m = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < m; i++) {
                    System.out.println("Nhap sinh vien thu "+(i+1));
                    SinhvienHTTT sv = new SinhvienHTTT();
                    sv.nhap();
                    dshttt.add(sv);
                    oos2.writeObject(dshttt);
                }
                oos2.close();
            } else System.out.println("Khong co ");
            System.out.println("Danh sach sinh vien HTTT:");
            for (SinhvienHTTT sv : dshttt) {
                System.out.println(sv);
            }
            System.out.println("Danh sach sinh vien UTT:");
            for (SinhvienUTT sv : dsutt) {
                System.out.println(sv);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
