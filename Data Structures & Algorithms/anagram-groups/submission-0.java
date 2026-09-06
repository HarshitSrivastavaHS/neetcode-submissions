class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        
        for (String str: strs) {
            char[] ch = str.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
