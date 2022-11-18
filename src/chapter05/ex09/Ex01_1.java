package chapter05.ex09;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		double average;
		
		//배열 선언 및 초기화
		String [][]arr=new String [10][10];
		int idx=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=args[idx];
				idx++;
			}
		}
		
		
		
		//이름별 합계 & 평균값 구하기
		for(int i=0;i<4;i++) {
			sum=0;
			for(int j=1;j<5;j++) {
				sum+=Integer.parseInt(arr[i][j]); //이름 별 합계 구하기
				
			}
			arr[i][5]=String.valueOf(sum); //이름 별 합계 저장
			arr[i][6] = String.valueOf(Double.parseDouble(arr[i][5])/4.0); //이름 별 평균 저장
		}
	
		
		
		//과목별 합계 & 평균값 구하기
		for(int x=1;x<5;x++) {
			sum=0;
			for(int y=0;y<4;y++) {					
				sum+=Integer.parseInt(arr[y][x]); //이름 별 합계 구하기
				
			}
			arr[4][x]= String.valueOf(sum); //이름 별 합계 저장
			arr[5][x] = String.valueOf(Double.parseDouble(arr[4][x])/4.0); //이름 별 평균 저장
		}
		
		
		
		//출력
		System.out.println("          국어     영어     수학      과학     <합계>     <평균>");
		System.out.println("========================================================");
		for(int i=0;i<4;i++) {
			for(int j=0;j<7;j++) {
				System.out.printf("%s      ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("========================================================");
		System.out.printf("<합계>     %s     %s     %s     %s\n",arr[4][1],arr[4][2],arr[4][3],arr[4][4]);
		System.out.printf("<평균>    %s    %s    %s   %s",arr[5][1],arr[5][2],arr[5][3],arr[5][4]);

	}

}
