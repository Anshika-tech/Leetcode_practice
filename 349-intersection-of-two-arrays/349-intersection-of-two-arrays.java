class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&!a.contains(nums1[i])){
                    a.add(nums1[i]);
                    break;
                }
            }
        }
        
        int[] a1=a.stream().mapToInt(i->i).toArray();
        return a1;
    }
}