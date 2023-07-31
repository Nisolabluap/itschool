package session2;

import java.util.HashMap;

public class Homework {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return null; // Return null if no such pair is found
    }

    public static void main(String[] args) {
        int[] nums = { 3, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two elements that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
