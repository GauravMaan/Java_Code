class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result=new StringBuilder();
        for(String w : word1){
        result.append(w);
    }
        StringBuilder result1 = new StringBuilder();
        for(String w : word2){
        result1.append(w);
        }
        return result.toString().equals(result1.toString());
    }

}
