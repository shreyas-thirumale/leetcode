class Solution {
    public int orangesRotting(int[][] grid) {
        int numOrangeCells = 0;
        Queue<Pair> q = new LinkedList<>();
        int[][] arr = new int[][] {
                { -1, 0 },
                { 1, 0 },
                { 0, 1 },
                { 0, -1 }
        };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                } else if (grid[i][j] == 1)
                    numOrangeCells++;
            }
        }
        int ret = -1;
        int tem = 0;
        if (numOrangeCells == 0)
            return 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                for (int[] temp : arr) {
                    int x = p.x + temp[0];
                    int y = p.y + temp[1];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                        q.offer(new Pair(x, y));
                        grid[x][y] = 2;
                        tem++;
                    }
                }
            }
            ret++;
        }
        if (tem != numOrangeCells)
            return -1;
        return ret;
    }
}

class Pair {
    int x;
    int y;

    public Pair(int i, int j) {
        x = i;
        y = j;
    }
}