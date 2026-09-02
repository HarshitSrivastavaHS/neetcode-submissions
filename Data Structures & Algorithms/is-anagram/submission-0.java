class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            int count = sMap.getOrDefault(c, 0);
            sMap.put(c, count+1);
        }

        for (int i = 0; i<t.length(); i++) {
            char c = t.charAt(i);
            int count = tMap.getOrDefault(c, 0);
            tMap.put(c, count+1);
        }

        for (Map.Entry<Character, Integer> entry: sMap.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();

            if (!tMap.containsKey(k) || tMap.get(k) != v)
                return false;
        }
        return true;
    }
}
