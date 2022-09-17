class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg_sum=0.0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int w_sum=sum;
        for(int i=k;i<nums.length;i++){
            w_sum+=nums[i]-nums[i-k];
            sum=Math.max(sum,w_sum);
        }
       
        avg_sum=(double)sum/k;
        return avg_sum;
    }
}