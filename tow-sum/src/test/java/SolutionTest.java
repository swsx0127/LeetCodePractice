import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution sl = new Solution();


    // test data given by problem
    @Test
    public void DemoTest() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] rslt = sl.twoSum(nums, target);
        assertEquals(rslt[0], 0);
        assertEquals(rslt[1], 1);
    }

    @Test
    public void DuplicationInResultTest() {
        int[] nums = new int[] {7, 5, 11, 5, 7, 1, 7, 11, 15};
        int target = 10;
        int[] rslt = sl.twoSum(nums, target);
        assertEquals(rslt[0], 1);
        assertEquals(rslt[1], 3);
    }

    @Test
    public void DuplicationNotInResultTest() {
        int[] nums = new int[] {7, 5, 11, 5, 7, 1, 7, 11, 15};
        int target = 20;
        int[] rslt = sl.twoSum(nums, target);
        assertEquals(rslt[0], 1);
        assertEquals(rslt[1], 8);
    }


}
