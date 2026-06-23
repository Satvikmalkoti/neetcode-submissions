class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            heap.offer(stone);
        }
        while(heap.size()>1){
            int y = heap.poll();
            int x = heap.poll();

            int z = y-x;
            if(z>0){
                heap.offer(z);
            }
        }
        if (heap.size()==0) return 0;
        else return heap.peek();
    }
}
