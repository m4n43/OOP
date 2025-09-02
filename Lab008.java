import java.util.Scanner;
public class Lab008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float s = 0;
        float gt = 1;
        for (int i=1; i<=n; i++) {            
            gt*=i;
            s+=i/gt;
        }
        System.out.printf("Ket qua: %f", s);
    }    
}
