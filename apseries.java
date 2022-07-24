import java.util.Scanner;
public class apseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();
     int sum= 0;
     for(int i=1; i<=n; i++)
     {
     sum += a;
     a += d;
     }
    // sum = n/2*(2*a+(n-1)*d);
     
     System.out.println("the sum of the ap series is:"+ sum);

    }
    
}
