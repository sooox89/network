package edu.inheri;

	import java.util.Scanner;

	class Car{
		protected int num = 0;
		protected int vel = 0;
		protected String name =null ;
		protected String color = null;
		protected String add = null;
		
		public void setNum(int mynum)
		{num = mynum;}
		public void setName(String myname) 
		{name = myname;}
		public void setColor(String mycolor) 
		{color = mycolor;}
		public void setVel(int myvel) 
		{vel = myvel;}
		public void setAdd(String myadd) 
		{add = myadd;}
		public Car()
		{	}
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

	} // end of class Car

	class LentCar extends Car
	{
		private int fare; // 렌트 요금 관련 변수 
		private String comp; // 렌터카 업체(회사)명과 관련된 변수 
		public LentCar()
		{	}
		public void setFare(int myfare)
		{fare = myfare ;}
		
		public void setComp(String mycomp)
		{comp = mycomp;}
		
		public int getFare()
		{return fare;}
		
		public String getComp()
		{return comp;}
		
	}


	public class InheriHw0131 {

		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int mynum =0;
		int myvel =0;
		int myfare = 0;
		String myname = null;
		String mycolor =null;
		String myadd = null;
		String mycomp =null ;
		int upvel =0;
		int downvel =0;
		
		
		
		System.out.print("자동차종류 입력하시오 : ");
		myname = sc.nextLine();
		System.out.print("자동차색깔 입력하시오 : ");
		mycolor =sc.nextLine();
		System.out.print("자동차번호 입력하시오 : ");
		mynum =sc.nextInt();
		sc.nextLine();
		System.out.print("운전자주소 입력하시오 : ");
		myadd =sc.nextLine();
		System.out.print("자동차속도 입력하시오 : ");
		myvel =sc.nextInt();
		sc.nextLine();
		System.out.print("렌트비를 입력하시오 : ");
		myfare =sc.nextInt();
		sc.nextLine();
		System.out.print("렌트회사를 입력하시오 : ");
		mycomp =sc.nextLine();
		
		
		LentCar lentcar = new LentCar();
		
		
		lentcar.setAdd(myadd);
		lentcar.setColor(mycolor);
		lentcar.setName(myname);
		lentcar.setNum(mynum);
		lentcar.setVel(myvel);
		lentcar.setComp(mycomp);
		lentcar.setFare(myfare);
		
		
		System.out.printf("자동차종류 : %s\n",lentcar.getName());
		System.out.printf("자동차색깔 : %s\n",lentcar.getColor());
		System.out.printf("자동차번호 : %d\n",lentcar.getNum());
		System.out.printf("운전자주소 : %s\n",lentcar.getAdd());
		System.out.printf("현재 자동차의 속도는 시속 %d 입니다.\n",lentcar.getVel());
		System.out.printf("렌트요금 : %d\n",lentcar.getFare());
		System.out.printf("렌트회사명 :%s\n",lentcar.getComp());
		System.out.print("속도를 얼마나 올리시겠습니까 : ");
		upvel =sc.nextInt();
		sc.nextLine();
		System.out.printf("현재 자동차의 속도는 시속 %d 입니다.\n",lentcar.getVel()+upvel);
		System.out.print("속도를 얼마나 내시겠습니까 : ");
		downvel =sc.nextInt();
		sc.nextLine();
		System.out.printf("현재 자동차의 속도는 시속 %d 입니다.\n",lentcar.getVel()+upvel-downvel);
		
		


		}

	}
