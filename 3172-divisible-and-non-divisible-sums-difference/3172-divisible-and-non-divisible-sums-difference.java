class Solution {
    public int differenceOfSums(int n, int m) {
        int dc=0;
        int nd=0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                dc+=i;
            }
            else{
                nd+=i;
            }
        }  
        return nd-dc;
          }
}