import java.util.Scanner;

import sun.nio.ch.sctp.SctpServerChannelImpl;

public class 석차구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] jumsu=new int[5];
		int[] rank=new int[5];
		//점수내기
		for(int i=0; i<5; i++){
			System.out.print((i+1)+"번째 학생의 점수 : ");
			jumsu[i]=scan.nextInt();
			rank[i]=1;	
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(jumsu[i]<jumsu[j]){
					rank[i]=rank[i]+1;	
				}
				else{
					
				}
			}
		}
		System.out.println();
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번째 학생의 점수 : "+jumsu[i]+"\t"+(i+1)+"번째 학생의 석차는 : "+rank[i]);
		}
	}

}
