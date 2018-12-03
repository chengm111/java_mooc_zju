package hello;

import java.util.Scanner;

public class Odd_even_count {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int f,a=0,b=0;
		f=in.nextInt();
		while(f!=-1) {
			if(f%2==0) {
				b+=1;
			}
			else {
				a+=1;
			}
			f=in.nextInt();
		}
		System.out.print(a+" "+b);
	}
}