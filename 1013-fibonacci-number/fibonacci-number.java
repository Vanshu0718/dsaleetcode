class Solution {
    public int fib(int n) {
       int a = 0;
        int b = 1;
        for(int i = 0; i<n-1; i++){
             
                    int next = a + b;

            a = b;
            b = next;
        }
        if(n==0){
            return 0;
        }
        else {return b;}
    }
}