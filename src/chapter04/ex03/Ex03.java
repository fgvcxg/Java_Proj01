package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		
		for(int i =1;i<10;i++) {
			
			System.out.println(i + "단");
			for(int j =1; j<10;j++) {
			System.out.printf("%d * %d = %d\t",i,j,i*j);
				
			}
			System.out.println();
			System.out.println();
		}

	}

}
