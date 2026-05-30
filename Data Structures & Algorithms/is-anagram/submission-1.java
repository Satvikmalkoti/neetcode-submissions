class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // HashMap<Character,Integer> mapS = new HashMap<>();
        // HashMap<Character,Integer> mapT = new HashMap<>();

        // for(int i  = 0 ; i < s.length() ; i++){
        //    mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
        //    mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
 
        // }
        // if(mapT.equals(mapS)){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        if(s.length() != t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0 ; i< s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
