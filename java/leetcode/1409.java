class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 1;i <= m; i++){
            p.add(i);
        }
        for (int j = 0;j<queries.length;j++){
            int num = queries[j];
            for (int k=0;k<m;k++){
                if(num == p.get(k)){
                    res[j] = k;
                    p.remove(k);
                    p.add(0,num);
                    break;
                }

            }
        }

        return res;

    }
}


//medium question
//https://leetcode.com/problems/queries-on-a-permutation-with-key/
//1409. Queries on a Permutation With Key
