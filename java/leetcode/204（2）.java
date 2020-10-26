public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
        if (notPrimes[i]) {
        continue;
        }
        count++;
        // 从 i * i 开始，因为如果 k < i，那么 k * i 在之前就已经被去除过了
        for (long j = (long) (i) * i; j < n; j += i) {
        notPrimes[(int) j] = true;
        }
        }
        return count;
        }

// 优化做法
//https://leetcode.com/problems/count-primes/submissions/
// 204. Count Primes
