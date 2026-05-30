
class Solution {

     public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(":").append(s);
        }
        return sb.toString();
    }

     public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int colon = s.indexOf(':', i);
            int length = Integer.parseInt(s.substring(i, colon));
            i = colon + 1;
            String str = s.substring(i, i + length);
            res.add(str);
            i += length;
        }
        return res;
    }
}
