class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        if (l < 2) return l;
        int[] lastIndex = new int[256];
        int maxl = 0, curl = 0, tmp;
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        for (int i = 0; i < l; i++) {
            tmp = lastIndex[(int) s.charAt(i)];
            if (tmp == -1 || i - tmp > curl) {
                curl++;
            } else {
                curl = i - tmp;
            }
            maxl = Math.max(maxl, curl);
            lastIndex[(int) s.charAt(i)] = i;
        }
        return maxl;
    }
}
