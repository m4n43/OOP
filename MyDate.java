import java.util.Scanner;
public class MyDate {
    private int day, month, year;
    public MyDate() {
        day=1;
        month=1;
        year=2025;        
    }
    public MyDate(int d, int m, int y) {
        day=d;
        month=m;
        year=y;        
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        day = sc.nextInt();
        System.out.print("Nhap thang: ");
        month = sc.nextInt();
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
    }
    public void display() {
        System.out.printf("%d/%d/%d\n", day, month, year);
    }
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        d1.display();
        MyDate d2 = new MyDate(2, 3, 1990);
        d2.display();
        MyDate d3 = new MyDate();
        d3.input();
        d3.display();
    }  
}
