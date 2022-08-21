package assignment;

import java.util.Scanner;

public class assignment {
	
	public void checkPalindrome() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number to be checked for palindrome: ");
		int i = in.nextInt();
		int j = i;
		int ReversedNum = 0;
		
		while (j%10 != 0)
			
		{	int Remainder = j%10;
			ReversedNum = ReversedNum * 10 + Remainder;
			j = j/10;
		}
		if(i == ReversedNum) {
			System.out.println(i+" is a palindrome number");
		}else {
			System.out.println(i+" is not a palindrome number");
		}
	}
	
	public void printPattern() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter no of rows");
		int rows = in.nextInt();
		
		for (int i = rows; i>0; i--) {
			
			for (int j = 0; j <i; j++){
				
				System.out.print("*" + " ");
			}
			System.out.println("");
		}	
	}
	
	public void checkPrime() {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter number that needs to be checked for prime or not: ");
		int num = in.nextInt();
		
		if (num%2 != 0 && num%num == 0)
			
		{System.out.println("Given number is a prime number");}
		
		else
			
		{System.out.println("Given number is not a prime number");}
	}
	
	public void fibonacciSeries() {
		int num1 = 0, num2 = 1, num3, i, count;
		
		System.out.println("Enter count value: ");
		Scanner in = new Scanner (System.in);
		count = in.nextInt();
		
		System.out.print(num1);
		System.out.print(","+num2);
			
		
		for (i=2; i<count; i++)
			
		{
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		assignment obj = new assignment();
		int option;
		do {
			System.out.println("Enter your option from the below list \n 1) Check if number is a palindrome \n 2) Print star pattern \n 3) Check if number is a prime number \n 4) Print fibbonacci series \n 5) Enter 0 to Exit\n");
			option = in.nextInt();
			switch(option) {
				case 0 : break;
				case 1 : obj.checkPalindrome();
				break;
				case 2 : obj.printPattern();
				break;
				case 3 : obj.checkPrime();
				break;
				case 4 : obj.fibonacciSeries();
				break;
				default : System.out.println("Invalid choice. Enter a valid no.\n");
			}
		}while(option != 0);
			System.out.println("Exited Sucessfully!!");
			in.close();
			
	}
}
