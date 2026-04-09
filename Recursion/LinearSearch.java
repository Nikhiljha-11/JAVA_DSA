import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = {3,5,2,5,6};
        System.out.println(ls(nums, 6, 0));

    }
    //  public static boolean ls(int [] nums , int target , int index){
    //         if(index==nums.length) {
    //             return false;
    //         }
    //         if(nums[index ]== target){
    //             return true;
    //         }
    //         return ls(nums, target, index+1);
    // }
     public static int ls(int [] nums , int target , int index){
            if(index==nums.length) {
                return -1;
            }
            if(nums[index ]== target){
                return index;
            }
            return ls(nums, target, index+1);
    }
}
