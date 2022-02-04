package Algorithm_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class day15 {

    // 2864 5와 6의 차이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aMin = 0;
        int aMax = 0;
        int bMin = 0;
        int bMax = 0;

        String a_max = Integer.toString(a);
        String a_min = Integer.toString(a);
        String b_max = Integer.toString(b);
        String b_min = Integer.toString(b);

        aMax = Integer.parseInt(a_min.replace('5', '6'));
        aMin = Integer.parseInt(a_max.replace('6', '5'));
        bMax = Integer.parseInt(b_min.replace('5', '6'));
        bMin = Integer.parseInt(b_max.replace('6', '5'));

        int min = aMin + bMin;
        int max = aMax + bMax;

        System.out.println(min + " " + max);
    }

    // 1049 기타줄
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(); // 끊어진 기타줄
//        int M = sc.nextInt(); // 기타줄 브랜드 갯수
//
//        int[] pack = new int[M];
//        int[] unit = new int[M];
//
//        for (int i = 0; i < M; i++) {
//            pack[i] = sc.nextInt();
//            unit[i] = sc.nextInt();
//        }
//        Arrays.sort(pack);
//        Arrays.sort(unit);
//
//        int Min = Integer.MAX_VALUE;
//
//        Min = Math.min(((N/6)+1)*pack[0], N*unit[0]);
//        Min = Math.min(Min, ((N/6))*pack[0] + (N%6)*unit[0]);
//
//        System.out.println(Min);
//    }

    // 16953 A -> B
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long A = sc.nextLong();
//        long B = sc.nextLong();
//
//
//        int cnt = 1;
//        while (A != B) {
//            if (A > B) {
//                cnt = -1;
//                break;
//            }
//
//            String str = String.valueOf(B);
//
//            if (str.charAt(str.length() - 1) != '1' && B % 2 != 0) {
//                cnt = -1;
//                break;
//            }
//
//            if (B % 2 == 0) { // B가 2로 나누어지는 경우
//                B = B / 2;
//            } else { // B의 끝자리가 1인 경우 1을 제거
//                str = str.substring(0, str.length() - 1);
//                B = Long.parseLong(str);
//            }
//            cnt++;
//        }
//
//        System.out.println(cnt);
//    }
}
