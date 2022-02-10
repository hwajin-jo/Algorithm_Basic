package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class day19 {

    // 9012 - 괄호
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt();
//
//
//        for (int i = 0; i < T; i++) {
//            System.out.println(solution(sc.next()));
//        }
//    }
//
//    public static String solution(String str) {
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            if (c == '(') {
//                stack.push(c);
//            } else if (stack.empty()) {
//                return "NO";
//            } else {
//                stack.pop();
//            }
//        }
//
//        if (stack.empty()) {
//            return "YES";
//        } else {
//            return "NO";
//        }
//    }

    // 10773 -  제로
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> stack = new Stack<>();
//
//        int K = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i < K; i++) {
//            int n = sc.nextInt();
//            if (n == 0) {
//                stack.pop();
//            } else {
//                stack.push(n);
//            }
//        }
//
//        for (int o : stack) {
//            sum += o;
//        }
//
//        System.out.println(sum);
//    }

    // 10828 - 스택
//    public static int[] stack;
//    public static int size = 0;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        int N = sc.nextInt();
//
//        stack = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            String str = sc.next();
//
//            switch (str) {
//                case "push":
//                    push(sc.nextInt());
//                    break;
//
//                case "pop":
//                    sb.append(pop()).append("\n");
//                    break;
//
//                case "size":
//                    sb.append(size()).append("\n");
//                    break;
//
//                case "empty":
//                    sb.append(empty()).append("\n");
//                    break;
//
//                case "top":
//                    sb.append(top()).append("\n");
//                    break;
//            }
//        }
//
//        System.out.println(sb);
//    }
//
//    public static void push(int num) {
//        stack[size] = num;
//        size++;
//    }
//
//    public static int pop() {
//        if (size == 0) {
//            return -1;
//        } else {
//            int result = stack[size-1];
//            stack[size - 1] = 0;
//            size--;
//            return result;
//        }
//
//    }
//
//    public static int size() {
//        return size;
//    }
//
//    public static int empty() {
//        if (size == 0) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//
//    public static int top() {
//        if (size == 0) {
//            return -1;
//        } else {
//            return stack[size - 1];
//        }
//    }
}
