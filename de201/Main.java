
package de201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<HangHoa> dshh = new ArrayList<>();
        Scanner sc = new Scanner(new File("hanghoa.txt"));
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] p = line.split("-");
            if(p[0].equalsIgnoreCase("DT")) {
                dshh.add(new DienThoai(Integer.parseInt(p[5]), p[1], p[2], Integer.parseInt(p[3]), Integer.parseInt(p[4])));
            } else {
                dshh.add(new MayTinhBang(p[5], p[1], p[2], Integer.parseInt(p[3]), Integer.parseInt(p[4])));
            }
        }
        sc.close();
    }
}
