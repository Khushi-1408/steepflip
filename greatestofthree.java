import javax.lang.model.util.ElementScanner14;

public class greatestofthree {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        int c = 30;
        if(a>b && a>c){
            System.out.println(" the greatest of three digits are" + a);
        }
          else if(b>a && b>c){
            System.out.println(" the greates of three digit are"+ b);
        }
        else{
            System.out.println(" the greatest of three disgits are" + c);
        }
    
    }
    
}
