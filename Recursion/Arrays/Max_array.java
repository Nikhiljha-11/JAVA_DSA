package Arrays;
public class Max_array {
    public static void main(String[] args) {
        int [] nums = {-1, -4,-8};
        System.out.println(Maxi(nums, 0));
    }
    public static int Maxi(int [] nums ,  int index){
        if(index == nums.length){
            return Integer.MIN_VALUE;

        }
        return Math.max(nums[index], Maxi(nums, index+1));
    }
}
