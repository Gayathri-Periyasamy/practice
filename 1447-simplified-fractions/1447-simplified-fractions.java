class Solution {
    int gcd(int p,int q){
        if(q==0)
        return p;
        return gcd(q,p%q);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n-1;i++)
        for(int j=i+1;j<=n;j++)
        if(gcd(i,j)==1){
            String x=i+ "/"+j;
            ans.add(x);
        }
        return ans;
    }
}