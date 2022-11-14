package chapter04.ex08;

public class Continue_Control_Statement {

	public static void main(String[] args) {
		// continue : 제어문 내에서 사용되는 break와 비슷하게 사용되는 키워드
		// 	--	반복문 내에서 continue 를 만나면 
		//			continue 아래 실행 블락을 실행하지 않고 증감식으로 이동
		
		for(int i =0; i<10; i++) {
			continue;
			//System.out.println(); 
			// continue 아래 실행블럭이 있으면 실행되지 않기에 오류가 나온다
		}
		
		for(int i = 0; i<10;i++) {
			System.out.println(i + " ");
			continue;
		}
		System.out.println("================");
		//continue 도 if 조건과 같이 일반적으로 사용됨.
		
		for(int i =0; i<10;i++) {
			if(i == 5) {
				continue;
			} 		//5빼고 나옴
			System.out.println(i + " ");
		}
		
		//2. 다중 loop 문에서 continue
			//2-1 단일 단게만 적용
		for(int i = 0; i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}
		System.out.println("================");
		
		//2-2 점프해서 이동(Lable을 사용)
		pos2 : for(int i =0; i<5;i++) {
			for(int j =0;j<5;j++) {
				if(j==2) {
					continue pos2;
				}
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}

	}

}
