public class primerange {
    public static boolean isprime(int m){
        if(m==1)
        return false;
        for(int i=2; i<m; i++){
            if(m%i==0)
            return false;
        } 
            return true;
        }
        public static void primebwrange(int a ,int b){
              for(int i=a; i<b; i++){
                if(isprime(i)){
                    System.out.println(i + " ");
                }
              }
        } 
         public static void main(String[]args){
            int a = 1;
            int b = 10;
            primebwrange(a, b);
         }
    }

