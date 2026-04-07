
public class Sum_array {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        // int sum= 0;
        // for(int i = 0; i<=nums.length-1 ;i++){
        //     sum = sum+nums[i];
            
        // }
        // System.out.println(sum);
        // Using Recursion
        System.out.println(sume(nums, 0, 0));
    }

    public static int sume(int[] nums, int sum, int index) {
        if (index == nums.length) {
            return sum;
        }
        return sume(nums, sum + nums[index], index + 1);
        /*
        public static int sume(int[] nums,  int index) {
        
        if (index == nums.length) {
            return 0;
        }
        return nums[index]+ sume(nums , index+1);
    }
         */
    
    }
}
