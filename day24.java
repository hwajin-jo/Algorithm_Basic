package Algorithm_BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class day24 {

//    // 미로탈출 복습
//    static int n;
//    static int m;
//    static int[][] node;
//    static int[][] visited;
//    static int[] dx = {-1,1,0,0};
//    static int[] dy = {0,0,-1,1};
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        node = new int[n][m];
//        visited = new int[n][m];
//
//        for (int i = 0; i < n; i++) {
//            String str = sc.next();
//            for (int j = 0; j < m; j++) {
//                node[i][j] = str.charAt(j) - '0';
//            }
//        }
//
//        bfs(0,0);
//        System.out.println(visited[n-1][m-1]);
//    }
//
//    public static void bfs(int x, int y) {
//        Queue<Coordinate> q = new LinkedList<>();
//        q.offer(new Coordinate(x, y));
//        visited[0][0] = 1;
//
//        while (!q.isEmpty()) {
//            Coordinate cord = q.poll();
//            for (int i = 0; i < 4; i++) {
//                int nextX = cord.x + dx[i];
//                int nextY = cord.y + dy[i];
//                if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
//                    if (node[nextX][nextY] == 1 && visited[nextX][nextY] == 0) {
//                        q.add(new Coordinate(nextX, nextY));
//                        visited[nextX][nextY] = visited[cord.x][cord.y] + 1;
//                    }
//                }
//            }
//        }
//    }


//class Coordinate {
//    int x;
//    int y;
//
//    public Coordinate(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
}
