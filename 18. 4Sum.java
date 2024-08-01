import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int m = nums.length - 1;

                while (k < m) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[m];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));

                        while (k < m && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        while (k < m && nums[m] == nums[m - 1]) {
                            m--;
                        }

                        k++;
                        m--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        m--;
                    }
                }
            }
        }
        return ans;
    }
}
