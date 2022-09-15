class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        ArrayList<Integer>a=new ArrayList<>();
           int n=digits[digits.length-1]+1;
             c=n/10;
            a.add(n%10);
            
        for(int i=digits.length-2;i>=0;i--){
             n=digits[i]+c;
             c=n/10;
            a.add(n%10);
            
        }
        if(c!=0){
            a.add(c);
        }
        Collections.reverse(a);
        int[] arr=a.stream().mapToInt(i->i).toArray();
        
        return arr;
        
    }
}