
package ttfilebai3.obj;

import java.io.File;
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
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> ds = new ArrayList<>();
        System.out.print("Nhap so sach: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            Books b = new Books();
            System.out.println("Nhap thong tin sach thu "+(i+1));
            b.add();
            ds.add(b);
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));
            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("D:/cp/copybooks.dat"));
            oos.writeObject(ds);
            for (Books d : ds) {
                System.out.println(d);
            }
            File f = new File("books.dat");
            
            System.out.println("Ban co muon xoa file books.dat khong?(y/n)");
            String c = sc.nextLine();
            if(c=="y") {
                oos2.writeObject(ds);
                f.delete();
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
