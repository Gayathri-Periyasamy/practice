class Solution {
    public String convertDateToBinary(String date) {
        String[] split=date.split("-");
        String s="";
        for(int i=0;i<split.length;i++){
            int n=Integer.parseInt(split[i]);
            s+=Integer.toBinaryString(n);
            if(i!=split.length-1) s+="-";
        }
        return s;
    }
}