package helloworld;

import java.util.Scanner; 

public class TemperatureConverter {
	
	
public static void main(String[] args) {
System.out.println("input the Fahrenheit temperature");
double F , C;
Scanner sc= new Scanner(System.in);
F = sc.nextDouble();
C = (F-32)*5/9;
System.out.print("Celsius temperature is " + C);
}

}

