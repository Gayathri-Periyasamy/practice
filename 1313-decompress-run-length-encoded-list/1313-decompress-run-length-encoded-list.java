class Solution {
    public int[] decompressRLElist(int[] nums) {
      ArrayList<Integer>arr=new ArrayList<>();
      int n=nums.length;
      for(int i=0;i<n;i+=2){
        int freq=nums[i];
        int val=nums[i+1];
        while(freq-->0){
            arr.add(val);
        }
      }  
      n=arr.size();
      int res[]=new int[n];
      for(int i=0;i<n;i++){
        res[i]=arr.get(i);
      }
      return res;
    }
}