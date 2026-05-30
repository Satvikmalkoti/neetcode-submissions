class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(String str : strs){
            char[] c_arr = str.toCharArray();
            Arrays.sort(c_arr);
            String key = new String(c_arr);

             map.putIfAbsent(key,new ArrayList<>());
             map.get(key).add(str);
            
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
