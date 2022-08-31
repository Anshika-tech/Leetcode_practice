class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            if(i==n-k){
                return nums[i];
            }
        }
        return -1;
    }
}