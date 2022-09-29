class Solution {
    public static void lexical(int curr,int n,List<Integer>l){
        if(curr>n){
            return;
        }
        if(curr!=0){
             l.add(curr);
        }
       
        int i=0;
        if(curr==0){
            i=1;
        }
       
        for(;i<=9;i++){
            lexical(curr*10+i,n,l);
        }
    }
    
    public List<Integer> lexicalOrder(int n) {
        List<Integer>l=new ArrayList<>();
        lexical(0,n,l);
        return l;
        
    }
}