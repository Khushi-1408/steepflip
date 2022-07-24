import java.util.Scanner;
public class sumnatural {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int sum =0;
    for(int i=1; i<=n; i++)
     sum = sum+i;
     System.out.println(" the total sum of given natural no:");
     System.out.println(sum);
}
}
