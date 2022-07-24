import java.util.Scanner;


public class greatestoftwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int greater= Math.max(a,b,);
        int smaller= Math.min(a,b);
        System.out.println("the greatest of these two digits:" +(greater));
        System.out.println("the smallest of these two digits:" +(smaller));

    }

    
}
