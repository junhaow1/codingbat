class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i< n;i++){
            if ( isPrime(i) ){
                count++;
            }
        }
        return count;



    }

    public boolean isPrime(int m){
        if (m<2){
            return false;
        } else {
            for (int i = 2;i<m;i++){
                if (m%i == 0){
                    return false;
                }
            }
            return true;
        }

    }
}






//
//https://leetcode.com/problems/linked-list-cycle/
// 204. Count Primes
