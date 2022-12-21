package bak;


import java.util.*;

public class Main {
	 
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	
		
		String[] arr = new String[a];
		
		sc.nextLine();
		
		for(int i = 0; i <a ; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		Arrays.sort(arr, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for (int i = 1; i < a; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
		
	

	}
		
}


