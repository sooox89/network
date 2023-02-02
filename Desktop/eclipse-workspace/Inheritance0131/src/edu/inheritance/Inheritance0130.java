package edu.inheritance;



class Person
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
	
	public void talk(String shouting, int page) {
		System.out.printf("shouting=%s\n" , shouting);
		System.out.printf("page=%d\n" , page); }
	
	public void talk(int page , String shouting) {
		System.out.printf("page=%d\n" , page);
		System.out.printf("shouting=%s\n" , shouting);}
	
	public void breathe()   
	// public으로 공개해서 상호작용할 수 있게 //talk, breathe 공개된 인터페이스
	{ age = 1 ;}
	
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
		System.out.printf("Person의 IQ=%d\n",super.IQ); 
		System.out.printf("Man의 IQ=%d\n", this.IQ);  // IQ = 150이라고 나옴 > Man 클래스에 있기 때문   
		System.out.printf("name=%s, age=%d\n", this.name, age);  //부모의 person 클래스의 이름 출력하기 위해 private 접근지정권한자 때문에 error > protected 접근권한지정자로 바꿔
		System.out.printf("money=%d, job=%s\n", money, job);	
	}
	
	public void work()
	{	System.out.println("Man이 일한다.");	}
}
	
public class Inheritance0130 {

	public static void main(String[] args) {
		Person sooo = new Person();
		sooo.name = "수경" ;
		System.out.printf("sooo.name=%s\n" , sooo.name);
		
		Man wonbin = new Man();             // 부모의 person클래스가 먼저 복사되어서 난 Person 기본 생성자 먼저 실행됨 > 그 후에 Man 복사되어서 Man 의 기본 생성자 실행
		wonbin.setName("원빈");              // 원빈객체 타입을 자식클래스의 타입으로 보고 있음
		wonbin.work();  
		System.out.printf("wonbin.name=%s\n", wonbin.getName());     // 실행 순서 : Man 클래스 > get.name() 찾음 > 없어서 Person 클래스 > get.name() method호출하여 사
		                                                             // get.Name() , setName() method는 public 이라서 호출하는데 아무 문제 없음
		
		wonbin.setJob("연예인");
		System.out.printf("wonbin.job=%s\n", wonbin.getJob());
		
		Man jaesuk = new Man("유재석",51,700000,"국민MC");              //jaesuk 객체 Man 클래스 타입으로 간주
		jaesuk.show();
		
		

	}

} 

