package chapter05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
		System.out.println("====================================================");
		String[] name = new String[4];
		double[][] score = new double[4][2];
		double[] totalSum = new double[6];
		
		for(int i=0,j=0; i<name.length;i++,j+=5) {
			name[i]=args[j];
		}
		
		for(int i= 1,s=0; i<args.length+1;i++) {
			System.out.print(args[i-1]+"\t");
			if(i!=0 && i%5==0) {
				double sum=0;
				
					
				sum += Double.parseDouble(args[i-1]);
				sum += Double.parseDouble(args[i-2]);	
				sum += Double.parseDouble(args[i-3]);	
				sum += Double.parseDouble(args[i-4]);	
				
				double avg = sum/4;
				score[s][0]=sum;
				score[s][1]=avg;
				s++;
				System.out.print(sum+"\t"+avg);
				
				System.out.println();
			}
		}
		System.out.println("====================================================");
		
		int t=0;
		for(int i = 1; i<20;i++) {
			if(i%5!=0) {
				totalSum[t] += Double.parseDouble(args[i]);
			}else{
				t++;
			}
			
		}
		for(int i =0;i<4;i++) {
			totalSum[4] += score[i][0];
			totalSum[5] += score[i][1];
		}
		System.out.print("\t");
		for(int i =0; i<totalSum.length;i++) {
			System.out.print(totalSum[i]+"\t");
		}
		System.out.println();
		System.out.print("\t");
		for(int i =0;i<totalSum.length;i++) {
			System.out.print(totalSum[i]/4+"\t");
		}
			
		
	}

}
