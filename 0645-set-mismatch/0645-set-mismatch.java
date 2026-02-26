class Solution {
    public int[] findErrorNums(int[] nums) {
        int []res=new int[2];
        int n=nums.length;
        boolean[] seen=new boolean[n+1];
        int repeated=-1;
        int missing=-1;
        for(int i:nums){
            if(seen[i]==true){
                repeated=i;
            }else{
                seen[i]=true;
            }
        }
        for(int i=1;i<seen.length;i++){
            if(!seen[i]){
                missing=i;
            }
        }
        res[0]=repeated;
        res[1]=missing;
        return res;
    }
}