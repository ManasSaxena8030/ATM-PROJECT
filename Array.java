import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        String[] a = { "flower", "flow", "flight" };
        System.out.println("Input: " + Arrays.toString(a));
        System.out.println("Longest Common Prefix: \"" + longestCommonPrefix(a) + "\"");

        String[] b = { "dog", "racecar", "car" };
        System.out.println("Input: " + Arrays.toString(b));
        System.out.println("Longest Common Prefix: \"" + longestCommonPrefix(b) + "\"");
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
