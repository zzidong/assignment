package helloworld;

import java.util.Scanner;

public class secondcovert {

	public static void main(String[] args) {
		System.out.print("input a second :");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		int y, d = 86400 , h = 3600, m = 60;
		
		if (x>=d) {
			
			System.out.print(x/d +"d");	
		}
	
		y = x%d;
		
		if(y>=h) {
			
			System.out.print(y/h +"h");
		}
		y= x%h;
		
		if(y>=m) {
			
			System.out.print(y/m +"m");
			
			System.out.println(x%m +"s");
		}
		if(y<m) {
			
			System.out.println(x +"s");
		}
		if(x>d*365) {
			System.out.print(x +"seconds are more than 1 year");
		}
		else {
			System.out.print(x +"seconds are less than 1 year");
		}
		
		}
	}

