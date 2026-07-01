class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charArr1 =  s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(char c : charArr1){
            charList.add(c);
        }
        char[] charArr2 =  t.toCharArray();
        for(int i=0;i<charArr2.length;i++){
            if(charList.contains(charArr2[i])){
                charList.remove((Character)charArr2[i]);
                if(charList.isEmpty()) return true;
            }
        }
        return false;
    }
}
