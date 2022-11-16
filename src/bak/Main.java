package bak;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] arr1 = new double[a];
		
		for(int i =0; i<a; i++) {
			arr1[i] = sc.nextDouble();
			
			double sum=0, avg1=0, comp1=0, comp2=0;
			double[] arr2 = new double[(int) arr1[i]];
			for(int j=0; j<arr2.length; j++) {
				arr2[j] = sc.nextDouble();		
				sum = sum+arr2[j];				//평균을 위한 덧셈 구하기
				if(comp1 < arr2[j]) {			//열 중에 최댓값 구하기
					comp1 = arr2[j];
				}
			}
			avg1 = sum / arr1[i];			//평균 구하기
			
			for(int j=0;j<arr2.length; j++) {	//평균보다 큰 갯수 구하기
				if(arr2[j] > avg1) {
					comp2++;
				}				
			}
			
			arr1[i] = arr1[i]/comp2;     //처음 배열에 비율(평균보다 큰 학생수 / 전체 학생수) 넣기
		
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.println(String.format("%.2f", arr1[i]+"%"));
		}
		
		
	}
}
