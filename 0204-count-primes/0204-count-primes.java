class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int prime[] = new int[n];

        int count = n-2;

        for(int i = 2; i<n; i++){
            prime[i] = 1;
        }

        for(int i = 2; i*i<n; i++){
            if(prime[i]==1){
                for(int j = i*i; j<n; j+=i){
                    if(prime[j]==1){
                        prime[j] = 0;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}