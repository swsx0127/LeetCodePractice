import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> exists = new HashMap<>();
        int startIndex = 0;
        int curLength = 0;
        int maxLength = 0;
        for (int curIndex = 0; curIndex < s.length(); ++curIndex) {
            Character c = s.charAt(curIndex);

            if (exists.containsKey(c)) {
                curLength = curIndex - startIndex;
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
                int existsIndex = exists.get(c);
                for (int i = startIndex; i <= existsIndex; ++i) {
                    exists.remove(s.charAt(i));
                }

                startIndex = existsIndex + 1;
            }
            else if (curIndex == s.length() - 1) {
                curLength = curIndex - startIndex + 1;
                if (curLength > maxLength) {
                    maxLength = curLength;
                }
            }

            exists.put(c, curIndex);

        }
        return maxLength;
    }
}
