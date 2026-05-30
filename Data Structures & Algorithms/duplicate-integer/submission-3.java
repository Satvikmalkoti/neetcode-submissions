class Solution {
    public boolean hasDuplicate(int[] nums) {
    //   HashMap<Integer,Integer> map  = new HashMap<>();
    //   for(int i  = 0;i<nums.length;i++){
    //     if(map.containsKey(nums[i])){
    //         return true;
    //     }
    //             map.put(nums[i],map.getOrDefault(nums[i],0)+1);

    //   }  return false;

    Arrays.sort(nums);
    for(int i = 1;i<nums.length;i++){
        if(nums[i] == nums[i-1]){
            return true;
        }
    }return false;
    }
}