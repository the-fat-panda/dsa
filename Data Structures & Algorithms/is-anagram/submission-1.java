class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(Character str : s.toCharArray()){
            Integer count = map.getOrDefault(str,0);
            map.put(str,++count);
        }

        for(Character str : t.toCharArray()){
            if(map.getOrDefault(str,0) < 1){
                return false;
            }
            map.put(str, map.get(str) -1);    
        }

        return true;
    }
}
