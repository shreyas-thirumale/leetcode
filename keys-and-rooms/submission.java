class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int num : rooms.get(0)) {
            q.offer(num);
        }
        if (rooms.size() == 0)
            return true;
        count++;
        visited.add(0);
        while (!q.isEmpty()) {
            int num = q.poll();
            if (visited.contains(num))
                continue;
            for (int val : rooms.get(num)) {
                if (visited.contains(val))
                    continue;
                q.offer(val);
            }
            visited.add(num);
            count++;
        }
        return count == rooms.size();
    }
}