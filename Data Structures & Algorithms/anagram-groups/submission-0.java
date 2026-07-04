class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
           char[] charArr = strs[i].toCharArray();
           Arrays.sort(charArr);
           String sortedStr = String.valueOf(charArr);
           if(!result.containsKey(sortedStr)) result.put(sortedStr, new ArrayList<>());
           result.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(result.values());
    }
}