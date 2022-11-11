package bak;

import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] arr = new String[a];
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		int b = sc.nextInt();
		System.out.println(Collections.frequency(Arrays.asList(arr), b));
	}

}
