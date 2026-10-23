class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        int gold = Integer.MIN_VALUE;
        int silver = Integer.MIN_VALUE;
        int bronze = Integer.MIN_VALUE;

        int goldIndex = -1;
        int silverIndex = -1;
        int bronzeIndex = -1;

        for (int i = 0; i < n; i++) {
            if (score[i] > gold) {
                bronze = silver;
                bronzeIndex = silverIndex;

                silver = gold;
                silverIndex = goldIndex;

                gold = score[i];
                goldIndex = i;
            } else if (score[i] > silver) {
                bronze = silver;
                bronzeIndex = silverIndex;

                silver = score[i];
                silverIndex = i;
            } else if (score[i] > bronze) {
                bronze = score[i];
                bronzeIndex = i;
            }
        }

        if (goldIndex != -1) answer[goldIndex] = "Gold Medal";
        if (silverIndex != -1) answer[silverIndex] = "Silver Medal";
        if (bronzeIndex != -1) answer[bronzeIndex] = "Bronze Medal";

        for (int i = 0; i < n; i++) {
            if (answer[i] == null) {
                int rank = 1;
                for (int j = 0; j < n; j++) {
                    if (score[j] > score[i]) {
                        rank++;
                    }
                }
                answer[i] = String.valueOf(rank);
            }
        }

        return answer;
    }
}