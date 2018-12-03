package hello;
import java.util.Scanner;
public class Temperature_exchange1_1 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int f;
		f=in.nextInt();
		int s;
		s=(int)((5.0/9.0)*(f-32));
		System.out.println(s);
	}

}
