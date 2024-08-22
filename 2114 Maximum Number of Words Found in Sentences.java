class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        
        return maxWords;
    }
}
