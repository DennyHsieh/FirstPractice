package Leetcode;

public class TwoSum {
//	public static void main(String[] args) {
//		int twoSum([6,3,8],14);
//	}
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
