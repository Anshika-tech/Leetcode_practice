class Solution {
    public char findTheDifference(String s, String t) {
        int i=0;
        int res=0;
      for(;i<s.length();i++){
         res=res-(int)(s.charAt(i))+(int)(t.charAt(i));
      }
       return (char)(res+t.charAt(s.length()));
    }
}