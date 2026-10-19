class Solution {
    public int mySqrt(int x) {
        int left =0;
        int right = x;
        int answer = 0;

        while(left <= right){
            int mid = (left+right)/2;
            if(x == (long) mid * mid){
                return mid;
            }
            else if(x < (long) mid * mid){
                right = mid-1;
            }
            else if(x> (long) mid * mid){
                left = mid+1;
                                answer = mid;

            }
        }
        return answer;
    }
}