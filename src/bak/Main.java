package bak;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[30];
		
		for(int i =0; i < 27; i++) {
			int b=sc.nextInt();
			arr[b] = true;
		}
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != true) {
				System.out.println(i+1);
			}
			
			
		}

		
		
	}

}
