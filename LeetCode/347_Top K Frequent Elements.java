/**
*Given a non-empty array of integers, return the k most frequent elements.
*
*For example,
*Given [1,1,1,2,2,3] and k = 2, return [1,2].
*
*Note: 
*You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
*Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*92ms
*/

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length ;i++ ){
            map.put(nums[i] ,map.containsKey(nums[i])? map.get(nums[i]) + 1 : 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
        pq.addAll(map.entrySet());
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i<k ;i++ ){
            arr.add(pq.poll().getKey());
        }
        return arr;
    }
}
