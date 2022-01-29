import java.util.Scanner;

public class revnum {
	public static void main(String[]args ) {
		Scanner Num1 = new Scanner (System.in);
		System.out.println("Enter the num:");
		int Num = Num1.nextInt()	;
  int  reversed = 0;
while(Num != 0) 
{
int digit = Num %10;
reversed = reversed * 10 + digit;
Num /= 10;
}
System.out.println("the Number reversed is:" + reversed );

	}
}
