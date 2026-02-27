class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j=0;
        String str="";
        int count=0;
        if(ruleKey.equals("type")){
            j=0;
        } else if(ruleKey.equals("color")){
            j=1;
        }else{
            j=2;
        }
        for(int i=0;i<items.size();i++){
            List<String> ans=items.get(i);
            str=ans.get(j);
            if(str.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}