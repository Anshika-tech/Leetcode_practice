class Solution {
    public String largestNumber(int[] nums) {
        Scanner sc=new Scanner(System.in);
	   
	 
		   
		   int n=nums.length;
          String[] arr=new String[n];
		   for(int i=0;i<n;i++){
			   arr[i]=String.valueOf(nums[i]);
		   }
          Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")){
          return "0";
        }
        String s1="";
		for(String f:arr){
            s1+=f;
        }
        return s1;
           
	   
       
    }
}