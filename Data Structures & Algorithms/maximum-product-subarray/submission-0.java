class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;

        int[] maxDp = new int[n];
        int[] minDp = new int[n];

        maxDp[0] = nums[0];
        minDp[0] = nums[0];

        int answer = nums[0];

        for (int i = 1; i < n; i++) {

            int num = nums[i];

            maxDp[i] = Math.max(
                num,
                Math.max(
                    num * maxDp[i - 1],
                    num * minDp[i - 1]
                )
            );

            minDp[i] = Math.min(
                num,
                Math.min(
                    num * maxDp[i - 1],
                    num * minDp[i - 1]
                )
            );

            answer = Math.max(answer, maxDp[i]);
        }

        return answer;
    }
}
