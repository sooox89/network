package edu.gugudanhw;

public class GugudanHw {



	public static void main(String[] args) {
		int dan = 2, val = 1 ;
		for( val = 1; val <= 9; ++val)
			{
			System.out.println();
			for( dan = 2; dan <=5; ++dan)
				System.out.printf("%d * %d = %d\t", dan, val, dan*val);
		
			}
		
		System.out.println("\n");
		
		for( val = 1; val <= 9; ++val)
			{
			System.out.println();
			for( dan = 6; dan <=9; ++dan)
				System.out.printf("%d * %d = %d\t", dan, val, dan*val);
		
			}
		
	}

}
