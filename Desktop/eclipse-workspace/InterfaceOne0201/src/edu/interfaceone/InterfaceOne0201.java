package edu.interfaceone;

interface IVehicle
{
	//== int makeYear = 2022;  // 변수가 아닌 상
	// == final int makeYear = 2022;  
	// == public final int makeYear = 2022;
	public static final int makeYear = 2022;
	
	// void start();            //중괄호 없는 추상메서드
	// abstract void start();
	public abstract void start();   
	public abstract void driving();
	
	default public void stop()  //중괄호 뒤에 붙는 메서드 : default,private,static 메서드만 가능
	{System.out.println("정지한다");	}
	
	private void show()
	{System.out.println("makeYear=" + 
						makeYear); }
	
	public static void turn()          //static > 정적 기억 공간에 있어서 k5.turn()실행 안됨
	//IVehicle interface 멤버는 맞
	{System.out.println("방향 전환한다");}
	
	static class Price
	{	int salePercent = 10;	}  // 정적 클래스
	
//	default public void driving()
//	{ }
}


class Carrier
{
	public void fetch()
	{
		System.out.println("승객을 운반하다");
	}
}


class Car extends Carrier implements IVehicle       
{
	@Override
	public void fetch()
	{
		System.out.println("Car가 승객을 탑승시킴");
	}
	
	public void driving()
	{
		System.out.println("Car 타고 드라이빙");
	}
	public Car()
	{	
		System.out.println("나는 Car의 기본 생성자");
	}
	@Override  //annotation 주석(?)
	public void start() {
		System.out.println("Car가 출발한다."); }
	
	@Override
	public void stop()   // Interface의 stop() overriding default 메서드는 클래스에 쓰면 안됨 
	{
		
		System.out.println("차가 정지한다");
	}
	
	
}


interface IZerg
{
	public abstract void display();
	
	default public void zergAttack()
	{
		System.out.println("Zerg 공격개시");
	}
}
interface ITerran
{
	public abstract void terranAttack();
}

interface IProtous
{
	public abstract void protousAttack();
}

interface IGame extends IZerg,ITerran,IProtous   // 다중상속 interface와 interface 간의 상속
{
	public abstract void Goodgame();
}

class StarCraft implements IGame  // class가 interface IGame 상속받음 // implements 구현하
{
	@Override
	public void display() 
	{
		System.out.println("Zerg종족 개수 표시");
	}

	@Override
	public void Goodgame() 
	{
		System.out.println("좋은 게임이었다");
	}

	@Override
	public void terranAttack() 
	{
		System.out.println("terran 공격개시");
	}

	@Override
	public void protousAttack() 
	{
		System.out.println("protous 공격개시");
	}
	
}


public class InterfaceOne0201 {

	public static void main(String[] args) {
	IGame yunel = new StarCraft();
//	StarCraft yunel = new StarCraft();
	yunel.zergAttack();
	yunel.display();
	yunel.Goodgame();
	yunel.terranAttack();
	yunel.protousAttack();
	
	
	System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	IVehicle iob = new IVehicle();  인터페이스 단독으로 객체 생성 불가
//  IVehicle은 Car의 super클래스
//	Car k5 = new Car();   
	IVehicle k5 = new Car();
	
	k5.start();
//	k5.turn();  turn() 정적 기억 공간에 있음 (static)
	IVehicle.turn(); 
	k5.stop();
	k5.driving();  // IVehicle k5 = new Car();일때 실행시키려면 (2가지) 
	// 1. 추상메서드 만들기
	// 2. default public void driving() interface에 생성 > 1번이 더 좋은 방법 ! : default의 중괄호 안은 실행안되기 때문
	// +. 자식을 부모로 보는 방법 upcasting // 부모를 자식으로 보는 방법 downcasting
	//    ((Car)k5).driving();  // Interface에 driving() 없애기 
	

	}

}
