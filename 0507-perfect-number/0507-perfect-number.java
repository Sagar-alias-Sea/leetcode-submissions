class Solution {
    public boolean checkPerfectNumber(int n) {
        int prime = 0;
        for(int i = 1; i*i<n; i++){
            if(n%i==0){
                prime += i;
                if(n/i!=i && n/i!=n){
                    prime = prime + (n/i);
                }
            }
        }
        
        if(prime == n) return true;
            return false;
    }
}