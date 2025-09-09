class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxx =0;
        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j=0; j<accounts[i].length; j++){
                sum+= accounts[i][j];
            }
            maxx = Math.max(sum, maxx); 
        }
        return maxx;
    }
}