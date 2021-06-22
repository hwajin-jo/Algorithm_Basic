package algorithm_01;

import java.util.Scanner;

public class fibonacci01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		int result = Fibo(N);
		
		System.out.println(result);

	}
	
	public static int Fibo(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return Fibo(n-1) + Fibo(n-2);
	}

}
