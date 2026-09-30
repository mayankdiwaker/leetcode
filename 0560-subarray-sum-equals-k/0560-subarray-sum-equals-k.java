
public class Solution {
    
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
            int diff = currentSum - k;
            if (prefixSumMap.containsKey(diff)) {
                count += prefixSumMap.get(diff);
            }
            
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test 1 Result: " + subarraySum(nums1, k1)); 

        int[] nums3 = {3, 4, 7, 2, -3, 1, 4, 2};
        int k3 = 7;
        System.out.println("Test 3 Result: " + subarraySum(nums3, k3)); 
 
    }
}