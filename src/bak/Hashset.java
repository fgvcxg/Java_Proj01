package bak;

import java.io.*;
import java.util.*;

public class Hashset {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for(int i =0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			System.out.println((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		
		bw.close();
	}

}
