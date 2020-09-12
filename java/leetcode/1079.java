class Solution {
    int count = 0;

    public void traverse(char theArray[], boolean used[]) {
        count++; // count the number of sub-permutation
        for(int i = 0; i < theArray.length; i++) {
            if( used[i] || (i > 0 && theArray[i] == theArray[i - 1] && !used[i - 1]) ) // duplicate removal
                continue;
            used[i] = true;
            traverse(theArray, used);
            used[i] = false;
        }
    }

    public int numTilePossibilities(String tiles) {
        char theArray[] = tiles.toCharArray(); 
        Arrays.sort(theArray); // sort the array for duplicate removal
        traverse(theArray, new boolean[theArray.length]);
        return count - 1;
    }
}