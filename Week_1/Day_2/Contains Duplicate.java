class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums.toCharArray())
        {
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
