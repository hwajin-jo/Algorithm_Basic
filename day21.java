package Algorithm_BFS_DFS;

import java.util.*;

public class day21 {

    // 2667 - 단지번호 붙이기
    static int n; // 지도의 크기
    static int[][] node; // 2차원 배열 지도
    static boolean[][] check; // 방문체크
    static int[] dr = {-1, 1, 0, 0}; // 상하좌우
    static int[] dc = {0, 0, -1, 1}; // 상하좌우

    static int count;

    static ArrayList<Integer> result; // 단지 집의 갯수 저장

    public static int dfs(int x, int y) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx >=0 && ny >=0 && nx < n && ny < n) {
                if (node[nx][ny] == 1 && !check[nx][ny]) {
                    dfs(nx, ny);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        node = new int[n][n];
        check = new boolean[n][n];

        // 지도에 배열 값 입력
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                node[i][j] = str.charAt(j) - '0'; // 문자를 숫자로 변환
            }
        }

        // 단지집의 숫자
        count = 0;

        // 단지 집의 수 결과 저장
        result = new ArrayList<>();

        // 지도 전체 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 현재 위치의 값이 1이고 true라면
                if (node[i][j] == 1 && !check[i][j]) {
                    // 맨 처음이기 때문에 count 1증가
                    count = 1;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int c : result) {
            System.out.println(c);
        }

    }

    // 2606 - 바이러스
//    static int n;
//    static int m;
//    static int v;
//    static int[][] graph;
//    static boolean[] check;
//    static int count = 0;
//
//    public static int dfs(int i) {
//        check[i] = true;
//
//        for (int j = 1; j <= n; j++) {
//            if (graph[i][j] == 1 && check[j] == false) {
//                count++;
//                dfs(j);
//            }
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt(); // 컴퓨터의 수
//        m = sc.nextInt(); // 직접 연결되어있는 컴퓨터 쌍의 수
//        v = 1; // 첫번쩨 노드의 수
//        graph = new int[n+1][n+1];
//        check = new boolean[n+1];
//
//        // 간선 정보를 저장
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            graph[x][y] = graph[y][x] = 1;
//        }
//
//        System.out.println(dfs(v));
//    }

//    static int N; // 정점의 갯수
//    static int M; // 간선의 갯수
//    static int V;// 정점의 시작번호
//    static boolean[] visited; // 방문 노선 check
//    static int[][] graph;
//
//    // 1260 - DFS와 BFS
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//        V = sc.nextInt();
//
//        visited = new boolean[1001];
//        graph = new int[1001][1001];
//
//        // 간선 연결상태 저장
//        for (int i = 0; i < M; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            graph[x][y] = graph[y][x] = 1;
//        }
//
//        dfs(V);
//
//        visited = new boolean[1001]; //확인상태 초기화
//        System.out.println(); //줄바꿈
//
//        bfs();
//    }
//
//    //시작점을 변수로 받아 확인, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
//    public static void dfs(int i) {
//        visited[i] = true;
//        System.out.print(i + " ");
//
//        for (int j = 1; j <= N; j++ ) {
//            if (graph[i][j] == 1 && visited[j] == false) {
//                dfs(j);
//            }
//        }
//    }
//
//    public static void bfs() {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(V); // 시작점을 큐에 넣어준다.
//        visited[V] = true;
//        System.out.print(V + " ");
//
//        // queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
//        while (!queue.isEmpty()) {
//            int temp = queue.poll();
//
//            for (int j = 1; j <= N; j++) {
//                if (graph[temp][j] == 1 && visited[j] == false) {
//                    queue.offer(j);
//                    visited[j] = true;
//                    System.out.print(j + " ");
//                }
//            }
//        }
//    }
}
