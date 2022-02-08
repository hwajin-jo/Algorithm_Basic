package Algorithm_Search.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class day17 {

    // 2309 - 일곱난쟁이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        int spyA = 0;
        int spyB = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    continue;

                if (sum - arr[i] - arr[j] == 100) {
                    spyA = arr[i];
                    spyB = arr[j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == spyA || arr[i] == spyB)
                continue;
            System.out.println(arr[i]);

        }
    }


    // 7568 - 덩치
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[][] arr = new int[N][2];
//
//        // 입력
//        for (int i = 0; i < N; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        for (int i = 0; i < N; i++) {
//            int rank = 1;
//            for (int j = 0; j < N; j++) {
//                if (i == j)
//                    continue;
//
//                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
//                    rank++;
//                }
//            }
//            System.out.print(rank + " ");
//        }
//    }

    // 2231 - 분해합
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int result = 0;
//
//        for (int i = 0; i < N; i++) {
//            int number = i;
//            int sum = 0;
//
//            while (number != 0) {
//                sum += number % 10;
//                number = number / 10;
//            }
//
//            if (sum + i == N) {
//                result = i;
//                break;
//            }
//        }
//
//        System.out.println(result);
//    }
}
