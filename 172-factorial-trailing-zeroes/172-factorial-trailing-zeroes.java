class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n!=0){
            int t=n/5;
            c+=t;
            n=t;
            
        }
        
        return c;
    }
}