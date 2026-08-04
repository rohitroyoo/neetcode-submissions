class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (Math.abs(target) > sum || (sum + target) % 2 != 0)
            return 0;

        int diff = (sum + target) / 2;

        return ans(nums, diff);
    }

    private int ans(int[] nums, int diff) {

        int n = nums.length;
        int[][] dp = new int[n + 1][diff + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= diff; j++) {

                dp[i][j] = dp[i - 1][j];

                if (nums[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][diff];
    }
}