class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        outer: 
        for (int i = 0; true; i++) {
            if (strs[0].length() <= i) {
                break;
            }
            char ch = strs[0].charAt(i);
            for (int j = 1; j<strs.length; j++) {
                String str = strs[j];
                if (str.length() <= i) {
                    break outer;
                } else if (str.charAt(i) != ch) {
                    break outer;
                }
            }
            prefix+=ch;
        }

        return prefix; 
    }
}