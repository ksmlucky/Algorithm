import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyBreathFirstSearch {
    HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> grpah, String startNode) {
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        int count = 0;

        // needVisit 큐에 아무것도 없을 때까지 반복
        while (needVisit.size() > 0) {
            count++;

            // node에 needVisit 큐 맨 앞에 있는 애 저장
            String node = needVisit.remove(0);

            // visited 어레이리스트에 node에 해당하는 vertex가 없으면 조건문 실행
            if (!visited.contains(node)) {
                visited.add(node); // visited 큐에 vertex 추가
                needVisit.addAll(graph.get(node)); // visited 어레이리스트에 추가한 vertex와 연결된 vertex들을 needVisited 큐에 추가
            }
        }

        System.out.println(count);

        // visited 큐 반환
        return visited;
    }

    public static void main(String[] args) {
        MyBreathFirstSearch sol = new MyBreathFirstSearch();

        sol.graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        sol.graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        sol.graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        sol.graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        sol.graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        sol.graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        sol.graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        sol.graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        sol.graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        sol.graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println(sol.graph);

        System.out.println(sol.bfsFunc(sol.graph, "A"));
    }
}
