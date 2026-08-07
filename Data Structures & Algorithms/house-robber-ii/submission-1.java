class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Don't rob the last house
        int case1 = robDP(nums, 0, n - 2);

        // Case 2: Don't rob the first house
        int case2 = robDP(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robDP(int[] nums, int start, int end) {

        int n = end - start + 1;

        int[] dp = new int[n];

        dp[0] = nums[start];

        if (n == 1) {
            return dp[0];
        }

        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {

            int currentHouse = nums[start + i];

            dp[i] = Math.max(
                dp[i - 1],
                currentHouse + dp[i - 2]
            );
        }

        return dp[n - 1];
    }
}