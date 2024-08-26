class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] demo = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            demo[i] = i;
        }

        Arrays.sort(demo, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return heights[b] - heights[a];
            }
        });

        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = names[demo[i]];
        }
        return result;
    }
}
