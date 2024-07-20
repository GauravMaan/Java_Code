class Solution {
    public boolean exist(char[][] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == s.charAt(0) && search(arr, i, j, s)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean search(char[][] arr, int row, int col, String s) {
         if (s.length() == 0) {
            return true;
        }
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length) {
            return false;
        }
        if (s.charAt(0) != arr[row][col]) {
            return false;
        }
        int[] r = {0, 0, -1, 1};
        int[] c = {-1, 1, 0, 0};
        char originalChar = arr[row][col];
        arr[row][col] = '*';
        for (int i = 0; i < r.length; i++) {
            boolean ans = search(arr, row + r[i], col + c[i], s.substring(1));
            if (ans) {
                return true;
            }
        }
        arr[row][col] = originalChar;
        return false;
    }
}
