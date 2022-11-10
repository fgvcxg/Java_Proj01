package chapter02.ex7;

import javax.annotation.processing.SupportedSourceVersion;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산  vs 다른 자료형 간의 연산
		
		// 1. 같은 자료형 간의 연산
		int value1 = 3+5; 	//8 int+int
		int value2 = 8/5;	//1	int/int
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f; 
		System.out.println(data1);	
		
		double data2 = 8.0/5.0;
		System.out.println(data2);	//1.6
		
		double data3 = 8/5;			//int/int = int(1)
		System.out.println(data3); 	//1.0 
		
		double data4 = 8/5.0 ;	// 정수인 8이 double 형으로 업캐스팅이 일어나서 연산
		System.out.println(data4);	//1.6
		
		// 주의 : 평균을 계산 할때 double
		
		System.out.println("========================");
		
		// 2. 다른 자료형 간의 연산(작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 = 5+3.5; //오류 발생
		int data5 = 5+(int)3.5; //or int data5 = (int)(5+3.5);
		double data6 = 5 + 3.5;	
		
		int data7 = 5+(int)3.5;
		int data8 = (int) (5 + 3.5);
		
		double data9 = 5/2.0 ;	// 5가 double 형으로 변환된다
		System.out.println(data9);	//2.5
		
		double data10 = 5/2;	// 결과는 정수(int)지만 앞에 double 로 인해 자동으로 업캐스팅 된다
		System.out.println(data10); //2.0
		
		//주의 : 평균을 계산 할때 double
		
		System.out.println("========================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업 캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 + data12); 	//int 와 double 이라 50이 실수형으로 변경된다
		//업 캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 / data12);
		//업 캐스팅 : data12 (double) ==> data12(int)
		System.out.println(data11 / (int)data12);	// int / int
		
		/*
		 * <<문제>>
		 * 국어 : 90 수학 : 88 영어 : 77 음악 : 90 과학 : 99
		 * 각 과목의 점수를 int의 변수를 만들어서 저장 후 : 합계(sum) 평균(avg) 값을 출력
		 */
		
		int korean = 90;
		int math = 88;
		int eng = 77;
		int music = 90;
		int sci = 99;
		
		int sum = korean+math+eng+music+sci;
		double avg = sum / 5.0;
		
		System.out.printf("각 과목의 점수의 합 : %d\n", sum);
		System.out.printf("각 과목의 평균 점수 : %f\n", avg);
	}

}
