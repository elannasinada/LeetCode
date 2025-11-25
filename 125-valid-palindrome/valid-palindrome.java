class Solution {
    public boolean isPalindrome(String s) {
        int i= 0;
        s = s.replaceAll("[^A-Za-z0-9]","");
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        while (i< s.length()){
            for (int j=s.length()-1 ; j>=0; j--){
                if (charArray[i] == charArray[j]){
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;        
    }
}