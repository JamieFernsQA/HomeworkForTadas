package StdInStdOutTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  Scanner scanInt = new Scanner(System.in);
		  System.out.println("insert an integer");
	        int i = scanInt.nextInt();
          System.out.println("insert a double");
	        double d = scanInt.nextDouble();
	        
	        Scanner scanText=new Scanner(System.in);
	        System.out.println("insert a String");
            String s = scanText.nextLine();
            
            System.out.println("Int: " + i);
	        System.out.println("Double: " + d);
	        System.out.println("String: " + s);
	}

}
