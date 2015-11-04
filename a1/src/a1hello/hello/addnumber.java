package a1hello.hello;
import java.util.Scanner;

public class addnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter First Number:");
		number1 = input.nextInt();
		System.out.print("Enter Second Number:");
         number2 = input.nextInt();
         sum = number1 + number2;
         
         System.out.printf("Sum is %d\n ", sum);
         
	}

}
