
class Solution {
    public long maximumTripletValue(int[] nums) {
        long i=0;
        long j=0;
        long k=0;
        for(int n:nums){
            i=Math.max(i,j*n);
            j=Math.max(j,k-n);
            k=Math.max(k,n);
        }
        return i;
    }

}