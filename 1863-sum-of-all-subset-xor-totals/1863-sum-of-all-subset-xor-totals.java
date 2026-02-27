class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length,totalsum=0;
        for(int mask=0;mask<(1<<n);mask++){
            int xorsum=0;
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0) xorsum^=nums[i];
            }
            totalsum+=xorsum;
        }
        return totalsum;
    }
}