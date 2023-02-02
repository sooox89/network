package edu.carhw;

import java.util.Scanner;

class Car{
	private int num = 0;
	private int vel = 0;
	private String name =null ;
	private String color = null;
	private String add = null;
	
//	public void setNum(int mynum) 
//	{num = mynum;	}
//	public void setName(String myname) 
//	{name = myname;}
//	public void setColor(String mycolor) 
//	{color = mycolor;}
//	public void setVel(int myvel) 
//	{vel = myvel;}
//	public void setAdd(String myadd) 
//	{add = myadd;}
//	
//	public void getNum() 
//	{return mynum;}
//	public void getName() 
//	{return myname ;}
//	public void getColor()
//	{return mycolor;}
//	public void getVel()
//	{return myvel;}
//	public void getAdd()
//	{return myadd;}
	
	public Car(String myname,String mycolor,int mynum,String myadd,int myvel)
	{
		num = mynum;
		name = myname;
		color = mycolor;
		vel = myvel;
		add = myadd;
	}
	
	public int getNum()
	{return num;}
	public int getVel()
	{return vel;}
	public String getName()
	{return name;}
	public String getColor()
	{return color;}
	public String getAdd()
	{return add;}
	
	
	
}


public class CarHw0130 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int mynum =0;
	int myvel =0;
	String myname = null;
	String mycolor =null;
	String myadd = null;
	System.out.print("차 이름을 입력하시오. : ");
	myname = sc.nextLine();
	System.out.print("차 색을 입력하시오. : ");
	mycolor =sc.nextLine();
	System.out.print("차량 번호를 입력하시오. : ");
	mynum =sc.nextInt();
	sc.nextLine();
	System.out.print("운전자 주소를 입력하시오. : ");
	myadd = sc.nextLine();
	System.out.print("속도를 입력하시오. : ");
	myvel =sc.nextInt();
	sc.nextLine();
	
	Car mycar = new Car(myname,mycolor,mynum,myadd,myvel);
	System.out.println();
	System.out.printf("차 이름을 입력하시오. : %s\n",mycar.getName());
	System.out.printf("차 색을 입력하시오. : %s\n",mycar.getColor());
	System.out.printf("차량 번호를 입력하시오. : %d\n",mycar.getNum());
	System.out.printf("운전자 주소를 입력하시오. : %s\n",mycar.getAdd());
	System.out.printf("속도를 입력하시오. : %d\n",mycar.getVel());

	
	
	}

}
