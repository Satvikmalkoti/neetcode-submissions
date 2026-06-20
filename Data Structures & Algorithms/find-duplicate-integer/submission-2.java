class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.containsKey(i) && map.get(i)>1) num=i;
            
        }
        return num;
    }
}
