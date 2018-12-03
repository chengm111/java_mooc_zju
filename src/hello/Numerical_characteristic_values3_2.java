package hello;

import java.util.Scanner;

public class Numerical_characteristic_values3_2 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int f,a=0,b=0,i=0;
		f=in.nextInt();
		while(f!=0) {
			a=f%10;
			if(a%2==((i+1)%2)){
				b+=Math.pow(2, i);
			}
			i=i+1;
			f=f/10;
		}
		System.out.print(b);
	}
}