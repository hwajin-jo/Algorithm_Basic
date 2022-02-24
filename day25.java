package Algorithm_Sorting;

import java.util.*;


//class Fruit implements Comparable<Fruit> {
//    private String name;
//    private int score;
//
//    public Fruit(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getScore() {
//        return this.score;
//    }
//
//    @Override
//    public int compareTo(Fruit other) {
//        if (this.score > other.score) {
//            return -1;
//        }
//        return 1;
//    }
//
//    // 정렬 기준은 '점수가 낮은 순서부터'
//
//}

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // 정렬기준은 점수가 낮은 순서
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}
public class day25 {

//    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {

        // 두 배열의 원소 교체
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[n];
        Integer[] B = new Integer[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (A[i] < B[i]) {
                int temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            }
            else
                break;
        }

        // A의 배열 원소의 합 출력
        long   sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        System.out.println(sum);

        // 성적이 낮은 순서로 학생 출력하기
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        List<Student> students = new ArrayList<>();
//
//        // 학생 정보 입력
//        for (int i = 0; i < n; i++) {
//            students.add(new Student(sc.next(), sc.nextInt()));
//        }
//
//        Collections.sort(students);
//        // 학생 성적순으로 이름 출력
//        for (int i = 0; i < students.size(); i++) {
//            System.out.print(students.get(i).getName() + " ");
//        }



//        // 위에서 아래로
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        Integer[] arr = new Integer[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }



        // 정렬 라이브러리 키 기준 정렬 예제
//        List<Fruit> fruits = new ArrayList<>();
//
//        fruits.add(new Fruit("바나나", 2));
//        fruits.add(new Fruit("사과", 5));
//        fruits.add(new Fruit("당근", 3));
//
//        Collections.sort(fruits);
//
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.print("(" + fruits.get(i).getName() + "," + fruits.get(i).getScore() + ") ");
//        }


        // 계수정렬
//        int n = 15;
//        // 모든 원소의 값이 0보다 크거나 같다고 가정
//        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
//        // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
//        int[] cnt = new int[MAX_VALUE + 1];
//
//        for (int i = 0; i < n; i++) {
//            cnt[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
//        }
//        for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
//            for (int j = 0; j < cnt[i]; j++) {
//                System.out.print(i + " "); // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
//            }
//        }
//    }

        // 퀵정렬
//        int n = 10;
//        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
//
//        quickSort(arr, 0, n - 1);
//
//        for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void quickSort(int[] arr, int start, int end) {
//        if (start >= end) return; // 원소가 1개인 경우 종료
//        int pivot = start; // 피벗은 첫 번째 원소
//        int left = start + 1;
//        int right = end;
//        while (left <= right) {
//            // 피벗보다 큰 데이터를 찾을 때까지 반복
//            while (left <= end && arr[left] <= arr[pivot]) left++;
//            // 피벗보다 작은 데이터를 찾을 때까지 반복
//            while (right > start && arr[right] >= arr[pivot]) right--;
//            // 엇갈렸다면 작은 데이터와 피벗을 교체
//            if (left > right) {
//                int temp = arr[pivot];
//                arr[pivot] = arr[right];
//                arr[right] = temp;
//            }
//            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
//            else {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }
//        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
//        quickSort(arr, start, right - 1);
//        quickSort(arr, right + 1, end);
//    }

    // 삽입정렬
//        int n = 10;
//        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
//
//        for (int i = 1; i < n; i++) {
//            // 인덱스 i부터 1까지 감소하며 반복하는 문법
//            for (int j = i; j > 0; j--) {
//                // 한 칸씩 왼쪽으로 이동
//                if (arr[j] < arr[j - 1]) {
//                    // 스와프(Swap)
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//                // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
//                else break;
//            }
//        }

//        for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 선택정렬

//        int n = 10;
//        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
//
//        for (int i = 0; i < n; i++) {
//            int min_index = i; // 가장 작은 원소의 인덱스
//            for (int j = i + 1; j < n; j++) {
//                if (arr[min_index] > arr[j]) {
//                    min_index = j;
//                }
//            }
//            // 스와프
//            int temp = arr[i];
//            arr[i] = arr[min_index];
//            arr[min_index] = temp;
//        }
//
//        for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
