import java.util.Scanner;
public class Lab010 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=n; n>0; n/=10) {
            s+=(n%10);
        }
        System.out.print(s);
    }    
}
