import java.util.HashMap;

public class Solution {

    // learn from discussion
    // not necessary to store target-num into map, so comes the following solution
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numIndice = new HashMap<>(nums.length);

        for (int index = 0; index < nums.length; ++index) {
            int num = nums[index];

            if (numIndice.containsKey(target - num)) {
                result[1] = index;
                result[0] = numIndice.get(target - num);
                break;
            }
            else if (!numIndice.containsKey(num)) {
                numIndice.put(num, index);
            }

        }

        return result;
    }

    // same value will not be regard as same element
    public int[] twoSum_v2(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numPairs = new HashMap<>(nums.length);
        HashMap<Integer, Integer> numIndice = new HashMap<>(nums.length);

        for (int index = 0; index < nums.length; ++index) {
            int num = nums[index];

            if (numPairs.containsKey(num)) {
                result[1] = index;
                result[0] = numIndice.get(numPairs.get(num));
                break;
            }
            else if (!numIndice.containsKey(num)) {
                // if a duplicated number appeared and the twice of this number equals to target,
                // this number will meet the previous condition
                numIndice.put(num, index);
                numPairs.put(target - num, num);  // we can know the another expected number in o(1)
            }

        }

        return result;
    }

    // ques: will same value be regard as same element?
    public int[] twoSum_v1(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numPairs = new HashMap<>(nums.length);
        HashMap<Integer, Integer> numIndice = new HashMap<>(nums.length);

        for (int index = 0; index < nums.length; ++index) {
            int num = nums[index];

            // duplicated number maybe given in the array of nums, so we just need to record once
            if (!numIndice.containsKey(num)) {
                numIndice.put(num, index);
                numPairs.put(target - num, num);  // we can know the another expected number in o(1)
            }

            // the same element could not be used twice
            if (numPairs.containsKey(num) && numPairs.get(num) != num) {
                result[1] = numIndice.get(num);
                result[0] = numIndice.get(numPairs.get(num));
                break;
            }
        }

        return result;
    }
}
