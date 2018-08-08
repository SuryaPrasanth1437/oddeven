package program;

import java.util.Scanner;

public class Oddeven 
{

	public static void main(String[] args)
	{
		int n;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number");
		n=nu.nextInt();
		if (n%2==0)
			System.out.println("the given number is even");
		else
			System.out.println("the given number is odd");
		nu.close();
	}

}
