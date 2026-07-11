class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();

        for(int num : nums){
            fre.put(num, fre.getOrDefault(num, 0) + 1);

            if(fre.get(num) > nums.length / 2){
                return num;
            }
        }
        return -1;

        


    }
}