

public class palinrange{
    public static boolean ispalin(int n){
        int rem;
        int rev=0;
        int temp = n;
        while( temp>0){
            rem= temp%10;
            rev= rev*10+rem;
             temp = temp/10;

        }
        if(rev==n)return true;
         else 
         return false;

    }
    public static void main(String[]args){
        int min = 1;
        int max = 100;
        for(int i=min; i<=max; i++){
            if(ispalin(i)){
                System.out.println("the list pf palindrome range are" +i);
            }
        }
    }
}
