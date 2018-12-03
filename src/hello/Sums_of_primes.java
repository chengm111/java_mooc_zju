package hello;

import java.util.Scanner;

public class Sums_of_primes {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a,b,count=0,x=2,sum=0,coef;
		a=in.nextInt();
		b=in.nextInt();
		while(count<b) {
			coef=1;
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					coef=0;
					break;
				}
			}
			if(coef==1) {
				count++;
				if(count>=a) {
				sum+=x;
				}
			}
			x++;
		}
		System.out.print(sum);
	}
}
