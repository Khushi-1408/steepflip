public class reverse {
    public static int rev( int n){
         int rem; int rev = 0;
        while(n>0){
            rem =n%10;
            rev = rev*10 + rem;
        n = n/10;
            }
            return rev;
    }
    public static void main(String[] args) {
        int n = 123456;
       
        System.out.println("the reverse of a given no. is" + rev(n));
    }
    
}
