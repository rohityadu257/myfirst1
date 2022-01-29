import java.util.Scanner;

public class calculate {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter the Number of Items you wanna print? :");
		int Count = sc.nextInt();
		
		int num1=1,num2=1;
		
		System.out.print(num1+ "," +num2 );
		int i;
		for (i=0;i<Count-2;i++)
		{
			int Sum = num1 + num2;
			System.out.print( "," + Sum);
			num1=num2;
			num2=Sum;
			
		}
		
		//System.out.print("-----");
	}
	
}
