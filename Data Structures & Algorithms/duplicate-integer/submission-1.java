class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();

        for(int num : nums){
            if(fre.containsKey(num)){
                return true;
            }

            fre.put(num, 1);
        }
        return false;
    }
}