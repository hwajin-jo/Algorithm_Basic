import java.util.Scanner;

public class day10 {

    //no.91
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int m = Integer.valueOf(data[1]);
//        int d = Integer.valueOf(data[2]);
//        int n = Integer.valueOf(data[3]);
//        long sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (i == 0) {
//                sum += a;
//            } else {
//                sum = sum * m + d;
//            }
//        }
//
//        System.out.println(sum);
//    }

    //no.92
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//        int c = Integer.valueOf(data[2]);
//        int day = 1;
//
//        while (day % a != 0 || day % b != 0 || day % c != 0)
//            day++;
//
//        System.out.println(day);
//    }

    //no.93
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[23];
//
//        for (int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            arr[a-1] += 1;
//        }
//
//        for (int i = 0; i < 23; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    //no.94
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = n-1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    //no.95
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int result = 0;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        result = arr[0];
//
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] < result) {
//                result = arr[i];
//            }
//        }
//        System.out.println(result);
//    }

    //no.96
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[19][19];
//
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            arr[x-1][y-1] = 1;
//        }
//
//        for (int i = 0; i < 19; i++) {
//            for (int j = 0; j < 19; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //no.97
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[20][20];
//
//        for (int i = 0; i < 19; i++) {
//            for (int j = 0; j < 19; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            for (int j = 0; j < 19; j++) {
//                if (arr[x-1][j] == 0) {
//                    arr[x-1][j] = 1;
//                } else {
//                    arr[x-1][j] = 0;
//                }
//            }
//
//            for (int k = 0; k < 19; k++) {
//                if (arr[k][y-1] == 0) {
//                    arr[k][y-1] = 1;
//                } else {
//                    arr[k][y-1] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < 19; i++) {
//            for (int j = 0; j < 19; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //no.98
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int w = sc.nextInt();
//        int h = sc.nextInt();
//        int[][] arr = new int[w][h];
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int l = sc.nextInt();
//            int d = sc.nextInt();
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            for (int j = 0; j < l; j++) {
//                if (d == 0) {
//                    arr[x - 1][y - 1 + j] = 1;
//                } else {
//                    arr[x - 1 + j][y - 1] = 1;
//                }
//            }
//        }
//        for (int i = 0; i < w; i++) {
//            for (int j = 0; j < h; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //no.99
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[11][11];
//
//        for (int i = 1; i < 11; i++) {
//            String a = sc.nextLine();
//            String[] b = a.split(" ");
//            for (int j = 0; j < 10; j++) {
//                arr[i][j+1] = Integer.parseInt(b[j]);
//            }
//        }
//
//        int x = 2;
//        int y = 2;
//
//        while (true) {
//            if (arr[x][y] == 2) {
//                arr[x][y]= 9;
//                break;
//            }
//
//            if (arr[x][y+1] == 1) {
//                if (arr[x+1][y] == 1) break;
//                else x++;
//            } else if (arr[x][y+1] != 1) y++;
//
//            if (arr[x][y] == 2){
//                arr[x][y] = 9;
//                break;
//            }
//
//            arr[x][y] = 9;
//        }
//
//        arr[2][2] = 9;
//
//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 11; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
