package hello;
import java.util.Scanner;

public class Signal_report2_2 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int f,a,b;
		f=in.nextInt();
		a=f/10;
		b=f%10;
		if(b==1) {
			System.out.print("Faint signals, barely perceptible");
		}
		else if(b==2) {
			System.out.print("Very weak signals");
		}
		else if(b==3) {
			System.out.print("Weak signals");
		}
		else if(b==4) {
			System.out.print("Fair signals");
		}
		else if(b==5) {
			System.out.print("Fairly good signals");
		}
		else if(b==6) {
			System.out.print("Good signals");
		}
		else if(b==7) {
			System.out.print("Moderately strong signals");
		}
		else if(b==8) {
			System.out.print("Strong signals");
		}
		else {
			System.out.print("Extremely strong signals");
		}

		System.out.print(", ");
		if(a==1) {
			System.out.print("unreadable");
		}
		else if(a==2) {
			System.out.print("barely readable, occasional words distinguishable");
		}
		else if(a==3) {
			System.out.print("readable with considerable difficulty");
		}
		else if(a==4) {
			System.out.print("readable with practically no difficulty");
		}
		else {
			System.out.print("perfectly readable");
		}
		System.out.print(".");

	}
}