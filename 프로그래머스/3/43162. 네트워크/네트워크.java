class Solution {

    public int solution(int n, int[][] computers) {
        // if (computers == null || computers.length == 0) {
        //     return 0;
        // }
        
        int numNet = 0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]&&computers[i][i]==1){
                dfs(computers,i,visited);
                numNet++;
            }
        }
        return numNet;
    }
    
    private void dfs(int[][]computers, int node, boolean[] visited ){
        visited[node]=true;
        for(int i=0;i<computers.length;i++){
            if(!visited[i] && computers[node][i]==1){
                dfs(computers,i,visited);
            }
        }
    }
}
