class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1,charArr2);
    }
}
