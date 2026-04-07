import java.util.Arrays;

public class SumofTriangle{
   
    public static  void Triangle(int [] arr){
        if(arr.length <1){
            return;
        }
        int [] temp =  new int[arr.length-1];
        for(int i = 0; i<arr.length-1; i++){
            int x = arr[i]+arr[i+1];
             temp[i]= x;
            
        }
        Triangle(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,9};
        Triangle (arr);
    }
}