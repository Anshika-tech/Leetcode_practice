class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        String s1="";
        for(int i=0;i<k;i++){
            s1+=s.charAt(i);
        }
       
        int c=0;
        if(num%(Integer.parseInt(s1))==0){
            c++;
        }
        int j=1;
        String w=s1;
     for(int i=k;i<s.length();i++){
         w=w+s.charAt(i);
        w=w.substring(1,w.length());
        
         if(Integer.parseInt(w)!=0){
          if(num%(Integer.parseInt(w))==0){
            c++;
        }
         }
     }
        return c;
    }
}