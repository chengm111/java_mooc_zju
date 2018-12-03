package hello;

import java.util.Scanner;

public class Word_Length6_1 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int start=-1,end=-1;
		String s= in.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if(start==-1) {
					start=i;
				}
			}
			else if(start!=-1) {
				end=i;
				System.out.print((end-start)+" ");
				start=-1;
				end=-1;
			}
			if(s.charAt(i)=='.') {
				end=i;
				if(end-start!=0)
				System.out.print(end-start);
			}
		}
	}
}