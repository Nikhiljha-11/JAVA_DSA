

public class Sorted {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,6,7};
        System.out.println(sort(arr, 0));
    }
    public static boolean sort(int [] arr , int index){
        if(index == arr.length-1) return true;
        if(arr[index] < arr [index+1]) return false;
        return sort(arr, index+1);
    }
}
