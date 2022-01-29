import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the num1:");
		int num1 = in.nextInt()	;
		//System.out.println("Enter the num2:");
		//int num2 = in.nextInt()	;
		
		for (int i=1; i<11; i++)
		{	
		System.out.println(num1 + "x" + (i) +" ="+  num1*(i) );
	}
}
}