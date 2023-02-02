package edu.oopfirst;

import java.util.Scanner;

class Person
{ // 초기값 넣기 
	private final int IQ = 140 ;
	private String name = null ;   //encapsulation 캡슐화 
	private int age = 0 ;
	
	static char blood = 'A';

	public static void display() 
	{
//		System.out.printf("blood=%c\n", blood);
//		System.out.printf("display() 메서드안 name=%s\n ", name);
	}
		
 
	public Person()  // 기본 생성자(default Constructor)..매개변수 parameter가 없
	{
		System.out.println("난 Person 기본 생성자");
		name =null ;
		age = 0 ;
	} 
	public Person(String pname, int page)  // person 생성자 overloading 
	{
		System.out.println("난 매개변수 두 개인 Person 생성자");
		this.name = pname ; // 호동객체?or길동객체? : 여기서 name은 호동변수에서 호출된 name
		this.age = page;
		 
	}
	

	public void setAge(int age)
	{ this.age = age ;}   // age = page 가 아닌 age = age할 경우 page = 0이 됨 / 속성이 변수에 영향을 못미
	
	public int getAge()
	{return this.age;}
	
	public void setName(String pname) //외부에서 name 멤버 변수에 간접적으로 접근할 수 있는 메서드 생성
	{ name = pname; }
	
	public 	String getName()        
	{ return this.name ; }
	
	public void talk()   //class안의 member함수 : method
	{
		name = "아무개";
		System.out.println("talk()메서드이다.");	}
	
	public void talk(String shouting)  // method overloading
	{
		System.out.printf("shouting=%s\n" , shouting);
	}
	
	public void talk(String shouting, int page)
	{
		System.out.printf("shouting=%s\n" , shouting);
		System.out.printf("page=%d\n" , page);
	}
	
	public void talk(int page , String shouting)
	{
	
		System.out.printf("page=%d\n" , page);
		System.out.printf("shouting=%s\n" , shouting);
	}
	
	
	public void breathe()   
	// public으로 공개해서 상호작용할 수 있게 //talk, breathe 공개된 인터페이스
	{ age = 1 ;}
	
}

public class OOPExOne0130 {

	public static void main(String[] args) {
		
		  int val [] = new int[] {10,20,30};
		  val[0] = 10 ; val[1] = 20; val[2] = 30;
		
		  for(int i=0 ; i <= 2 ; ++i)
			  System.out.printf("val[%d]=%d\n", i , val[i]);
		  
		  Scanner sc = new Scanner(System.in);
		  String myname = null;
		  int myage = 0;
		  System.out.print("이름 입력하시오.");
		  myname = sc.nextLine();
		  System.out.print("나이 입력하시오.");
		  myage = sc.nextInt();
		  
		  Person hyunbin = new Person(myname, myage);
//		  hyunbin.display();
		  Person.display() ;
		  
		  System.out.printf("hyunbin.name =%s\n", hyunbin.getName());	 
		  System.out.printf("hyunbin.age =%d\n", hyunbin.getAge());	  
				  
		  Person hodong = new Person("호동", 45);    
		  System.out.printf("hodong.name=%s\n" , hodong.getName());
		  System.out.printf("hodong.age=%d\n" , hodong.getAge());
		
		
		  Person gildong = new Person(); // ()를 통해 class 이름과 똑같은 함수 생성 
		  
		  
		  gildong.setName("길동");
		  System.out.printf("gildong.name=%s\n",gildong.getName());

		  gildong.setAge(23);   
		  System.out.printf("gildong.age=%d\n",gildong.getAge());
		  
//		  gildong.name ="길동"; 
//		  System.out.printf("gildong.name=%s\n", gildong.name); 
//		  gildong.age = 23;
//		  System.out.printf("gildong.age=%d\n", gildong.age);
		  gildong.talk();
		  gildong.talk("열공하자");
		  gildong.talk("길동" , gildong.getAge());
		  gildong.talk(24 ,"난 길동");
		  
	}

}

