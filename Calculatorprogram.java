package helloworld;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int a, b, c ;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("input two integers");
		
		a = sc.nextInt();
		b = sc.nextInt();
	
		System.out.println("select operators 1. + 2. - 3. * 4. /");
		c = sc.nextInt();
		
		switch(c) {
			case 1:
				System.out.println("addition = " + (a+b));
				break;
			case 2:
				System.out.println("subtraction = " + (a-b));
				break;
			case 3:
				System.out.println("multiplication = " + (a*b));
				break;
			case 4:
				System.out.println("divisioen = " + (a/b));
			default :
				System.out.println("not define");
		}
		
	}

}
