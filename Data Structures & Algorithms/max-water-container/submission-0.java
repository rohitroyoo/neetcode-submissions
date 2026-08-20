class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int left = 0;
        int right = n - 1;

        int max = 0;

        while(left < right){
            int w = right - left;

            int h = Math.min(heights[left], heights[right]);

            int a = w * h;

            max = Math.max(max, a);

            if(heights[left] < heights[right]){
                left++;
            } else{
                right--;
            }
        }
        return max;
    }
}
