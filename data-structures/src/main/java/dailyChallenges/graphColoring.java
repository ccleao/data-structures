package dailyChallenges;

public class graphColoring {
        public static void main(String[] args) {
            boolean[][] graph = {
                    {false, true, true, true},
                    {true, false, true, false},
                    {true, true, false, true},
                    {true, false, true, false},
            };
            int m = 3;

            int[] color = new int[n];
            for (int i = 0; i < n; i++)
                color[i] = 0;

            if (!graphColoring(graph, m, 0, color))
                System.out.println("Solution does not exist");
        }
    static int n = 4;

    static void printSolution(int[] color) {
        System.out.println(
                "Solution Exists:"
                        + " The following collors are: ");
        for (int i = 0; i < n; i++)
            System.out.print("  " + color[i]);
        System.out.println();
    }
    static boolean isSafe(boolean[][] graph, int[] color) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (graph[i][j] && color[j] == color[i])
                    return false;
        return true;
    }
    static boolean graphColoring(boolean[][] graph, int m, int i, int[] color) {
        if (i == n) {

            if (isSafe(graph, color)) {

                printSolution(color);
                return true;
            }
            return false;
        }

        for (int j = 1; j <= m; j++) {
            color[i] = j;

            if (graphColoring(graph, m, i + 1, color))
                return true;
            color[i] = 0;
        }
        return false;
    }
}