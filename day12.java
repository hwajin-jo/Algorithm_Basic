package Algorithm_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class day12 {

    // 10162 - 전자레인지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = {300, 60, 10};
        int[] count = new int[3];

        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (T >= arr[i]) {
                result = T / arr[i];
                count[i] = result;

                T = T % arr[i];

            }
        }

        for (int i = 0; i < 3; i++) {
            if (T == 0) {
                System.out.printf("%d ", count[i]);
            }
        }

        if (T != 0) {
            System.out.println(-1);
        }
    }

    // 2217 - 로프
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int[] w = new int[k];
//
//        for (int i = 0; i < k; i++) {
//            w[i] = sc.nextInt();
//        }
//
//        Arrays.sort(w);
//
//        int max = 0;
//        for (int i = k-1; i >= 0; i--) {
//            w[i] = w[i] * (k-i);
//
//            if(max < w[i]) max = w[i];
//        }
//
//        System.out.println(max);
//
//    }


    // 5585 - 거스름돈
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] coin = {500, 100, 50, 10, 5, 1};
//
//        int remain = 1000 - N;
//
//        int result = 0;
//        for (int i = 0; i < coin.length; i++) {
//            if (remain >= coin[i] ) {
//                result += remain / coin[i];
//
//                remain = remain % coin[i];
//            }
//        }
//
//        System.out.println(result);
//    }

    // 1541 - 잃어버린 괄호
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] sub = str.split("-");
//
//        int result = 0;
//        for (int i = 0; i < sub.length; i++) {
//            String[] add = sub[i].split("\\+");
//
//            int temp = 0;
//            for (String s : add) {
//                temp += Integer.parseInt(s);
//            }
//
//            if (i == 0) {
//                result = temp;
//            } else {
//                result -= temp;
//            }
//        }
//
//        System.out.println(result);
//
//    }

    // 1026 - 보물
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        int[] B = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < N; i++) {
//            B[i] = sc.nextInt();
//        }
//
//        Arrays.sort(A);
//        Arrays.sort(B);
//
//        int sum = 0;
//
//        for (int i = 0; i < N; i++) {
//            sum += A[i] * B[N - i - 1];
//        }
//
//        System.out.println(sum);
//    }
}
