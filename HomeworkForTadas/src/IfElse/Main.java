package IfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(!(n % 2 == 0)) {
			System.out.println("Wierd");
		}
		else if(n >= 2 && n <= 5) {
			System.out.println("not Wierd");
		}
		else if(n >= 6 && n <= 20) {
			System.out.println("not Wierd");
		}
		else if(n >= 20) {
			System.out.println("not Wierd");
		}
		else {
			System.out.println("Wierd");
		}

	}

}
