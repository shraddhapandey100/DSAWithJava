class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> dfs = new ArrayList<>();
        dfs(adj, visited, dfs, 0);
        return dfs;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited, ArrayList<Integer> dfs,
    int currentNode){
        visited[currentNode] = true;
        dfs.add(currentNode);
        for(int n: adj.get(currentNode)){
            if(!visited[n]){
                dfs(adj, visited, dfs, n);
            }
        }
    }
        
    
}