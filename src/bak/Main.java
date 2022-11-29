package bak;


import java.util.*;

class A{			//받을 값 만들기
	int nation;		//국가 번호
	int num;		//수험생 번호
	int score;		//수험생 점수
	
	A(int nation, int num, int score){	//생성자로 3가지 받기
		this.nation = nation;
		this.num = num;
		this.score = score;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//몇명이 대회에 참가 할 건지 확인
		A[] arr = new A[a];		//A 타입 생성자호출
		
		int[] nationArr = new int[101];	//100명이라하고 했으니 101로 배열을 설정
		
		for(int i =0;i<arr.length;i++) {	//하나하나 받아서 각 정수 값을 저장
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			arr[i] = new A(b,c,d);			//하나하나 받은 정수 값을 A 에 넣음
			 			
		}
		
		Arrays.sort(arr, new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {	//점수 높은 순서대로 정렬				
				return o2.score - o1.score;
			}
		});
		
		int count = 0;	//배열 인텍스
		int print = 0;	//동메달까지
		
		while(print < 3) {	//정렬 후에 동메달까지 출력
			int nation = arr[count].nation;
			nationArr[nation]++;
			
			if(nationArr[nation] < 3) {
				System.out.println(arr[count].nation + " " + arr[count].num);
				print++;
			}
			count++;			
		}		
	}
}
