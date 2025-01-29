package dev.dinesh;

import java.util.Arrays;
import java.util.HashMap;

public class PairWithTargetSum {
    public static void main(String[] args) {

        int[] input = {2, 5, 9, 11};
        int target = 11;

        System.out.println(Arrays.toString(findPair(input, target)));
    }

    public static int[] findPair(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i]) && nums[i] != (target / 2)) {

                int[] pairs = new int[2];
                pairs[0] = map.get(target - nums[i]);
                pairs[1] = i;

                return pairs;
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
