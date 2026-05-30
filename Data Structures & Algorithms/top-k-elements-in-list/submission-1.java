class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqmap = new HashMap<>();
        for (int i : nums) {
            freqmap.put(i, freqmap.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxheap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxheap.addAll(freqmap.entrySet());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> pair = maxheap.poll();
            arr[i] = pair.getKey();
        }
        return arr;
    }
}
