package chapter14.ex05;

class Aaa {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		//DB 연결시 사용 : 일반 예외 : 반드시 예외 처리(1.자신이 직접 처리, 2.throws로 미루는 방법)
		Class cls = Class.forName("java.lang.Object");
		System.out.println("존재하는 클래스 입니다.");
	}
}



public class Throws_Exception03 {
	public static void main(String[] args) {
		
		Aaa a1 = new Aaa();
		
		try {
			a1.abc();
		} catch (ClassNotFoundException e) {
			
			//e.printStackTrace();	//디버깅 : 오류가 몇번 라인에서 발생했는지 알려주는 것 이건 오류가 아니다.
		}
		
		
		System.out.println("프로그램 정상 종료됨");
	}

}
