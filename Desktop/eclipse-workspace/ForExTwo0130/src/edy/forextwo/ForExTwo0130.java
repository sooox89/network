package edy.forextwo;

public class ForExTwo0130 {

	public static void main(String[] args) {
	//아래 for문은 무한반복문
	//for ( ; ; )
	//	System.out.println("book");
	int num[] = {1,2,3};
	for (int k : num)
		System.out.printf("k=%n",k);
	for(int i = 0;i<=2 ; ++i)
		System.out.printf("num[%d]=%d\n",i, num[i]);
		
//	System.out.printf("num[0]=%d\n", num[0]);
//	System.out.printf("num[1]=%d\n", num[1]);
//	System.out.printf("num[2]=%d\n", num[2]);
		
			 

	}

}
