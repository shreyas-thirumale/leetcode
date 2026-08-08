class Solution {
    public int findCircleNum(int[][] isConnected) {
        Deque<Integer> deck = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                count++;
                deck.push(i);
                visited.add(i);
            }
            while (!deck.isEmpty()) {
                int curr = deck.pop();
                for (int j = 0; j < isConnected[curr].length; j++) {
                    if (isConnected[curr][j] == 1 && !visited.contains(j)) {
                        deck.push(j);
                        visited.add(j);
                    }
                }
            }
        }
        return count;
    }
}