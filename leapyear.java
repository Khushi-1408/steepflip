public class leapyear {
     public static boolean leap(int y){
        if(y%400==0)
        return true;
        if(y%100==0)
        return  false;
        if(y%4==0)
        return true;
        return  false;
         
     }

    public static void main(String[] args) {
        int  y =2022;
         if((leap(y))==true)
         System.out.println("yes");
         else
            System.out.println("no");
         

        
    }
    
}
