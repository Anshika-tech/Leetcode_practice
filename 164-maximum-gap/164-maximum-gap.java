class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m=Integer.MIN_VALUE;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i+1]-nums[i];
           m=Math.max(a,m);
         }
        return m;
    }
}