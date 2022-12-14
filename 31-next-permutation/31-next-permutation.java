class Solution {
    static void reverse(int[] nums,int l,int h){
        while(l<=h){
            int t=nums[l];
            nums[l]=nums[h];
            nums[h]=t;
            l++;
            h--;
            
        }
    }
    public void nextPermutation(int[] nums) {
        int p=0;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        int q=0;
           for(int i=n-1;i>0;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }
        }
        if(p==0&&q==0){
            reverse(nums,0,n-1);
            return;
        }
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
        reverse(nums,p+1,n-1);
    }
}