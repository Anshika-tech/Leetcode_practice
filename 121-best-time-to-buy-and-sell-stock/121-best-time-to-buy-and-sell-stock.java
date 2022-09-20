class Solution {
    public int maxProfit(int[] prices) {
        int m=Integer.MAX_VALUE;
        int n=0;
        for(int p:prices){
            m=Math.min(m,p);
            n=Math.max(p-m,n);
        }
        return n;
    }
}