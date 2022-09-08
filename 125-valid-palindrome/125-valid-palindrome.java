class Solution {
    public boolean isPalindrome(String s) {
    
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replaceAll(" ","");
        s=s.toLowerCase();
       int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)==s.charAt(h)){
                l++;
                h--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}