package edu.lottohw;

import java.util.Scanner;

public class LottoHw0130 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[6];// 배열 생성
		for(int i =0; i<=5; i++)
			{
			System.out.print("로또번호 입력 : ");
			intArray[i] = sc.nextInt();
			for(int a=0; a<=i-1 ; a++) {
				if(intArray[a]==intArray[i]) {
					System.out.println("같은번호가 있습니다");
					--i;
					break;
					//continue;
				}
			}//end of 안쪽 for
			
			}
//		System.out.printf("입력번호 : %d	%d	%d	%d	%d	%d", 
//				intArray[0],intArray[1],intArray[2],
//				intArray[3],intArray[4],intArray[5]);
		
		System.out.print("입력번호 :");
		
		   for (int k = 0;  k<=6 ; k++)  {
			   System.out.printf("\t%d", intArray[k]);
	            
		    }
		
		
	}
}





	


