package chapter17.ex03;

import java.util.*;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList<>();
		
		//1. add(E element) : List에 값을 추가할때 : ArrayList, Vector, LinkedList
			//마지막 방에 값이 들어간다
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		
		System.out.println(aList1);
		
		//2. add(int index, E element) : 특정 방번호에 값을 넣는다
		aList1.add(1,6);
		
		System.out.println(aList1);
		
		//3. addAll(다른 리스트객체) : 다른 컬랙션의 모든 내용을 합해서 출력
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);
		aList2.add(2);
		System.out.println(aList2);
		
		aList2.addAll(aList1);		//aList2에 뒤에 aList1을 삽입한다
		System.out.println(aList2);
		
		//4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);
		
		System.out.println(aList3);
		aList3.addAll(1, aList3);	//1번(index) 에 aList3(객체)가 들어간다
		System.out.println(aList3);
		
		//5. set(int index, E element) : 기존의 방의 값을 수정
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println(aList3);
		
		//6. remove(int index) : 특정 방번호의 값을 삭제
		aList3.remove(1);
		System.out.println(aList3);
		
		//7. remove(Object o) : 방의 들어간 값으로 삭제
		aList3.remove(new Integer(2));	//오류는 아니고 경고, 앞으로 없어질 내용이다
		System.out.println(aList3);
		
		//8. clear() : 모든 값을 삭제
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : 값이 없으면 : true, 값이 존재하면 : false
		System.out.println(aList3.isEmpty());
		
		//10. size() : 방의 갯수
		System.out.println(aList3.size());
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3.size());
		
		//11. get(int index) : 방번호의 값을 가지고 올때
		System.out.println("0번째 : " +aList3.get(0));
		System.out.println("1번째 : " +aList3.get(1));
		System.out.println("2번째 : " +aList3.get(2));
		
		//12. toArrays() : List의 값을 배열로 변환해준다
		Object[] obj = aList3.toArray();
		
		//배열의 값을 출력 : Arrays.toString()
		System.out.println(Arrays.toString(obj));
		
		//13. toArray(T[] t) --> T[] : 리스트 ==> 배열
		Integer[] int1 = aList3.toArray(new Integer[0]);	
			//0의 의미 : 변환할 배열의 방의 갯수, 컬랙션의 배열 방보다 작게 설정된 경우 컬랙션에 저장된 것에 맞추어서 처리됨
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(int2));
		

	}

}
