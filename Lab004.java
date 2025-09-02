import java.util.Scanner;
public class Lab004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a==0&b==0&c==0)
            System.out.println("Phuong trinh vo so nghiem");
        else if (a==0&b==0&c!=0)
            System.out.println("Phuong trinh vo nghiem");
        else if (a==0&b!=0&c!=0)
            System.out.printf("Phuong trinh co nghiem: %f", -c/b);
        else {
            float del=b*b-4*a*c;
            if (del<0) 
                System.out.println("Phuong trinh vo nghiem");
            else if(del==0)
                System.out.printf("Phuong trinh co nghiem kep: %f", -b/(2*a));
            else
                System.out.printf("Phuong trinh co 2 nghiem phan biet: %f va %f", (-b+Math.sqrt(del))/(2*a), (-b-Math.sqrt(del))/(2*a));
        }
    }
}
