package chapter10.ex05;


class Aa{
	
	static int m = 3;
	
}

class Bb extends Aa{
	
	static int m =4;
	
	
}

public class Overriding_Static_Field {
	public static void main(String[] args) {
		//정적필드 : 클래스 영역에 필드의 값이 저장이 되어 있다. 부모의 필드와 자식의 필드는 별개다.
		//	-- 모든 객체에서 공유되는 공간
			// -- 객체 생성 후 사용
			// -- 객체 생성 없이 클래스 이름으로 호출이 가능하다.
		
		//객체 생성후 사용.
		Aa aa1 = new Bb(); 		//자식 객체 생성하면서 부모타입으로 지정.
			System.out.println(aa1.m); 		//3
			
		//다운 캐스팅 후 m 을 출력
		Bb bb1 = (Bb)aa1;
			System.out.println(bb1.m); 		//4
			
		//객체 생성없이 클래스 이름으로 사용
			System.out.println(Aa.m);		//3
			System.out.println(Bb.m);		//4
			
			
		
		
	}

}
