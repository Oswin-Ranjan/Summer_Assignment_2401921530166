class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // We sort the array first because if after sorting the first and last string will have common prefix then the middle strings will also contain that prefix
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i<str1.length()) {
            if(str1.charAt(i)==str2.charAt(i)) {
                i++;
            }
            else {
                break;
            }
        }
        return i==0?"":str1.substring(0,i);
    }
}