package Algorithm_Search.Brute_Force;

import java.util.Scanner;

public class day18 {

    // 2501 - 약수구하기
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//
//        int count = 1;
//        int[] arr = new int[N+1];
//
//        for (int i = 1; i < N+1; i++) {
//            int result = N % i;
//            if (result == 0) {
//                arr[count] = i;
//                count++;
//            }
//
//        }
//
//        System.out.println(arr[K]);
//    }

    // 1436 - 영화감독 숌
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int num = 666;
//        int count = 1;
//
//        while (count != N) {
//            num++;
//
//            if (String.valueOf(num).contains("666")) {
//                count++;
//            }
//        }
//
//        System.out.println(num);
//    }

    // 1018 - 체스판 다시 칠하기
//    public static int min = 64;
//    public static boolean[][] arr;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        arr = new boolean[N][M];
//
//        for (int i = 0; i < N; i++) {
//            String str = sc.next();
//
//            for (int j = 0; j < M; j++) {
//                if (str.charAt(j) == 'W') {
//                    arr[i][j] = true; // W일 때는 true
//                } else {
//                    arr[i][j] = false; // B일 때는 false
//                }
//            }
//        }
//
//        int N_row = N - 7;
//        int M_col = M - 7;
//
//        for (int i = 0; i < N_row; i++) {
//            for (int j = 0; j < M_col; j++) {
//                find(i, j);
//            }
//        }
//        System.out.println(min);
//
//    }
//
//    public static void find(int x, int y) {
//        int end_x = x + 8;
//        int end_y = y + 8;
//        int count = 0;
//
//        boolean TF = arr[x][y];
//
//        for (int i = x; i < end_x; i++) {
//            for (int j = y; j < end_y; j++) {
//                if (arr[i][j] != TF) {
//                    count++;
//                }
//
//                TF = (!TF);
//            }
//
//            TF = !TF;
//        }
//
//        count = Math.min(count, 64 - count);
//
//        min = Math.min(min, count);
//    }
}
