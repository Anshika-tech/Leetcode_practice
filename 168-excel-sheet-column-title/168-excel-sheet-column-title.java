class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        int n=columnNumber;
        while(n>0){
            int r=(n-1)%26;
            s.append((char)('A'+r));
            n=(n-1)/26;
        }
        s.reverse();
        return s.toString();
    }
}