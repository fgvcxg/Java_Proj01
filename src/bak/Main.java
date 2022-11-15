package bak;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int room=2;
		int i=1;
		
		if(a==1) {
			System.out.println("1");
		}else {
			
			while(a >=room) {
				room = room +(i*6);
				i++;	
			}
			System.out.println(i);
			
		}	
	}
}
