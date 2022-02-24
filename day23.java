package Algorithm_BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class day23 {

//    // 1260 - dfs bfs 복습
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // 정점의 갯수
//        int m = sc.nextInt(); // 간선의 갯수
//        int v = sc.nextInt(); // 시작번호
//        int[][] node = new int[1001][1001];
//        boolean[] visited = new boolean[1001];
//
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            node[x][y] = node[y][x] = 1;
//        }
//
//        // bfs 구현
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(v);
//        visited[v] = true; // 시작노드 방문처리
//        System.out.print(v + " ");
//
//        while (!q.isEmpty()) {
//            int now = q.poll();
//            for (int j = 1; j <= n; j++) {
//                if (node[now][j] == 1 && visited[j] == false) {
//                    visited[j] = true;
//                    q.offer(j);
//                    System.out.print(j + " ");
//                }
//            }
//        }
//
//
//
//    }



    // 18352 - 특정거리의 도시 찾기
//    static int n,m,k,x;
//    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
//    // 모든 도시에 대한 최단 거리 초기화
//    static int[] d = new int[300001];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt(); // 도시의 개수
//        m = sc.nextInt(); // 도로의 개수
//        k = sc.nextInt(); // 거리 정보
//        x = sc.nextInt(); // 출발도시의 정보
//
//        // 그래프 및 최단 거리 초기화
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<Integer>());
//            d[i] = -1;
//        }
//
//        // 모든 도로 정보 입력
//        for (int i = 0; i < m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            graph.get(a).add(b);
//        }
//
//        // 출발 도시까지의 거리는 0
//        d[x] = 0;
//
//        // bfs수행
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(x);
//        while (!q.isEmpty()) {
//            int now = q.poll();
//
//            // 현재 도시에서 이동할 수 있는 모든 도시를 확인
//            for (int i = 0; i < graph.get(now).size(); i++) {
//                int nextNode = graph.get(now).get(i);
//                // 아직 방문하지 않은 도시라면
//                if (d[nextNode] == -1) {
//                    // 최단 거리 갱신
//                    d[nextNode] = d[now] + 1;
//                    q.offer(nextNode);
//                }
//            }
//        }
//
//        // 최단 거리가 K인 모든 도시의 번호를 오름차순으로 출력
//        boolean check = false;
//        for (int i = 1; i <= n; i++) {
//            if (d[i] == k) {
//                System.out.println(i);
//                check = true;
//            }
//        }
//
//        // 만약 최단 거리가 K인 도시가 없다면, -1 출력
//        if (!check) System.out.println(-1);
//    }

    // 2178 - 미로 탐색
//    static int N, M;
//    static int [][] node;
//    static int [][] visited;
//    static int dx[] = {-1, 1, 0, 0};
//    static int dy[] = { 0, 0, -1, 1};
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//        node = new int[N][M];
//        visited = new int[N][M];
//
//        // 미로값 입력
//        for (int i = 0; i < N; i++) {
//            String str = sc.next();
//            for (int j = 0; j < M; j++) {
//                node[i][j] = str.charAt(j) - '0';
//            }
//        }
//
//        // 시작지점 값을 넣어서 탐색 시작
//        bfs(0, 0);
//
//        // 최종 도착지점 최단거리 출력
//        System.out.println(visited[N-1][M-1]);
//    }
//
//    public static void bfs(int x, int y) {
//
//        Queue<Coordinate> queue = new LinkedList<>();
//
//        // 첫번째 시작점 방문처리
//        visited[x][y] = 1;
//        // 첫번째 좌표를 큐에 넣는다.
//        queue.add(new Coordinate(x, y));
//
//        while (!queue.isEmpty()) {
//            // 방문좌표를 꺼낸다
//            Coordinate cord = queue.poll();
//
//            // 현재 위치에서 네 방향으로 위치 확인
//            for (int i = 0; i < 4; i++) {
//                // 현재 좌표에서 상하좌우 탐색
//                int nx = cord.x + dx[i];
//                int ny = cord.y + dy[i];
//
//                // 미로 범위 안이라면
//                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
//                    // 길이 있고 방문한 적이 없다면
//                    if (node[nx][ny] == 1 && visited[nx][ny] == 0) {
//                        // 다음에 방문할 좌표를 큐에 넣는다.
//                        queue.add(new Coordinate(nx, ny));
//                        visited[nx][ny] = visited[cord.x][cord.y] + 1;
//                    }
//                }
//            }
//        }
//    }
//}
//class Coordinate {
//    int x;
//    int y;
//
//    Coordinate(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

}