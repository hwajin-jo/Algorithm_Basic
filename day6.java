import java.util.Scanner;

public class day6 {

    //no.51
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a <= b) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.52
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == b) {
//            System.out.println(0);
//        } else {
//            System.out.println(1);
//        }
//    }

    //no.53
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num == 1) {
//            System.out.println(0);
//        } else {
//            System.out.println(1);
//        }
//    }

    //no.54
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == 1 && b == 1) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.55
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == 1 || b == 1) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.56
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == 1 && b == 0 || a == 0 && b ==1) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.57
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == 1 && b == 1 || a == 0 && b ==0) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.58
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        if (a == 0 && b ==0) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//    }

    //no.59
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(~num);
//    }

    //no.60
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] data = str.split(" ");

        int a = Integer.valueOf(data[0]);
        int b = Integer.valueOf(data[1]);

        int result = a & b;

        System.out.println(result);
    }
}
