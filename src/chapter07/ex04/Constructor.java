package chapter07.ex04;

//생성자 오버로딩 : 생성자 호출시 시그니처에 따라서 다른 생성자를 호출
	//시그니쳐 (매개변수의 갯수, 데이터 타입)

class Ab{
	//필드 : 인스턴스 필드 : 객체를 생성후 호출
	int m;
	int n;
	int l;
	
	//생성자 : 
	Ab(){
		System.out.println("매개변수 정수 0개인 생성자 " +m+" "+n+" "+l);
	}
	Ab(int m ){			//매개변수 정수 1개
		this.m = m;
		System.out.println("매개변수 정수 1개인 생성자 " +m+" "+n+" "+l);
	}
	Ab(int m ,int n){			//매개변수 정수 2개
		this.m = m;
		this.n = n;
		System.out.println("매개변수 정수 2개인 생성자 " +m+" "+n+" "+l);
	}
	
	Ab(int m ,int n,int l){			//매개변수 정수 3개
		this.m = m;
		this.n = n;
		this.l = l;
		System.out.println("매개변수 정수 3개인 생성자 " +m+" "+n+" "+l);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		// 1. 기본 생성자 호출
		
		Ab ab1 = new Ab();
		
		// 2. 매개변수 1개인 생성자 호출
		
		Ab ab2 = new Ab(5);
				
		// 2. 매개변수 2개인 생성자 호출
				
		Ab ab3 = new Ab(5,6);
		
		// 2. 매개변수 3개인 생성자 호출
		
		Ab ab4 = new Ab(5,6,7);

	}

}
