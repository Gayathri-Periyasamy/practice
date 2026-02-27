class Solution {
    public int dominantIndices(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int count=0;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                count++;
            }
            if(count==0){
                continue;
            }
            double avg=(double)(sum/count);
            if(nums[i]>avg) ans++;
        }
        return ans;
    }
}