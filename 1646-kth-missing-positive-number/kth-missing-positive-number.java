class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int number = 1;

        for (int i = 0; i < arr.length; i++) {
            while (number < arr[i]) {
                count++;

                if (count == k) {
                    return number;
                }

                number++;
            }

            number++;
        }

        while (true) {
            count++;

            if (count == k) {
                return number;
            }

            number++;
        }
    }
}