class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        while(i<str1.length() && i<str2.length()&&
        str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return str1.substring(0,i);
    }
}