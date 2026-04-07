public class Reversearray {
    public static void main(String[] args) {
       int [] nums ={3,5,6,2,4};
        for(int x : nums) System.out.print(x + " ");
        System.out.println();
        Reverse(nums,0,nums.length-1);
        for(int x : nums ) System.out.print(x + " ");
    }
    public static void Reverse(int [] nums , int s , int e){
        if(s >= e) return;
        int temp;
         temp = nums[s];
         nums[s] = nums[e];
         nums[e] = temp;

        Reverse(nums, s + 1, e - 1);
    }
}
