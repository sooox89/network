package edu.polymor;

abstract class Mammal  // 추상 클래스 
{
	abstract public void moving();   // 선언문이 됨 {}중괄호 없앰   // 추상 메서드 : 중개인 역할만 해줌
	
	public Mammal()
	{	System.out.println("난 Mammal 기본 생성자");	}
	public void talk() {	}	
	public void show() {	System.out.println("난 Mammal의 show()메서드");}

}// end of class Mammal

class Person extends Mammal     
{ // 초기값 넣기 
	protected final int IQ = 140 ; // 상속할 때 protected로 member 바꿔줘야함 private 안됨 !    // final int 변경 불가
	protected String name = null ;   //encapsulation 캡슐화  //sub class에서도 쓰지 못함 : private 접근권한지정자 때문 
	protected int age = 0 ;
	
	static char blood = 'A';

	public static void display() 
	{
		System.out.printf("blood=%c\n", blood);
//		System.out.printf("display() 메서드안 name=%s\n ", name);    error
	}
		 
	public Person()  // 기본 생성자(default Constructor)..매개변수 parameter가 없
	{
		System.out.println("난 Person 기본 생성자");
		name =null ;
		age = 0 ;
	} 
	public Person(String pname, int page)  // person 생성자 overloading 
	{
		super();           //mammal();
		System.out.println("난 매개변수 두 개인 Person 생성자");
		this.name = pname ; 
		this.age = page; 
	}
	
	public void setAge(int age)
	{ this.age = age ;}   // age = page 가 아닌 age = age할 경우 page = 0이 됨 / 속성이 변수에 영향을 못미침
	
	public int getAge()
	{return this.age;}
	
	public void setName(String pname) //외부에서 name 멤버 변수에 간접적으로 접근할 수 있는 메서드 생성
	{ name = pname; }
	
	public 	String getName()        
	{ return this.name ; }
	
	public void talk()   //class안의 member함수 : method
	{ 
//		name = "아무개";
		System.out.println("talk()메서드이다.");	}
	
	public void talk(String shouting)  // method overloading 
	{
		System.out.printf("shouting=%s\n" , shouting);
	}
	
	public void talk(String shouting, int page) {
		System.out.printf("shouting=%s\n" , shouting);
		System.out.printf("page=%d\n" , page); }
	
	public void talk(int page , String shouting) {
		System.out.printf("page=%d\n" , page);
		System.out.printf("shouting=%s\n" , shouting);}
	
	public void breathe()   
	// public으로 공개해서 상호작용할 수 있게 //talk, breathe 공개된 인터페이스
	{ age = 1 ;}
	public void show()
	{
		super.show();
		System.out.printf("name=%s, age=%d\n", this.name, age); 
		System.out.println("난 Person의 show()메서드");
	}
	
	public void moving()
	{
		System.out.println("Person이 움직인다");
	}
} // end of class Person 

class Man extends Person  // person클래스와 상속 관계 ! 
{
	final int IQ = 150;   // 부모 클래스에서 IQ fianl int 되어있어서 바꿀 수 없음, IQ 다시 설정 
	private int money ;
	private String job;
	
	public void setJob(String job)
	{ this.job = job;}
	public String getJob()
	{ return job ;}
	
	public Man()
	{
		super();
		System.out.println("난 Man의 기본생성자");}
	
	public Man(String name,int age, int money, String job)  // parameter 4개인 man 생성자 만들었음
	{
//	 super();            // Person의 생성자 중 기본 생성자 = Person() 선택해서 호출하겠다 !
	 super(name, age);   // Person의 생성자 중 parameter 2개인 생성자 선택해서 호출하겠다!
	 System.out.println("난 인자 4개인 Man 생성자");  
	 
//	 this.name = name ;  // super() > Person()생성자 안의 코드와 중복되어서 주석처리함 
//	 this.age = age; 
	 this.money = money ; 
	 this.job = job ;
	}
	
	public void show()  //부모의 person 클래스의 이름 출력 
	{	
		super.show();    // super는 1차부모만 가르킴
		System.out.printf("Person의 IQ=%d\n",super.IQ); 
		System.out.printf("Man의 IQ=%d\n", this.IQ);  // IQ = 150이라고 나옴 > Man 클래스에 있기 때문   
//		System.out.printf("name=%s, age=%d\n", this.name, age);  //부모의 person 클래스의 이름 출력하기 위해 private 접근지정권한자 때문에 error > protected 접근권한지정자로 바꿔
		System.out.printf("money=%d, job=%s\n", money, job);	
		System.out.println("난 Man의 show()메서드");
	}
	
	public void work()
	{	System.out.println("Man이 일한다.");	}
	
	public void moving()
	{
		System.out.println("Man이 움직인다");
	}
} // end of class Man





public class Polymor0201 {

	public static void main(String[] args) {
		
//		Man jaesuk =                             // Man 타입으로 할땐 talk(), show() 모두 호출 가
		Mammal jaesuk =                          // Person 타입으로 할땐 talk()는 person class method이기 때문에 가능 show()는 man class method 이라 불가
//		Person jaesuk=		 
		new Man("유재석",51,
						700000,"국민MC");         //jaesuk 객체 Man 클래스 타입으로 간주
		jaesuk.talk();                          
		jaesuk.show();                           //jaesuk 객체엔 show() 2개 : person 아닌 man class show()실행됨 ..   > man class show 메서드 주석처리 > person show() 실행됨 
		jaesuk.moving();
	}

}
