package hello;

import java.util.Scanner;

public class Gps_data_processing6_2 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int yihuo=0;
		String s= in.nextLine();
		StringBuffer time = new StringBuffer();
		while(s.equals("END")==false) {
			int loc=s.indexOf(',');
			loc=s.indexOf(',',loc+1);
			char num=s.charAt(loc+1);
			if(s.startsWith("$GPRMC") && num=='A') {
				int loc_a=s.indexOf('*');
				yihuo=(int)s.charAt(1);
				for(int i=2;i<loc_a;i++) {
					yihuo=yihuo^(int)s.charAt(i);
				}
				yihuo=yihuo%65536;
				Integer yih=(Integer)yihuo;
				String yh=Integer.toHexString(yih);
				String s1=s.substring(s.indexOf("*")+1);
				if(s1.equals(yh)) {
					time.setLength(0);
					String t=s.substring(7, 13);
					int h=Integer.valueOf(t.substring(0,2));
					h=h+8;
					if(h>24) {
						h=h-24;
					}
					if(h<10) {
						time.append("0"+String.valueOf(h));
					}
					else {
						time.append(String.valueOf(h));
					}
					time.append(":"+t.substring(2,4)+":"+t.substring(4,6));
				}
			}
			s=in.nextLine();
		}
		System.out.println(time.toString());

	}
}