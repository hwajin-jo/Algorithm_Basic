package Algorithm_Search.BInarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class day26 {

    // 떡볶이 떡 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 떡의 개수
        int m = sc.nextInt(); // 요청한 떡의 길이
        // 떡의 개별 높이
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색을 위한 시작점과 끝점
        int start = 0;
        int end = arr[n-1];

        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int total = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }

            // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
            if (total < m) {
                end = mid - 1;
                // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
            } else {
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result를 기록
                start = mid + 1;
            }
        }

        System.out.println(result);
    }


    // 부품찾기
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//        if (arr[mid] == target) return mid;
//        else if (arr[mid] > target) return binarySearch(arr, target, 0, mid - 1);
//        else return binarySearch(arr, target, mid + 1 , end);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        // n개의 부품 입력
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//
//        int m = sc.nextInt();
//        int[] target = new int[m];
//        // 찾을 m개의 부품 입력
//        for (int i = 0; i < m; i++) {
//            target[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < m; i++) {
//            int result = binarySearch(arr, target[i], 0, n-1);
//            if (result == -1) {
//                System.out.print("no" + " ");
//            } else  {
//                System.out.print("yes" + " ");
//            }
//        }
//
//    }

    // 반복문을 이용한 이진탐색
    // 이진 탐색 소스코드 구현(반복문)
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            // 찾은 경우 중간점 인덱스 반환
//            if (arr[mid] == target) return mid;
//                // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
//            else if (arr[mid] > target) end = mid - 1;
//                // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
//            else start = mid + 1;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//
//        // 전체 원소 입력받기
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // 이진 탐색 수행 결과 출력
//        int result = binarySearch(arr, target, 0, n - 1);
//        if (result == -1) {
//            System.out.println("원소가 존재하지 않습니다.");
//        }
//        else {
//            System.out.println(result + 1);
//        }
//    }



    // 재귀함수를 이용한 이진탐색
    // 이진 탐색 소스코드 구현(재귀 함수)
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//        // 찾은 경우 중간점 인텍스 반환
//        if (arr[mid] == target) return mid;
//        // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
//        else if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
//        else return binarySearch(arr, target, mid + 1, end);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//
//        // 전체 원소 입력받기
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // 이진 탐색 수행 결과 출력
//        int result = binarySearch(arr, target, 0, n - 1);
//        if (result == -1) {
//            System.out.println("원소가 존재하지 않습니다.");
//        } else {
//            System.out.println(result + 1);
//        }
//    }

    // 순차탐색
//    // 순차 탐색 소스코드 구현
//    public static int sequantialSearch(int n, String target, String[] arr) {
//        // 각 원소를 하나씩 확인하며
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//            // 현재의 원소가 찾고자 하는 원소와 동일한 경우
//            if (arr[i].equals(target)) {
//                return i + 1; // 현재의 위치 반환 (인덱스는 0부터 시작하므로 1 더하기)
//            }
//        }
//        return -1; // 원소를 찾지 못한 경우 -1 반환
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
//        // 원소의 개수
//        int n = sc.nextInt();
//        // 찾고자 하는 문자열
//        String target = sc.next();
//
//        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.next();
//        }
//
//        // 순차 탐색 수행 결과 출력
//        System.out.println(sequantialSearch(n, target, arr));
//    }
}
