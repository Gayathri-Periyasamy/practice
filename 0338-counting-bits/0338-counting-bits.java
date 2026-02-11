class Solution {
    public int[] countBits(int n) {
     int[] ans=new int[n+1];
     for(int i=0;i<=n;i++){
        int count=0;
        for(int j=0;j<32;j++){
            if(((i>>j)&1)==1)
            count++;
        }
        ans[i]=count;
     }   
     return ans;
    }
}