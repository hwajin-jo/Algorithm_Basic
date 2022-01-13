
import java.util.Scanner;

public class day7 {

//    //no.61
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        System.out.println(a|b);
//    }

    //no.62
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        System.out.println(a^b);
//    }

    //no.63
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//
//        System.out.printf("%d", a > b ? a : b);
//    }

    //no.64
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//        int c = Integer.valueOf(data[2]);
//
//        System.out.printf("%d", (a < b ? a : b) < c ? (a < b ? a : b) : c);
//    }


    //no.65
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//        int c = Integer.valueOf(data[2]);
//
//        if (a % 2 == 0) {
//            System.out.println(a);
//        }
//
//        if (b % 2 == 0) {
//            System.out.println(b);
//        }
//
//        if (c % 2 == 0) {
//            System.out.println(c);
//        }
//    }

    //no.66
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] data = str.split(" ");
//
//        int a = Integer.valueOf(data[0]);
//        int b = Integer.valueOf(data[1]);
//        int c = Integer.valueOf(data[2]);
//
//        if (a % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//
//        if (b % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//
//        if (c % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//    }

    //no.67
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        if (str.charAt(0) == '-') {
//            System.out.println("minus");
//            int result = Integer.valueOf(str);
//            if (result % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        } else {
//            System.out.println("plus");
//            int result = Integer.valueOf(str);
//            if (result % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        }
//    }

    //no.68
//
//    평가 기준
//    점수 범위 : 평가
//    90 ~ 100 : A
//    70 ~   89 : B
//    40 ~   69 : C
//    0 ~   39 : D
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num >= 90 && num <= 100) {
//            System.out.println("A");
//        } else if (num >= 70 && num <= 89) {
//            System.out.println("B");
//        } else if (num >= 40 && num <= 69) {
//            System.out.println("C");
//        } else {
//            System.out.println("D");
//        }
//    }

    //no.69
//    A : best!!!
//    B : good!!
//    C : run!
//    D : slowly~
//    나머지 문자들 : what?
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        switch (str.charAt(0)) {
//            case 'A':
//                System.out.println("best!!!");
//                break;
//            case 'B':
//                System.out.println("good!!");
//                break;
//            case 'C':
//                System.out.println("run!");
//                break;
//            case 'D':
//                System.out.println("slowly~");
//                break;
//            default:
//                System.out.println("what?");
//                break;
//        }
//    }

    //no.70
//    월 : 계절 이름
//    12, 1, 2 : winter
//    3, 4, 5 : spring
//    6, 7, 8 : summer
//    9, 10, 11 : fall
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        switch (num) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("fall");
//                break;
//            default:
//                break;
//        }
//    }
}
