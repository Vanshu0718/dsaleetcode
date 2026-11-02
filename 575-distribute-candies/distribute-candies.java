class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<candyType.length; i++){
            set.add(candyType[i]);
        }
       // if(candyType[i] == 0){
         //   return -1;
        //}
        //else{
           int result = set.size();
           return Math.min(result, candyType.length / 2);

        //}
    }}
