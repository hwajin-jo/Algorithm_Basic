import java.util.Scanner;

public class day2 {

// no. 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.print(str);
//    }

// no. 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.printf("%f", num);
//    }

// no. 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.printf("%d %d", a, b);
//    }

// no. 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String b = sc.next();
//        System.out.printf("%s %s", b, a);
//    }

// no. 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.printf("%.2f", num);
//    }

// no. 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.printf("%d %d %d", num, num, num);
//    }

// no. 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String x = sc.nextLine();
//        System.out.print(x);
//    }

// no. 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str;
//        String [] a;
//        str = sc.nextLine();
//        a = str.split("\\.");
//
//        int a1 = Integer.parseInt(a[0]);
//        int a2 = Integer.parseInt(a[1]);
//        int a3 = Integer.parseInt(a[2]);
//
//        System.out.printf("%04d.%02d.%02d", a1, a2, a3);
//
//    }

// no. 20
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String[] a;
        str = sc.nextLine();
        a = str.split("\\-");

        String a1 = String.valueOf(a[0]);
        String a2 = String.valueOf(a[1]);
        System.out.print(a1+a2);
    }
}
