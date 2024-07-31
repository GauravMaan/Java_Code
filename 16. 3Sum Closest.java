class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int cs = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int cus = nums[i] + nums[l] + nums[r];
                if (cs == target) {
                    return cs;
                }
                if (Math.abs(cus - target) < Math.abs(cs - target)) {
                    cs = cus;
                }
                if (cus < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return cs;
    }

}
