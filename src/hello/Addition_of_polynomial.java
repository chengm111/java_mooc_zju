package hello;

import java.util.Scanner;

public class Addition_of_polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] m = new int[102];
		int a,b;
		int count=0;
		while(count<2) {
			b=in.nextInt();
			a=in.nextInt();
			m[b]+=a;
			if(b==0) {
				count++;
			}
		}
		count=0;
		for(int i=101;i>=2;i--) {
			if(m[i]!=0) {
				count++;
				if(count!=1 && (m[i]>0)) {
					System.out.print("+");
				}
				if(m[i]!=1) {
					System.out.print(m[i]);
				}
				System.out.print("x"+i);
			}
		}
		if(m[1]!=0) {
			if(m[1]>0 && count!=0) {
				System.out.print("+");
			}
			if(m[1]!=1) {
				System.out.print(m[1]);
			}
			System.out.print("x");
			count++;
		}
		if(m[0]!=0) {
			if(m[0]>0 && count!=0) {
				System.out.print("+");
			}
			System.out.print(m[0]);
		}
		else if(count==0) {
			System.out.print(0);
		}

	}

}
