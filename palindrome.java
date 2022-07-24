public class palindrome{
     public static int rev(int m){
 
        int rem;        int rev= 0;
        while(m>0){
         rem = m%10;
         rev= rev*10+rem;
         m = m/10;
        }
        return rev;
     }
    public static void main(String[] args) {
        int n=121;
        int temp = n;
         int output =  rev(n);
         
         if(output == n)
         System.out.println("n is palindrome");
         else
         System.out.println("n is not palindrome");
    }
}