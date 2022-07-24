public class perfect {
    
    public static boolean isperfect(int n){
             int sum = 0;
             for(int i= 1; i<n; i++){
                if(n%i==0)
                sum= sum+i;
             }
             if(n==sum)
             return true;
             else
             return false;
    }
     public static void main(String args[]){
        int n=6;
        
       if (isperfect(n)){
        System.out.println("this is perfect no");
       }
        else{
            System.out.println("this is not perfect no");
        }
     }
}
