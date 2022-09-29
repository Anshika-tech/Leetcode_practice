class Solution {
     List<String>l=new ArrayList<>();
    public static void generate(int n,int open,int close,String ans,List<String>l){
        if(open==n&&close==n){
            l.add(ans);
        }
        if(open<n){
            generate(n,open+1,close,ans+"(",l);
        }
        if(close<open){
             generate(n,open,close+1,ans+")",l);
        }
    }
    public List<String> generateParenthesis(int n) {
        
         generate(n,0,0,"",l);
        return l;
    }
    
}