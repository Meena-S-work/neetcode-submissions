class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int res = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                res = num;
            }
            count += (num == res)? 1 : -1;
        }
        return res;
    }
}