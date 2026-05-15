class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length ; i++){
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String(chArr);
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
