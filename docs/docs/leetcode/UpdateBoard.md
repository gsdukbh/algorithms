## 扫雷游戏

扫雷游戏的模拟。

##### 思路：深度搜索

根据规则：

如果一个地雷（'M'）被挖出，游戏就结束了- 把它改为 'X'。
如果一个没有相邻地雷的空方块（'E'）被挖出，修改它为（'B'），并且所有和其相邻的未挖出方块都应该被递归地揭露。
如果一个至少与一个地雷相邻的空方块（'E'）被挖出，修改它为数字（'1'到'8'），表示相邻地雷的数量。

```java
 static int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dirY = {1, 0, -1, 0, 1, -1, 1, -1};

    public static char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else {
            dfs(board, x, y);
        }

        return board;
    }
private static int search(char[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dirX[i], ny = y + dirY[i];
//            越界判断
            if (nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) {
                continue;
            }
            if (board[nx][ny] == 'M') {
                count++;
            }
        }
        return count;
    }

    private static void dfs(char[][] board, int x, int y) {
        int count = search(board, x, y);
        if (count > 0) {
            board[x][y] = (char) (count + '0');
        } else {
            board[x][y] = 'B';
            for (int i = 0; i < 8; i++) {
                int nx = x + dirX[i], ny = y + dirY[i];
                if (nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length || board[nx][ny] != 'E'{
                    continue;
                }
                dfs(board, nx, ny);
            }
        }
    }
```



##### 思路：2 广度遍历。

```java
public static char[][] updateBoard1(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else {
            bfs(board, x, y);
        }
        return board;
    }
    private static void bfs(char[][] board, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] log = new boolean[board.length][board[0].length];
        queue.offer(new int[]{x, y});
        log[x][y] = true;
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int count = 0, nx = pos[0], ny = pos[1];
            count = search(board, nx, ny);
            if (count > 0) {
                board[x][y] = (char) (count + '0');
            } else {
                board[x][y] = 'B';
                for (int i = 0; i < 8; ++i) {
                    int tx = x + dirX[i];
                    int ty = y + dirY[i];
                    if (tx < 0 || tx >= board.length || ty < 0 || ty >= board[0].length || board[tx][ty] != 'E' || log[tx][ty]) {
                        continue;
                    }
                    queue.offer(new int[]{tx, ty});
                    log[tx][ty] = true;
                }
            }
        }

    }

    private static int search(char[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dirX[i], ny = y + dirY[i];
//            越界判断
            if (nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) {
                continue;
            }
            if (board[nx][ny] == 'M') {
                count++;
            }
        }
        return count;
    }
```

