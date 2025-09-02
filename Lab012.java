import java.util.Scanner;
public class Lab012 {  
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang:");
        for(int i=0; i<n; i++) {
            System.out.printf("a[%d]=", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu cua mang la:");
        show(arr);
        System.out.print("\n");
        mm(arr);        
        System.out.printf("So phan tu chan la: %d\n", dem(arr));
        snt(arr);
    }
    public static void show(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mm(int[] arr) {
        int max=arr[1];
        int min=arr[1];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("GTLN la: "+ max);
        System.out.println("GTNN la: "+ min);
    }
    public static int dem(int[] arr) {
        int d = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i]%2==0)
                d++;
        }
        return d;
    }
    public static void snt(int[] arr) {
        System.out.print("Cac so nguyen to trong mang la: ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==1|arr[i]==2|arr[i]==3)
                System.out.print(arr[i]+" ");
            else{
                for(int j=2; j<=Math.sqrt(arr[i]); j++) {
                if(arr[i]%j==0)
                    continue;
                else 
                    System.out.printf(arr[i]+" ");
                }
            }            
        }
    }
    public static void find(int[] arr) {
        System.out.print("Nhap phan tu can tim: ");
        int x = sc.nextInt();
        for(int i=0; i<=arr.length; i++) {
            if(arr[i]==x) 
                System.out.printf("Phan tu x o vi tri: a[%d]", i);
        }
    }
}
