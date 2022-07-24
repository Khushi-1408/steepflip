import java.util.Scanner;
public class prime {
    public static void main(String[]args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                temp =temp +1;
            }
        }
        if(temp>0){
            System.out.println("nonprime");
        }
         else{
            System.out.println("prime");
         }  

    }
    
 }


 
 //another method for finding prime no ussing boolean data type
 public class prime{
 public static boolean isPrime(int N) {

    for (int i = 2; i < N; i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;

  }
  public static void main(String args[]) {
    int n = 20;
    boolean ans = (isPrime(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non-Prime Number");
    }
  }
}