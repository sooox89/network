package edu.primenum;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int i,j,count = 0, sum =0;
	
	for(i=2; i<=number ; ++i)
	{
		for (j=1; j == i ; ++j)
		{
			if (i%j == 0)
				++count;
		}
		if(count ==1)
		{
			System.out.printf("%d은(는) 소수이다.\n" , i);
			++sum ;
		}
		count = 0 ;
		
		
	
	}
	}
	
	}


