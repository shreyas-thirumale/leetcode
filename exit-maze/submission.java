class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(entrance[0], entrance[1]));
        maze[entrance[0]][entrance[1]] = '-';
        int ret = -1;
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int x = p.x;
                int y = p.y;
                if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length)
                    continue;
                if (x - 1 >= 0 && x - 1 < maze.length && y >= 0 && y < maze[0].length
                        && (x - 1 == 0 || y == 0 || y == maze[0].length - 1) && maze[x - 1][y] == '.')
                    return count + 1;
                else if (x - 1 >= 0 && x - 1 < maze.length && y >= 0 && y < maze[0].length && maze[x - 1][y] == '.') {
                    maze[x - 1][y] = '-';
                    q.offer(new Pair(x - 1, y));
                }
                if (x + 1 >= 0 && x + 1 < maze.length && y >= 0 && y < maze[0].length
                        && (x + 1 == maze.length - 1 || y == 0 || y == maze[0].length - 1) && maze[x + 1][y] == '.')
                    return count + 1;
                else if (x + 1 >= 0 && x + 1 < maze.length && y >= 0 && y < maze[0].length && maze[x + 1][y] == '.') {
                    maze[x + 1][y] = '-';
                    q.offer(new Pair(x + 1, y));
                }
                if (x >= 0 && x < maze.length && y - 1 >= 0 && y - 1 < maze[0].length
                        && (x == maze.length - 1 || x == 0 || y - 1 == 0) && maze[x][y - 1] == '.')
                    return count + 1;
                else if (x >= 0 && x < maze.length && y - 1 >= 0 && y - 1 < maze[0].length && maze[x][y - 1] == '.') {
                    maze[x][y - 1] = '-';
                    q.offer(new Pair(x, y - 1));
                }
                if (x >= 0 && x < maze.length && y + 1 >= 0 && y + 1 < maze[0].length
                        && (x == maze.length - 1 || x == 0 || y + 1 == maze[0].length - 1) && maze[x][y + 1] == '.')
                    return count + 1;
                else if (x >= 0 && x < maze.length && y + 1 >= 0 && y + 1 < maze[0].length && maze[x][y + 1] == '.') {
                    maze[x][y + 1] = '-';
                    q.offer(new Pair(x, y + 1));
                }
            }
            count++;
        }
        return -1;

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