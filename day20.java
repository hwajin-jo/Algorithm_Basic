package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day20 {
    // 11866 - 요세푸스 문제0
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Queue<Integer> queue = new LinkedList<>();
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//
//        for (int i = 1; i < N+1; i++) {
//            queue.offer(i);
//        }
//
//        int i = 1;
//
//        System.out.print("<");
//        while (queue.size() > 1) {
//            int num = queue.poll();
//            if (i != K) {
//                queue.offer(num);
//            } else {
//                System.out.print(num + ", ");
//                i = 0;
//            }
//
//            i++;
//        }
//
//        System.out.print(queue.poll());
//        System.out.println(">");
//    }

    // 2164 - 카드2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//
//        for (int i = 1; i < N+1; i++) {
//            queue.offer(i);
//        }
//
//        while (queue.size() > 1) {
//            queue.poll();
//            int num = queue.poll();
//            queue.offer(num);
//        }
//
//        System.out.println(queue.poll());
//    }


    // 18258 - 큐2
//    public static int[] queue = new int[2000000];
//    public static int size = 0;
//    public static int front = 0;
//    public static int back = 0;
//
//    static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st;
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//
//            st = new StringTokenizer(br.readLine(), " ");
//
//            switch (st.nextToken()) {
//
//                case "push":
//                    push(Integer.parseInt(st.nextToken()));
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
//                case "front":
//                    sb.append(front()).append("\n");
//                    break;
//
//                case "back":
//                    sb.append(back()).append("\n");
//                    break;
//            }
//        }
//        System.out.println(sb);
//    }
//
//    public static void push(int n) {
//        queue[back] = n;
//        size++;
//        back++;
//    }
//
//    public static int pop() {
//        if (size == 0) {
//            return -1;
//        } else {
//            int result = queue[front];
//            size--;
//            front++;
//            return result;
//        }
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
//    public static int front() {
//        if (size == 0) {
//            return -1;
//        } else {
//            return queue[front];
//        }
//    }
//
//    public static int back() {
//        if (size == 0) {
//            return -1;
//        } else {
//            return queue[back - 1];
//        }
//    }

}
