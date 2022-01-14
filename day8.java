import java.util.Scanner;

public class day8 {

    //no.71
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            int num = sc.nextInt();
//            if (num == 0)
//                break;
//            System.out.println(num);
//        }
//    }

    //no.72
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] data = new int[num];
//
//        for(int i = 0; i < num; i++) {
//            data[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < num; i++) {
//            System.out.println(data[i]);
//        }
//    }

    //no.73
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            int data = sc.nextInt();
//            if (data == 0) {
//                break;
//            }
//            System.out.println(data);
//        }
//    }

    //no.74
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        while(num!= 0) {
//            System.out.println(num);
//            num--;
//        }
//    }

    //no.75
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        while (num != 0) {
//            System.out.println(--num);
//        }
//    }

    //no.76
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char c = 'a';
//
//        while (c <= str.charAt(0)) {
//            System.out.printf("%s", c);
//            System.out.print(" ");
//            c++;
//        }
//    }

    //no.77
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int data = 0;
//
//        while(num >= data) {
//            System.out.println(data);
//            data++;
//        }
//    }

    //no.78
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] data = new int[num];
//        int sum = 0;
//
//        for(int i = 0; i < num; i++) {
//            data[i] = i+1;
//        }
//
//        for(int i = 0; i < num; i++) {
//            if (data[i] % 2 == 0) {
//                sum += data[i];
//            }
//        }
//        System.out.println(sum);
//
//    }

    //no.79
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        for(int i = 0; i <= data.length; i++) {
//            System.out.println(data[i]);
//            if (data[i].equals("q"))
//                break;
//        }
//    }

    //no.80
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int result = 0;

        while(num > result) {
            result += i;
            if (num <= result) {
                System.out.println(i);
            }
            i++;
        }

    }
}
