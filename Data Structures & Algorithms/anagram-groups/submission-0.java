class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i =0; i < strs.length ; i++){
            if(visited[i]){
                continue;
            }
            Map<Character, Integer> map = new HashMap<>();
            for(Character ch : strs[i].toCharArray()){
                int count = map.getOrDefault(ch,0);
                map.put(ch,++count);
            }

            List<String> list1 = new ArrayList<>();
            list1.add(strs[i]);
            for(int j = i+1; j < strs.length ; j++){
                Map<Character, Integer> map1 = new HashMap<>();
                for(Character ch : strs[j].toCharArray()){
                    int count = map1.getOrDefault(ch,0);
                    map1.put(ch,++count);
                }
                if(map.equals(map1)){
                    visited[j] = true;
                    list1.add(strs[j]);
                }
            }
            if(!list1.isEmpty()){
                list.add(list1);
            }
        }
        return list;
    }
}
