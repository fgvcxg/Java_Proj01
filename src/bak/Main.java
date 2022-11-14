package bak;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0, b=0;
		
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0; i < arr.length; i++) {
			
			if(max<arr[i]) {
				max=arr[i];
				b=i+1;
			}
		}
		System.out.println(max);
		System.out.println(b);
		
		
	}

}
