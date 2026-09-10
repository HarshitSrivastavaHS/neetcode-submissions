class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i+k<nums.length;) {
            
            nums[i] = nums[i+k];
            if (nums[i+k] == val) {
                k++;
            } else {
                i++;
            }
            
        }
        return nums.length - k;
    }
}