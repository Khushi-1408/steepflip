import java.util.*;
public class arms {
    public static void main(String[] args) {
        int n = 281;
        int temp = n;
        int count =0;
        while(temp>0){
            temp = temp/10;
            count++;
        }

        int sum=0;
        while(temp>0){
        int rem = temp%10;
        sum = sum +(int) Math.pow(rem,count);
        temp=temp/10;
        }
        if(sum==n){
            System.out.println("this is armnstrong number");
        }
        else{
            System.out.println("this in not armastrong no");
        }

    
    }
    
}
