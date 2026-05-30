class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int longest = 0;

        for(int num : set){
            // if the num-1 doesnt exist , it means that is a start to a sequence,
            // but if num-1 does exist, that means that there is a smaller start to the sequence, hence we dont check sequence from the num, and wait till we get to the num-1 number, and start sequence from there
            if(!set.contains(num-1)){

                int currentnum = num;
                int len = 1;
                // now check till for the longest sequence, hence till set contains num+1, or number that is greater than current num by 1
                while(set.contains(currentnum+1)){
                    currentnum = currentnum+1;
                    len++;
                    }

                longest = Math.max(len,longest);  
            }
            
        }
        return longest;

    }
}
