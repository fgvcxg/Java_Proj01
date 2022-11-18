package bak;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count=1,j =1,numer =1, deno=1;
		for(int i =1;num == count;i++) {
			
			
			for(j =1,numer =1, deno=i;j==i;j++,numer++,deno--) {
				
				
				count++;
				
			}
		
		}
		System.out.printf("%d/%d");
	}
}
