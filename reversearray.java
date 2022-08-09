public class reversearray {
    public static void main(String[] args) {
        int arr[]= {7,4,9,10,5,0};
        for(int i=0; i<arr.length; i++)
        System.out.println(arr[i]);
        System.out.println("the reverse of the given array is:");
        System.out.println(" ");
        for(int i=arr.length-1; i>=0; i--)
        System.out.println(arr[i]);
        
    }
    
}
