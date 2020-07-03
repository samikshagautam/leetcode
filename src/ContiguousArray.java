import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = -1;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) {
                maxLen = Math.max(i - map.get(sum), maxLen);
            } else {
                map.put(sum, i);
            }
        }
        return maxLen == -1 ? 0 : maxLen;

    }
}


