class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
         int max = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            // if (map.containsKey(ch) && map.get(ch)>=start ) {
            //     start = map.get(ch) + 1;
            // }
            while(map.containsKey(ch)){
                map.remove(s.charAt(start));
                start++;

            }
            map.put(ch,end);
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
