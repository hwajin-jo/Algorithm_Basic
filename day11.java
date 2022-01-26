package Algorithm_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class day11 {

    //  2893 - 설탕배달
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        if (N == 4 || N == 7) {
//            System.out.println(-1);
//        } else if (N % 5 == 0) {
//            System.out.println(N / 5);
//        } else if (N % 5 == 1 || N % 5 == 3) {
//            System.out.println((N / 5) + 1);
//        } else if (N % 5 == 2 || N % 5 == 4) {
//            System.out.println((N / 5) + 2);
//        }
//
//    }

    // 11399 - ATM
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		int[] wait = new int[N];
//
//		for (int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		Arrays.sort(arr);
//
//		// 방법2
//		int sum = 0;
//		int prev = 0;
//
//		for (int i = 0; i < N; i++) {
//			sum += prev + arr[i];
//
//			prev += arr[i];
//		}
//
//		System.out.println(sum);


    // 방법1
//		for (int i = 0; i < N; i++) {
//			if (i == 0) {
//				wait[i] = arr[i];
//			} else {
//				wait[i] = arr[i] + wait[i-1];
//			}
//		}
//
//		int result = 0;
//
//		for (int i = 0; i < N; i++) {
//			result += wait[i];
//		}
//
//		System.out.println(result);


//	}

    // 1931 - 회의실 배정
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int [][] time = new int[N][2];
//
//		for (int i = 0; i < N; i++) {
//			time[i][0] = sc.nextInt(); // 시작시간
//			time[i][1] = sc.nextInt(); // 종료시간
//		}
//
//		// 종료시간을 기준으로 정렬하기 위해서 compare함수를 재정의 한다.
//		Arrays.sort(time, new Comparator<int[]> () {
//
//			@Override
//			public int compare(int[] o1, int[] o2 ) {
//
//				// 종료시간이 같을 때는 시작시간이 빠른 순으로 정렬해야 한다.
//				if(o1[1] == o2[1]) {
//					return o1[0] - o2[0];
//				}
//
//				return o1[1] - o2[1];
//			}
//		});
//
//		int count = 0;
//		int prev_end_time = 0;
//
//		// 직전 종료 시간이 다음 회의 시작 시간보다 작거나 같은면 갱신
//		for (int i = 0; i < N; i++) {
//			if (prev_end_time <= time[i][0]) {
//				prev_end_time = time[i][1];
//				count++;
//			}
//		}
//
//		System.out.println(count);
//	}

    // 11047 - 동전0
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int K = sc.nextInt();
//		int[] arr = new int[N];
//		int result = 0;
//
//		for(int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for(int i = N-1; i >= 0; i--) {
//			if(arr[i] <= K) {
//				result += (K / arr[i]);
//				K = K % arr[i];
//			}
//		}
//
//		System.out.println(result);
//	}

}
