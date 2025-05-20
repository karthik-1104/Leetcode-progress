class Solution {
    public int orangesRotting(int[][] grid) {
         int n = grid.length; 
        int m = grid[0].length; 

        int[] rows= {-1, 0, 1, 0};
        int[] cols = {0, 1, 0, -1};

        int[][] vis = new int[n][m];

        
        Queue<int[]> queue = new LinkedList<>();

        int freshCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              
              if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0; 
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        int cnt = 0, tm = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int t = curr[2];

            tm = Math.max(tm, t);

        
            for (int i = 0; i < 4; i++) {
                int newRow = row + rows[i];
                int newCol = col + cols[i];

              
                if (newRow >= 0 && newRow < n && newCol >= 0
                    && newCol < m && grid[newRow][newCol] == 1
                    && vis[newRow][newCol] != 2) {
  
                    vis[newRow][newCol] = 2;

                    
                    queue.add(new int[]{newRow, newCol, t + 1});
                    cnt++;
                }
            }
        }

        return (cnt == freshCount) ? tm : -1;
    }
}