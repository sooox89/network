package edu.profinheri;

class  Person
{
	protected final int IQ  = 140 ;
	protected String  name = null ;
	protected int  age = 0 ;
	
	static char blood = 'A' ;
	
	public static void display()
	{
		System.out.printf("blood=%c\n", blood);
//		System.out.printf(
//		  "display()메서드안 name=%s\n", 
//		  					name);//error
	}
	

	//기본생성자(default Constructor)..매개변수가 없음	
	public  Person()
	{	
		System.out.println("난 Person기본생성자");
		name  = null ;
		age = 0;
	} 
	
	public Person(String name , int  age)
	{
		System.out.println(
			"난 매개변수 두개인 Person 생성자");
		this.name = name ;
		this.age = age;
	}
	
	public void setAge(int  age)
	{
		this.age = age; 
	}
	public int getAge()
	{  return this.age;  }
	
	public void setName(String  pname)
	{	name = pname ;	}
	
	public String getName()
	{ return  name ;  }
	
	public 	void  talk()
	{
		name= "아무개";
		System.out.println("talk()메서드이다.");
	}
	public void talk(String shouting)
	{
		System.out.printf("shouting=%s\n",
								shouting);
	}

	public void talk(String shouting , 
						int page)
	{
		System.out.printf("shouting=%s\n",
								shouting);
		System.out.printf("page=%d\n", page);
	}
	
	public void talk(int page, String shouting)
	{
		System.out.printf("page=%d\n", page);
		System.out.printf("shouting=%s\n",
							shouting);		
	}
	
	public void breathe()
	{ age = 1 ; }
}//end of class Person

class Man extends Person
{
	private int money ;
	private  String  job ;
	
	public Man()
	{ System.out.println("난 Man의 기본생성자"); }
	
	public void show()
	{
		System.out.printf("name=%s\n" ,
							 name);
		System.out.printf("money=%d\n", 
							  money);
	}
	
	public void work()
	{ System.out.println("Man 이 일한다.");  }
}

public class ProfInheri0131  {
	public static void main(String[] args) {
		
		Person  chulsu = new Person() ;
		chulsu.name= "철수";
		System.out.printf("chulsu.name=%s\n",
						 	chulsu.name );
		
		Man wonbin = new Man() ;
		wonbin.setName("원빈");
		wonbin.work() ;
		System.out.printf("wonbin.name=%s\n",
					wonbin.getName() );
	}

}
