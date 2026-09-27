class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        byte[] prime = new byte[n];

        int count = n-2;

        for(int i = 2; i*i<n; i++){
            if(prime[i]== 0){
                for(int j = i*i; j<n; j+=i){
                    if(prime[j] == 0){
                        prime[j] = 1;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}