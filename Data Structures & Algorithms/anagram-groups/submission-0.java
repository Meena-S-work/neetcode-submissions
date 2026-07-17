class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
            for(String s: strs){
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String st = new String(charArray);
                res.putIfAbsent(st, new ArrayList<>());
                res.get(st).add(s);
            }
            return new ArrayList<>(res.values());
        
    }
}
