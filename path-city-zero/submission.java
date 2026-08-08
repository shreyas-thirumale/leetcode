class Solution {
    public int minReorder(int n, int[][] connections) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] a : connections) {
            int from = a[0];
            int to = a[1];
            if (map.containsKey(from)) {
                Map<Integer, Integer> temp = map.get(from);
                temp.put(to, 1);
                map.put(from, temp);
            } else {
                Map<Integer, Integer> temp = new HashMap<>();
                temp.put(to, 1);
                map.put(from, temp);
            }
            if (map.containsKey(to)) {
                Map<Integer, Integer> temp = map.get(to);
                temp.put(from, 0);
                map.put(to, temp);
            } else {
                Map<Integer, Integer> temp = new HashMap<>();
                temp.put(from, 0);
                map.put(to, temp);
            }
        }
        Set<Integer> set = new HashSet<>();
        return dfs(0, set, map);
    }

    private int dfs(int num, Set<Integer> visited, Map<Integer, Map<Integer, Integer>> map) {
        int changes = 0;
        visited.add(num);
        for (int next : map.get(num).keySet()) {
            int neighb = next;
            int pointToNum = map.get(num).get(next);
            if (visited.contains(neighb))
                continue;
            if (pointToNum == 1) {
                changes++;
            }
            changes += dfs(neighb, visited, map);
        }
        return changes;
    }
}