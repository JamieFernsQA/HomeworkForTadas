package SubString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
	    Scanner in = new Scanner(System.in);
	    String S = in.next();
	    int start = in.nextInt();
	    int end = in.nextInt();
	    char [] a=S.toCharArray();
	    for (int i=start;i<end;i++)
	    {
	        System.out.print(a[i]);
	    }
	}
	}


