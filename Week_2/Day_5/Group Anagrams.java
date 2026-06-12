class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) { // Check for empty inputs
            return new ArrayList<>();
        }
        Map<String,List<String>> frequencyStringsMap=new HashMap<>();
        for(String str:strs) {
            String frequencyString=getFrequencyString(str);
            // If the frequency string is present, add the string to the list
            if(frequencyStringsMap.containsKey(frequencyString)) {
                frequencyStringsMap.get(frequencyString).add(str);
            } 
            // else create a new list
            else { 
                List<String> strList=new ArrayList<>();
                strList.add(str);
                frequencyStringsMap.put(frequencyString,strList);
            }
        }
        return new ArrayList<>(frequencyStringsMap.values());
    }

    private String getFrequencyString(String str) {
        int[] freq=new int[26]; // Frequency buckets
        for(char c:str.toCharArray()) { // Iterate over each character
            freq[c-'a']++;
        }
        StringBuilder frequencyString=new StringBuilder(""); // Start creating the frequency string
        char c='a';
        for(int i:freq) {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }
}