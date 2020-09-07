class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(graph,0,graph.length -1,new ArrayList(),result);
        return result;
    }

    private void dfs(int[][] graph,int src, int dest,List<Integer> list,ArrayList<List<Integer>> result){
        if (src == dest){
            result.add(list);

        }
        list.add(src);

        for(Integer vertex: graph[src]){
            List<Integer> copy = new ArrayList<>(list);
            dfs(graph,vertex,dest,copy,result);
        }
    }
}


//medium question
//https://leetcode.com/problems/all-paths-from-source-to-target/submissions/
//797. All Paths From Source to Target
