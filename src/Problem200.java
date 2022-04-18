/**
 * @Author: penghaige
 * @Date: 2022/4/18
 */
public class Problem200 {
    static int m;
    static int n;
    public int numIslands(char[][] grid) {
        int count = 0;
        m = grid.length;
        for (int i = 0; i < m; i++) {
            n = grid[i].length;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int im, int in, char[][] grid) {
        if (im >= 0 && in >= 0 && im <= m - 1 && in <= n - 1 && grid[im][in] == '1') {
            // 是陆地
            grid[im][in] = '2';
            dfs(im, in - 1, grid);
            dfs(im, in + 1, grid);
            dfs(im + 1, in, grid);
            dfs(im - 1, in, grid);
        }
    }
    
}
