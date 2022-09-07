class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1]){
                return nums[mid];
                
            }
            else if(nums[l]<=nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}