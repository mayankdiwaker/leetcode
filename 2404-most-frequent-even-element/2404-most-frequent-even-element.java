
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int ans = -1;
        int maxCount = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }
            int frequency = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, frequency);

            if (frequency > maxCount || (frequency == maxCount && num < ans)) {
                maxCount = frequency;
                ans = num;
            }
        }

        return ans;
    }
}