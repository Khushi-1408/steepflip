import java.util.Arrays;

public class sortarray {
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
  public static void main(String[] args) {
    int arr1[]={7,4,8,1 ,23};
    System.out.println("the smallest of this arr is:" + sort(arr1));
    int arr2[]={9,51,83};
    System.out.println("the smallest of this arr2 is:"+ sort(arr2));
  }
    
}
