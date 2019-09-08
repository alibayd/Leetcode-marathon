class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                q=i;
                break;
            }else if(nums[i]>target){
                q=i;
                break;
            }else if(target>nums[nums.length-1]){
                q=nums.length;
            }
        }
        return (q);
    }
}
