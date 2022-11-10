package bak;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		e = 0;
		for(int i = 0; i < b; i++ )
		{
			c = sc.nextInt();
			d = sc.nextInt();
			e = e + (c*d);
		}
		
		if(a==e) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
