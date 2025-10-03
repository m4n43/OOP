
package bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLNV {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("d:/KMA/Java/docfilebai1/nhanvien.dat")));
            String line = "";
            while((line = br.readLine())!=null) {
                //System.out.println(line);
                String[] arr = line.split("\\$");
                String hoTen = arr[0];
                String ngaySinh = arr[1];
                String diaChi = arr[2];
                String gioiTinh = arr[3];
                Person p = new Person(hoTen, ngaySinh, diaChi, gioiTinh);
                ds.add(p);
                System.out.println(p);
            }
            System.out.print("Nhap ten file:");
            String cfile = sc.nextLine();
            File file = new File(cfile);
            PrintWriter pw = new PrintWriter(file);
            for (Person d : ds) {
                pw.printf("%s-%s-%s-%s\n", d.hoTen, d.ngaySinh, d.diaChi, d.gioiTinh);
            }
            pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
