package hello;

import java.util.Scanner;

public class Main {
	private static Scanner in;
	public static boolean isIntegrity(int x) {
		int a=0,i;
		boolean bl;
		for(i=1;i<x;i++) {
			if(x%i==0) {
				a+=i;
			}
		}
		if(a==x) {
			bl=true;
		}
		else {
			bl=false;
		}
		return bl;
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int count=0;
		for(int i=n;i<=m;i++) {
			if(isIntegrity(i)) {
				count++;
				if(count==1) {
					System.out.print(i);
				}
				else {
					System.out.print(" "+i);
				}
			}
		}
	}
}
