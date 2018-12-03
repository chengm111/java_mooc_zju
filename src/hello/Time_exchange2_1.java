package hello;

import java.util.Scanner;

public class Time_exchange2_1 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int f;
		int s;
		f=in.nextInt();
		if(f<800) {
			s=2400+f-800;
		}
		else {
			s=f-800;
		}
		System.out.println(s);
	}
}
