class Solution {
    int count =0;
    public int largestComponentSize(int[] nums) {

        int n=nums.length;
        DisjointSet ds=new DisjointSet(n);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int factor = 2; factor * factor <= num; factor++) {
                if (num % factor == 0) {
                    if (!map.containsKey(factor))
                        map.put(factor, i);
                    else
                        ds.unionBySize(i, map.get(factor));

                    if (!map.containsKey(num / factor))
                        map.put(num / factor, i);
                    else 
                        ds.unionBySize(i, map.get(num / factor));
                }
            }

            if (!map.containsKey(num))
                map.put(num, i);
            else
                ds.unionBySize(i, map.get(num));
        }

        int max = 1;
        int component[] = new int[n];
        for (int i = 0; i < n; i++) {
            int root = ds.findUParent(i);
            component[root]++;
            max = Math.max(max, component[root]);
        }

        return max;
    }
}
class DisjointSet{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    
    public int findUParent(int node){
        if(node == parent.get(node))
            return node;
        int ultPar=findUParent(parent.get(node));
        //Path Compression
        parent.set(node, ultPar);
        return parent.get(node);
    }

    public void unionBySize(int u, int v){
        int ultPar_u=findUParent(u);
        int ultPar_v=findUParent(v);
        if(ultPar_u == ultPar_v)
            return;
        if(size.get(ultPar_u) < size.get(ultPar_v)){
            parent.set(ultPar_u, ultPar_v);
            size.set(ultPar_v,size.get(ultPar_v) + size.get(ultPar_u));
        }
        else{
            parent.set(ultPar_v , ultPar_u);
            size.set(ultPar_u,size.get(ultPar_v) + size.get(ultPar_u));
        }
    }
}