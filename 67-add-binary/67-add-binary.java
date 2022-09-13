class Solution {
    public String addBinary(String a, String b) {
        String a1="";
        String b1="";
        String s="";
        if(a.length()>b.length()){
            a1=a;
            b1=b;
        }
        else{
            a1=b;
            b1=a;
        }
        int c=0;
        int j=b1.length()-1;
        for(int i=a1.length()-1;i>=0;i--){
            if(j>=0){
        int n=Integer.parseInt(a1.charAt(i)+"")+Integer.parseInt(b1.charAt(j)+"")+c;
                c=n/2;
                s+=n%2;
            }
            else{
                 int n=Integer.parseInt(a1.charAt(i)+"")+c;
                c=n/2;
                s+=n%2;
                
            }
            j--;
        }
        if(c!=0){
             s+=c;
        }
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
}