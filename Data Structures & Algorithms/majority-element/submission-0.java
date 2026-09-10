class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            int num = nums[i];

            int freq = frequencies.getOrDefault(num, 0) + 1;

            frequencies.put(num, freq);

            if (freq > nums.length/2) {
                return num;
            }
        }

    throw new IllegalStateException();

    }
}