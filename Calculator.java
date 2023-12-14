import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		//Do another Y/N ? y
		String ask = "";
		do{
			welcome();
			showOperator();

		//get input num1
		System.out.print("Input Number 1 : ");
		int n1 = sc.nextInt();

		//get input num2
		System.out.print("Input Number 2 : ");
		int n2 = sc.nextInt();

		//get input operator
		System.out.print("Type Operator : ");
		char op = sc.next().charAt(0);

		//calculation
		calculate(n1,n2,op);

		System.out.print("Try Again ? (y/n) : ");
		ask = sc.next();

		}while(ask.equalsIgnoreCase("Y"));
		
		breakLine();
		System.out.println("thk u");

	}

	static void calculate(int n1, int n2, char opera){

		//swithc()
		int res = 0;
		switch(opera)
		{
			case '+' : res = n1 + n2; break;
			case '-' : res = n1 - n2; break;
			case '*' : res = n1 * n2; break;
			case '/' : res = n1 / n2; break;
			default : System.out.println("Wrong Operator!!!");
		}
		System.out.println("Reuslt is : " + 
			n1 + " " + opera + " " + n2 + " = " + res );
	}

	static void welcome(){
		System.out.println("************************");
		System.out.println("**                    **");
		System.out.println("** Calculator Program **");
		System.out.println("**                    **");
		System.out.println("************************");
		System.out.println();
	}

	static void showOperator(){
		System.out.println("Show Operator");
		System.out.println("+ - Plus");
		System.out.println("- - Minus");
		System.out.println("* - Multiple");
		System.out.println("/ - Divided");
		System.out.println();
	}

	static void breakLine() {
		System.out.println();
	}

}