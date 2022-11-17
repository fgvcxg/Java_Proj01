package bak;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), c=Integer.parseInt(st.nextToken()), day=0;
		for(int i =0;;day++) {
			
			
			if(i>=c) {
				break;
			}	
			if(i!=0) {
				i=i-b;
			}
			i=i+a;			
		}		
		System.out.println(day);
		
		br.close();
	}
}
