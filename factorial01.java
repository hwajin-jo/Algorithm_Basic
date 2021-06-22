package algorithm_01;

import java.util.Scanner;

public class factorial01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = fact(N);
		
		System.out.println(result);
	}
	
	public static int fact(int n) {
		
		if(n == 2)
			return 2;
		else if(n == 0)
			return 1;
		else
			return n * fact(n-1);
		
	}

}
