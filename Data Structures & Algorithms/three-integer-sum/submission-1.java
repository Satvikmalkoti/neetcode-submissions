class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int num1 = nums[i];
            for(int j = i+1 ; j<nums.length-1;j++ ){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int num2 = nums[j];
                int num3 = -(num1 + num2);
                int l = j+1;
                int r = nums.length-1;
                while(l<=r){
                    int mid = l + (r-l)/2;
                    if(nums[mid] == num3){
                        ans.add(new ArrayList<>(List.of(num1,num2,num3)));
                        break;
                    }
                    else if(nums[mid]<num3){
                        l = mid+1;
                    }
                    else{
                        r = mid-1;
                    }
                }
            }
        }
        return ans;
    }
}
