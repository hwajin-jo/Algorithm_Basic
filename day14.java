package Algorithm_Greedy;

import java.util.Scanner;

public class day14 {

    // 4796 - 캠핑
    public static void main(String[] args) {

        // 맞은 정답
        Scanner sc = new Scanner(System.in);
        for(int i=1;true;i++){
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            sc.nextLine();
            if(L==0 && P==0 && V==0) {
                break;
            }else {
                int answer;
                if((V%P)<=L) { //잔여일이 L보다 작으면(5 8 20) 4<5
                    answer = (V % P) + (V / P) * L;
                }else{ //잔여일이 L보다 크면(5 8 23) 7>5
                    answer = L + (V / P) * L;
                }
                System.out.println("Case " + i + ": " + answer);
            }
        }

        // 틀린 정답 --> 어디가 틀린건지 알아보기..!
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int x = 0;
//        int y = 0;
//        int result = 0;
//        for (int i = 0; i < 2; i++) {
//            x = arr[i][2] / arr[i][1];
//            y = arr[i][2] % arr[i][1];
//            int L = arr[i][0];
//            result = (x * L) + Math.min(L, y);
//            System.out.println("Case " + (i+1) + ": " + result);
//        }
    }

    // 1493 - 뒤집기
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int OneCount = 0;
//        int ZeroCount = 0;
//
//        if (str.charAt(0) == '0') {
//            ZeroCount++;
//        } else {
//            OneCount++;
//        }
//
//        char c = str.charAt(0);
//        for (int i = 1; i < str.length(); i++) {
//            char t = str.charAt(i);
//            if (t == c) {
//                continue;
//            } else if (t == '0') {
//                ZeroCount++;
//                c = t;
//            } else {
//                OneCount++;
//                c = t;
//            }
//        }
//
//        System.out.println(Math.min(ZeroCount, OneCount));
//    }

    // 1946 - 신입사원
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for (int i = 0; i < T; i++) {
//            int n = sc.nextInt();
//            int[] person = new int[n + 1];
//
//            for (int j = 0; j < n; j++) {
//                int A = sc.nextInt();
//                int B = sc.nextInt();
//                person[A] = B;
//            }
//
//            int cnt = 1;
//            int rankB = person[1];
//            for (int k = 2; k <= n; k++) {
//                if (rankB > person[k]) {
//                    rankB = person[k];
//                    cnt++;
//                }
//            }
//
//            System.out.println(cnt);
//        }
//    }
}
