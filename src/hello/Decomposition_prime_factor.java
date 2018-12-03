package hello;

import java.util.Scanner;

public class Decomposition_prime_factor {
	private static Scanner in;
	public static int isPrime(int x) {
		int temp=1;
		int a,i;
		for(i=2;i<x;i++) {
			if(x%i==0) {
				temp=0;
				break;
			}
		}
		if(temp==1) {
			a=x;
		}
		else {
			a=i;
		}
		return a;
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int x=in.nextInt();
		System.out.print(x+"=");
		do {
			int a=isPrime(x);
			x=x/a;
			if(x!=1) {
				System.out.print(a+"x");
			}
			else {
				System.out.print(a);
				break;
			}
		}while(true);

	}
}
