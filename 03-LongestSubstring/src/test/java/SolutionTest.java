import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution sl = new Solution();

    @Test
    public void DemoTest() {
        Assert.assertEquals(3, sl.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, sl.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, sl.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(4, sl.lengthOfLongestSubstring("abcd"));
        Assert.assertEquals(1, sl.lengthOfLongestSubstring("a"));
        Assert.assertEquals(5, sl.lengthOfLongestSubstring("abcdcgfb"));
        Assert.assertEquals(5, sl.lengthOfLongestSubstring("abcdcbgfb"));
        Assert.assertEquals(7, sl.lengthOfLongestSubstring("aefcbkdcbgf"));
    }


}
