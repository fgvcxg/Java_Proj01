package bak;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>=2) {
				for(int j = 2;j<=arr[i];j++) {
					if(arr[i]%j==0) {
						if(arr[i] == j) {
							count++;
							break;
						}
						
						break;
					}
				}
				
			}
		}
		
		System.out.println(count);
		
	}
}
