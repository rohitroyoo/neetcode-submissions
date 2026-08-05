class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int ans = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        return ans;
    }
}
