package Algorithm_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class day13 {

    // 13305 - 주유소
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dist = new long[N - 1];
        long[] price = new long[N];

        for (int i = 0; i < N-1; i++) {
            dist[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            price[i] = sc.nextInt();
        }

        long minPrice = price[0];
        long result = 0;
        for (int i = 0; i < N-1; i++) {
            if (minPrice > price[i]) {
                minPrice = price[i];
            }

            result += dist[i] * minPrice;
        }

        System.out.println(result);
    }

    // 1789 - 수들의 합
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        long S = sc.nextLong();
//        long add = 0;
//        long sum = 0;
//
//        while (S >= sum) {
//            sum += (++add);
//        }
//
//        if (sum == S) {
//            System.out.println(add);
//        } else {
//            System.out.println(add-1);
//        }
//    }

    // 10610 - 30
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int[] arrInt = new int[str.length()];
//        int arrtotal = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            arrInt[i] = str.charAt(i) - '0'; // 입력받은 숫자를 배열에 하나 하나 넣는다.
//            arrtotal += arrInt[i];
//        }
//
//        Arrays.sort(arrInt);
//
//        if ((arrtotal % 3 == 0) && (arrInt[0] == 0)) {
//            for (int i = str.length() - 1; i >= 0; i--) {
//                System.out.print(arrInt[i]);
//            }
//        } else {
//            System.out.print(-1);
//        }
//
//    }
}
