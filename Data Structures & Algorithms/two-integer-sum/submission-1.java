class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i =0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[0];

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < nums.length;i++){
            int need = target - nums[i];
            if(list.contains(need)){
                return new int[]{list.indexOf(need),i};
            }
            list.add(nums[i]);
        }
        return new int[]{-1,-1};
    }
}
