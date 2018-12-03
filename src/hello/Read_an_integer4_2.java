package hello;

import java.util.Scanner;

public class Read_an_integer4_2 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a,b,i,count=0;
		a=in.nextInt();
		if(a<0) {
			System.out.print("fu ");
			a=-a;
		}
		if(a==0) {
			System.out.print("ling");
		}
		b=a;
		while(b>0) {
			count++;
			b=b/10;
		}
		for(i=count-1;i>=0;i--) {
			b=a/(int)(Math.pow(10,i));
			switch(b) {
			case 0:
				System.out.print("ling");
				break;
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			}
			if(i>0) {
				System.out.print(" ");
			}
			a=a%(int)(Math.pow(10,i));
		}
	}
}