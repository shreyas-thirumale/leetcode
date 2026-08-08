class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> temp = equations.get(i);
            String num = temp.get(0);
            String den = temp.get(1);
            if (map.containsKey(num)) {
                Map<String, Double> spec = map.get(num);
                spec.put(den, values[i]);
                map.put(num, spec);
            } else {
                Map<String, Double> spec = new HashMap<>();
                spec.put(den, values[i]);
                map.put(num, spec);
            }
            if (map.containsKey(den)) {
                Map<String, Double> spec1 = map.get(den);
                spec1.put(num, (double) 1 / values[i]);
                map.put(den, spec1);
            } else {
                Map<String, Double> spec1 = new HashMap<>();
                spec1.put(num, (double) 1 / values[i]);
                map.put(den, spec1);
            }
        }
        double[] arr = new double[queries.size()];
        int i = 0;
        ;
        for (List<String> l : queries) {
            String c = l.get(0);
            String d = l.get(1);
            Set<String> visited = new HashSet<>();
            arr[i] = dfs(c, d, visited, map);
            i++;
        }
        return arr;
    }

    private double dfs(String curr, String target, Set<String> visited, Map<String, Map<String, Double>> map) {
        if (!map.containsKey(curr))
            return -1.0;
        else if (curr.equals(target))
            return 1.0;
        visited.add(curr);
        for (String str : map.get(curr).keySet()) {
            if (visited.contains(str))
                continue;
            double result = dfs(str, target, visited, map);
            if (result != -1.0) {
                return map.get(curr).get(str) * result;
            }
        }
        return -1;
    }
}