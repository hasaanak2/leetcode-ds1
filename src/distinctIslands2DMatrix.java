import java.util.ArrayList;
import java.util.HashSet;

public class distinctIslands2DMatrix {

    public static void main(String[] args)
    {
        int[][] grid = { { 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 0, 1, 1 }
        };
        System.out.println("Number of distinct islands is " + countDistinctIslands(grid));
    }

    static int[][] dirs = { { 0, -1 },
            { -1, 0 },
            { 0, 1 },
            { 1, 0 }
    };

    private static String toString(int r, int c) {
        return Integer.toString(r) + " " + Integer.toString(c);
    }

    private static void dfs(int[][] grid, int x0, int y0, int i, int j, ArrayList<String> v) {

        int rows = grid.length, cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] <= 0)
            return;

        grid[i][j] *= -1;

        v.add(toString(i - x0, j - y0));

        for (int k = 0; k < 4; k++) {
            dfs(grid, x0, y0, i + dirs[k][0], j + dirs[k][1], v);
        }
    }

    public static int countDistinctIslands(int[][] grid) {
        int rows = grid.length;
        if (rows == 0)
            return 0;

        int cols = grid[0].length;
        if (cols == 0)
            return 0;

        HashSet<ArrayList<String>> coordinates = new HashSet<> ();

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {

                if (grid[i][j] != 1)
                    continue;

                ArrayList<String> v = new ArrayList<>();
                dfs(grid, i, j, i, j, v);

                coordinates.add(v);
            }
        }

        return coordinates.size();
    }
}