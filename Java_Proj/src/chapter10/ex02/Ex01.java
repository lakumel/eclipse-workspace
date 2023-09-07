package chapter10.ex02;
//상속, 캐스팅

class Customer{		//부모클래스:고객의 정보를 담은 클래스
	String name; 	//고객 이름
	long customerID; 	//고객의 아이디
	int customerPoint;	//기본포인트

	void CustomInfo() {
		System.out.println("고객 이름 : " +name +" , 고객 ID :" + customerID + " , 고객 포인트 : " + customerPoint);
	}
}

//자식 클래스 : GoldMember, silverMember, bronzeMember	<==int goldPoint 기본포인트 10점, 실버 :5점, 브론즈 :3점, 메소드 goldInfo()골드회원입니다.

class GoldMember extends Customer{
	int goldPoint;
	void goldInfo() {
		System.out.println("고객 이름 : " +name +" , 고객 ID :" + customerID + " , 고객 포인트 : " + goldPoint);
	}
}
class SilverMember extends Customer{
	int silverPoint;
	void silverInfo() {
		System.out.println("고객 이름 : " +name +" , 고객 ID :" + customerID + " , 고객 포인트 : " + silverPoint);
	}
}
class BronzeMember extends Customer{
	int bronzePoint;
	void bronzeInfo() {
		System.out.println("고객 이름 : " +name +" , 고객 ID :" + customerID + " , 고객 포인트 : " + bronzePoint);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//각 객체를 생성해서 부모클래스의 필드와 메소드 접근 가능한지 확인후
		//업캐스팅 <===>다운캐스팅
		
		//1.customer
		Customer c1 = new Customer();
		//c1 =customer

		//2.goldmember
		GoldMember g1 = new GoldMember();
				//g1 = goldmember/customer 타입을 모두 가지고 있다.
		g1.name = "골드 맴버";			//customer
		g1.customerID = 1111;		//customer
		g1.goldPoint =10;			//goldmember 클래스의 필드
		
		//3.silvermember
		SilverMember s1 = new SilverMember();
		s1.name = "실버 맴버";
		s1.customerID = 2222;
		s1.silverPoint =5;
		
		//4.bronzemember
		BronzeMember b1 = new BronzeMember();
		b1.name = "브론즈 맴버";
		b1.customerID = 3333;
		b1.bronzePoint =3;
		
		System.out.println("=======================================");
		
		//만들어진 객체를 각 배열에 저장을 한다.
		//c1(customer), g1(goldmember/customer), s1(silvermember/customer), b1(bronzemember/customer)을 
		//customer 타입으로 배열에 저장
		
		//객체를 배열 arr에 넣음 : upcasting 됨
		//배열 arr에 저장된 모든 객체는 customer 타입을 내포하고 있고 customer타입으로 upcasting되어서 들어간다.
		//배열 arr에 들어가 있는 객체는 customer 타입이다.
		Customer[] arr = new Customer[] {c1, g1, s1, b1};
		
		//배열에 저장된 객체를 가지고 온다.
		Customer cc1 = arr[0];		//Customer->다운캐스팅이 어렵다.
		Customer cc2 = arr[1];		//customer/goldmember
		Customer cc3 = arr[2];		//customer/silvermember
		Customer cc4 = arr[3];		//customer/bronzemember
		
		//객체화
		cc1.CustomInfo();


		//다운 캐스팅
		GoldMember gg1 =(GoldMember)cc2;	//customer
		gg1.goldInfo();
		
		SilverMember ss1 =(SilverMember)cc3;
		ss1.silverInfo();
		
		BronzeMember bb1 =(BronzeMember)cc4;
		bb1.bronzeInfo();
		
		
		System.out.println("==============================================");
		
		//객세 생성시 타입을 지정
		
		//1.customer 객체 생성시 타입 지정
		Customer cus1 = new Customer();
		
		//2.GoldMember 객체 생성시 타입 지정 : customer
		Customer cus2 = new GoldMember();
			//cus2 : goldmember, customer 를 내포하고 있고 customer로 지정이 되어 있다.
		cus2.name = "고객 이름";		//customer만 접근이 된다.
		GoldMember gm1 = (GoldMember)cus2; //- 다운 캐스팅
		gm1.goldPoint = 10;
		gm1.goldInfo();
		
		//2.GoldMember 객체 생성시 타입을 GoldMember로 지정/GoldMember/customer 모두 접근 가능
		GoldMember gm2 = new GoldMember();
		
		//3.SilverMember 객체화 하면서 Custome 타입으로 지정
		Customer cus3 = new SilverMember();		//cus3은 실버타입도 가지고 있고 커머터머 타입도 가지고 있다.
												//cus3 : SilverMember/ Customer 모두 가지고 있고 customer 로 타입이 지정
		
		SilverMember sil1 = (SilverMember)cus3;
		
		//4.silverMember를 객체화 하면서 silvermember 타입으로 지정 : 
		SilverMember sil3 = new SilverMember();		
			//sil3 : SilverMember /Customer
		
		
		System.out.println("=========================================");
		
		Customer ccc1 = new GoldMember();			//ccc1 : GoldMember/Customer
		Customer ccc2 = new SilverMember();			//ccc2 : SilverMember/Customer 
		Customer ccc3 = new BronzeMember();			//ccc3 : BronzeMember/Customer
		
		//자식 클래스를 부모 타입으로 객체화 해서 배열에 저장
		Customer [] arr2 = new Customer[] {ccc1, ccc2, ccc3};
		
		//각 배열에 방의 값을 끄집어 내면서 다운캐스팅
		GoldMember gm11 = (GoldMember)arr2[0];
		SilverMember sil11 = (SilverMember)arr2[1];
		BronzeMember bro11 = (BronzeMember)arr2[2];
	}

}
