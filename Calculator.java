package Calculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 1;
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		System.out.println("Enter operation to be performed: (+,-,*,/,%,^)");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+': result = first + second; break;
		case '-': result = first - second; break;
		case '*': result = first * second; break;
		case '/': result = first / second; break;
		case '%': result = first % second; break;
		case '^': { 
				int val = 1;
				for(int i = 0; i < second; i++) {
					val *= first;
				}
				result = val;
		} break;
		default: System.out.println("Invalid operation");
			
		}
		System.out.println("Result = " + result);
	}

}
