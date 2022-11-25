package chapter11.ex02;

class Student{
	//필드
	String name;
	
	//합계와 평균을 출력하는 메소드
	void sum_avg() {
		
	}
	
}

class Student_Sub extends Student{
	//자식 필드
	int kor;	//국어점수
	int eng;	//영어점수
	int math;	//수학점수
	
	Student_Sub(String name, int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		
	}
	
	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math 의 합계와 평균을 출력하는 메소드
	@Override
	void sum_avg() {
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3;
		System.out.printf("%s 의 합계 : %d , 평균 : %f\n\n",name,sum,avg);
		
	}

	@Override
	public String toString() {
		return name +" [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 5명의 점수를 인풋한다
		/*
		 * 생성자를 사용해서 객체 생성시 필드의 값을 할당하고
		 * 
		 * 홍길동 70 88 77
		 * 이순신 80 68 87
		 * 김똘똘 60 86 87
		 * 가나다 50 60 79
		 * 라마사 56 87 97
		 * 
		 * Student 배열변수 arr 변수에 모든 객체를 저장해서
		 * 배열의 값을 for 문으로 출력할때
		 * 		오버라이딩된 메소드 출력 	< 그 학생의 국어, 영어, 수학의 합계, 평균 >
		 * 		5명의 학생의 국어에 대한 합계, 평균 getter-다운 캐스팅
		 * 		5명의 학생의 영어에 대한 합계, 평균
		 * 		5명의 학생의 수학에 대한 합계, 평균
		 */
		
		
		Student s1 = new Student_Sub("홍길동",70,80,77);
		Student s2 = new Student_Sub("이순신",80,68,87);
		Student s3 = new Student_Sub("김똘똘",60,86,87);
		Student s4 = new Student_Sub("가나다",50,60,79);
		Student s5 = new Student_Sub("라마사",56,87,97);
		
		Student[] arr1 = new Student[] {s1,s2,s3,s4,s5};
		
		for(int i =0; i<arr1.length;i++) {		//for 문으로 출력
			System.out.println(arr1[i]);
			arr1[i].sum_avg();
		
		}
		
		//5명의 학생의 국어에 대한 합계와 평균
		Student_Sub a1 = (Student_Sub) s1; 
		Student_Sub a2 = (Student_Sub) s2;
		Student_Sub a3 = (Student_Sub) s3;
		Student_Sub a4 = (Student_Sub) s4;
		Student_Sub a5 = (Student_Sub) s5;
		
		Student_Sub[] arr2 = new Student_Sub[] {a1,a2,a3,a4,a5};
		
		int kor=0;
		int eng=0;
		int math=0;
		
		for(int i = 0;i<arr2.length;i++) {
			
			kor += arr2[i].kor;
			eng += arr2[i].eng;
			math += arr2[i].math;
			
		}
		System.out.println("5명의 학생의 국어의 합계는 " + kor +" 평균은 " + (double)kor/5);
		System.out.println("5명의 학생의 영어의 합계는 " + eng +" 평균은 " + (double)eng/5);
		System.out.println("5명의 학생의 수학의 합계는 " + math +" 평균은 " + (double)math/5);
		

		
		
		

	}

}
