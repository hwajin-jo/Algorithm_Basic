import java.io.*;
import java.util.Scanner;

public class day9 {
    //no.81
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.printf("%d %d", i+1, j+1);
//                System.out.println();
//            }
//        }
//    }
    //no.82
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt(16);
//
//        for (int i = 1; i < 16; i++) {
//            System.out.printf("%X*%X=%X", num, i, num*i);
//            System.out.println();
//        }
//    }

    //no.83
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            if (i % 3 == 0) {
//                System.out.printf("%s", "X");
//                System.out.print(" ");
//            } else {
//                System.out.printf("%d" , i);
//                System.out.print(" ");
//            }
//        }
//    }

    //no.84
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String[] data = br.readLine().split(" ");
//
//        int count = 0;
//
//        for (int i = 0; i < Integer.valueOf(data[0]); i++) {
//            for (int j = 0; j < Integer.valueOf(data[1]); j++) {
//                for (int k = 0; k < Integer.valueOf(data[2]); k++) {
//                    bw.write(i + " " + j + " " + k + "\n");
//                    count++;
//                }
//            }
//        }
//        bw.write(String.valueOf(count));
//        bw.flush();
//
//        // 시간초과
////        Scanner sc = new Scanner(System.in);
////        String str = sc.nextLine();
////        String[] data = str.split(" ");
////
////        int a = Integer.valueOf(data[0]);
////        int b = Integer.valueOf(data[1]);
////        int c = Integer.valueOf(data[2]);
////        int count = 0;
////
////        for (int i = 0; i < a; i++) {
////            for (int j = 0; j < b; j++) {
////                for (int k = 0; k < c; k++) {
////                    System.out.printf("%d %d %d\n", i, j, k);
////                    count++;
////
////                }
////            }
////        }
////        System.out.println(count);
//    }

    //no.85
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        double h = Integer.valueOf(data[0]);
//        double b = Integer.valueOf(data[1]);
//        double c = Integer.valueOf(data[2]);
//        double s = Integer.valueOf(data[3]);
//
//        double num = (h * b * c * s) / 8 / 1024;
//        double output = num / 1024;
//        System.out.printf("%.1f MB", output);
//    }


    //no.86
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        double w = Integer.valueOf(data[0]);
//        double h = Integer.valueOf(data[1]);
//        double b = Integer.valueOf(data[2]);
//
//        double mul = (w * h * b) / 8 / 1024;
//        double result = mul / 1024;
//
//        System.out.printf("%.2f MB", result);
//
//    }

    //no.87
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i <= num; i++) {
//            sum += i;
//            if (sum >= num)
//                break;
//        }
//
//        System.out.println(sum);
//    }

    //no.88
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            if (i % 3 == 0)
//                continue;
//            System.out.printf("%d ", i);
//
//        }
//    }

    //no.89
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int d = Integer.valueOf(data[1]);
//        int n = Integer.valueOf(data[2]);
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (i == 0) {
//                sum += a;
//            } else {
//                sum += d;
//            }
//        }
//
//        System.out.println(sum);
//    }

    //no.90
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int r = Integer.valueOf(data[1]);
//        int n = Integer.valueOf(data[2]);
//        long sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (i == 0) {
//                sum += a;
//            } else {
//                sum *= r;
//            }
//        }
//        System.out.println(sum);
//    }
}
