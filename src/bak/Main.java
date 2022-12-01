package bak;


import java.util.*;

public class Main {
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt(), b = sc.nextInt();
		int c = sc.nextInt();
		double aa = a/b;
		
		String s = Double.toString(aa);
		String[] ss = s.split(".");
		char[] ch = new char[ss[1].length()];
		for(int i =0 ; i<ch.length;i++) {
			ch[0] = ss[1].charAt(i);
		}
		System.out.println(ch[c-1]);
		
		
		
	}
}
