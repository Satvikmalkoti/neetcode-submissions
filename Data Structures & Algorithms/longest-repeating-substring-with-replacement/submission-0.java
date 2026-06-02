class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxfreq = 0;
        int maxlen = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(c));

            while ((end - start + 1 - maxfreq) > k) {  //<-- if windowsize - maxfreq is greater than k replacements, then move the start of the window till its less than k to make window valid, otherwise the window is not valid
                char firstChar = s.charAt(start);
                map.put(firstChar, map.get(firstChar) - 1);
                start++;
            }

            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}
