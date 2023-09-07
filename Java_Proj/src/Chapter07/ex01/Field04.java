package Chapter07.ex01;

class K {
	
	//기본생성자 : 생략되어 있음. 
	//K(){}   
	
	int a ; 		//인스턴스 필드 	: 객체화 해서 사용, 모든 객체에서 격리되는 필드
	static int b; 	//정적(static) 필드 : 객체화, 클래스이름으로 사용, 모든 객체에서 공유되는 필드 

}

public class Field04 {
	public static void main(String[] args) {
		
		K k1 = new K(); 
		K k2 = new K(); 
		K k3 = new K(); 
		K k4 = new K(); 
		
		// K : 클래스명 / 타입    	<==  붕어틀 
		// k1 : 객체(인스턴스) :  	<=== 붕어빵 
		// new : Heap 영역에 값을 저장해라 
		// K() :  // 기본 생성자 
		
		//인스턴스 필드 
		k1.a = 10 ; 
		k2.a = 20; 
		k3.a = 30; 
		k4.a = 40; 
		
		
		System.out.println(k1.a);    //10
		System.out.println(k2.a);    //20
		System.out.println(k3.a);    //30
		System.out.println(k4.a);    //40
		
		System.out.println("===============================");
		k1.b = 80; 			// static 필드 : b    <== 모든 객체에서 공유되는 필드 
		
		System.out.println(k1.b);
		System.out.println(k2.b);
		System.out.println(k3.b);
		System.out.println(k4.b);
		
		System.out.println("==========================");
		k2.b = 100; 
		System.out.println(k1.b);
		System.out.println(k2.b);
		System.out.println(k3.b);
		System.out.println(k4.b);
		
		
		
		
	}

}
