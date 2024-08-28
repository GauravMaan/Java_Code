class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int Index = 0;
        if (ruleKey.equals("type")) {
            Index = 0;
        } else if (ruleKey.equals("color")) {
            Index = 1;
        } else if (ruleKey.equals("name")) {
            Index = 2;
        }
        for (List<String> item : items) {
            if (item.get(Index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
