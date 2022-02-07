package Algorithm_Search.Brute_Force;

import java.util.Scanner;

public class day16 {

    // 1065 - 한수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(Hansu(N));
    }

    public static int Hansu(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        } else {
            cnt = 99;

            if (num == 1000) {
                num = 999;
            }

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 백의 자리수
                int ten = (i / 10) % 10; // 십의 자리수
                int one = i % 10; // 일의 자리수

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }

            return cnt;
        }
    }

    // 2798 - 블랙잭
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        int temp = 0;
//
//        for (int i = 0; i < N; i++) {
//            for (int j = i+1; j < N; j++) {
//                for (int k = j+1; k < N; k++) {
//                    temp = arr[i] + arr[j] + arr[k];
//                    if (sum < temp && temp <= M) {
//                        sum = temp;
//                    }
//                }
//            }
//        }
//
//        System.out.println(sum);
//
//
//    }

    // 4673 - 셀프넘버
//    public static void main(String[] args) {
//        boolean[] arr = new boolean[10001];
//
//        for (int i = 1; i < 10001; i++) {
//            int n = d(i);
//
//            if (n < 10001) {
//                arr[n] = true;
//            }
//        }
//
//        for (int i = 1; i < 10001; i++) {
//            if (arr[i] == false) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static int d(int number) {
//        int sum = number;
//
//        while (number != 0) {
//            sum += number % 10;
//            number = number / 10;
//        }
//
//        return sum;
//    }
}
