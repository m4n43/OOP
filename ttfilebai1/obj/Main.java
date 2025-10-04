
package ttfilebai1.obj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenfile;
        try {
            System.out.print("Nhap so nhan vien:");
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<NhanVien> dsnv = new ArrayList<>();
            for(int i=0; i<n; i++) {
                System.out.println("Sinh vien thu: "+(i+1));
                NhanVien nv = new NhanVien();
                nv.nhapThongTin();
                nv.tinhLuong();
                dsnv.add(nv);
            }
            
            FileOutputStream fos = new FileOutputStream("nhanvien.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsnv);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nhanvien.dat"));
            ArrayList<NhanVien> docfile = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            System.out.println("Doc file: ");
            for (NhanVien nv : docfile) {
                System.out.println(nv);
            }
            File file = new File("nhanvien.obj");
            PrintWriter pw = new PrintWriter(file);
            for (NhanVien nv : docfile) {
                pw.print(nv);
            }
            pw.close();
            System.out.println("Nhap ten file: ");
            tenfile = sc.nextLine();
            File cfile = new File(tenfile);
            PrintWriter cpw = new PrintWriter(cfile);
            for (NhanVien nv : docfile) {
                cpw.print(nv);
            }
            cpw.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
