//find thre first occurrence of a substring in a string
class solution {
    static int StrStr(String str, String s) {
        int n = str.length();
        int m = s.length();
        for (int i = 0; i < n; i++) {
            while (i < n && str.charAt(i) != s.charAt(0))
                i++;
            if (i < n) {
                int k = i + 1;
                int l = 1;
                while (k < n && l < m && str.charAt(k) == s.charAt(l)) {
                    k++;
                    l++;
                }
                if (l == m) {
                    return i;
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String s = "leeto";
        System.out.println(StrStr(str, s));
    }
}