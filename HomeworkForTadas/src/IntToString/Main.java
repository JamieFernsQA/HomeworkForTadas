package IntToString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();		
		
		
        if(n <= 100 && n >= -100) {
    		String s = Integer.toString(n);
    		s = "good job";
    		System.out.println(s);
        }
        else {
        	System.out.println("Wrong Answer");
        }
	}

}
