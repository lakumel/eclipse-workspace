package chapter10.ex02;

class Animal{	//부모클래스
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

//자식 클래스 (Tiger, Lion)
class Tiger extends Animal{
	
	String tigerCry;
	void tigerRun() {
		System.out.println("호랑이는 달립니다.");
	}
}
class Lion extends Animal{
	String lionCry;
	void lionRun() {
		System.out.println("사자는 달립니다.");
	}
}

//자식의 자식 클래스(Lionchild)
class LionChild extends Lion{
	String lionchildCry;
	void lionchildRun() {
		System.out.println("새끼사자는 엉금엉금 기어갑니다.");
	}
}


public class TypeCasting01 {
	public static void main(String[] args) {
		/*
		 	객체의 타입 변환(object type casting) :
		 		- 업캐스팅(up casting) :	자식 타입에서 ==> 부모타입으로 변환 , 명시하지 않아도 자동 변환됨.
		 			객체를 배열 / 컬렉션에 저장하기 위해서 동일한 타입으로 배열이나 컬랙션에 저장
		 			
		 		- 다운 캐스팅(down casting):	부모 타입 ==> 자식타입으로 변환, 명시해서 변환
		 				-- instanceof 를 사용해서 자식 타입이 존재하는지 살펴보고 다운캐스팅
		 				-- 만약에 자식타입이 존재하지 않을 경우 실행시 오류 발생
		 */
		
		//1.Animal
		Animal a1  = new Animal();	//a1은 animal 타입만 가지고 있다.
		
		//a1은 Animal 타입만 존재 : animal 클래스에 있는 필드와 메소드만 접근이 가능하다.
			//a1 : Tiger, Lion, Lionchild 타입을 가지고 있지 않다.
		a1.age = 10;
		a1.name = "동물";
		a1.eat();
		
		//2.tiger
		Tiger t1 = new Tiger(); 	//t1은 tiger, animal 타입을 가진다.
		
		//t1 : tiger / animal
		t1.tigerCry = "어흥";			//tiger 클래스에 있는 필드
		t1.tigerRun(); 				//타이거 필드에 있는 메소드
		
		t1.name = "호랑이";			//animal 필드
		t1.age = 20;				//animal 필드
		t1.eat(); 					//animal 메소드
		
		//업캐스팅(upcasting) : 자식타입을 부모타입으로 변환 :	t1 (Animal(부모), Tiger(자식))
		Animal a2 = t1;		//tiger ===>Animal   업캐스팅(animal 타입의 필드나 메소드만 접근이 가능하다.)
		
		//a2는 animal 타입으로 업캐스팅 : animal의 필드/메소드만 접근
		System.out.println(a2.name);
		System.out.println(a2.age);
		//System.out.println(a2.tigerCry); 		//tiger의 필드나 메소드는 접근이 안됨-오류발생
		
		System.out.println("=============================");
		//a2는 animal타입으로 정의 : tiger/animal
		
		//다운 캐스팅 : 부모타입에서 자식 타입으로 변환 , 명시해서 변환을 해야 한다.
		//반드시 instanceof를 사용해서 실행시 오류나지 않도록 처리가 필요함
		
		Tiger tt1 = (Tiger)a2;
		
		//tt1은 tiger 타입으로 다운캐스팅 : tiger /animal <==부모/자식 필드의 메소드를 모두 사용이 가능하다.
		System.out.println(tt1.name);			//animal
		System.out.println(tt1.age);			//animal
		System.out.println(tt1.tigerCry);		//tiger
		
		System.out.println("===============================================");
		
		//3.lion 객체를 생성 : l1 : Lion /animal
			//자식 클래스를 객체화 시키면 부모클래스의 필드/메소드가 사용가능
		Lion l1 = new Lion();
			//lion 필드/메소드, animal 필드/메소드 모두 사용 가능
		//업캐스팅 : Lion(l1) ==Animal(aa2)
		Animal aa2 =l1;
			//aa2는 Animal의 필드/ 메소드만 접근이 되고, Animal 타입과 lion타입을 그대로 가지고 있다.
		//다운 캐스팅 : animal(부모) ===> lion(자식타입)
			//lion에 있는 필드와 메소드, animal에 있는 필드와 메소드를 모두 사용가능
		Lion ll2 =(Lion)aa2;
		
		System.out.println("======instanceof============");
		
		//객체내부에 해당 타입이 존재하면 true , 존재하지 않으면 false
		System.out.println(ll2 instanceof Animal);		//true
		System.out.println(ll2 instanceof Lion);		//true
		
		System.out.println(a1 instanceof Tiger);		//false
		System.out.println(a1 instanceof Animal);		//true
		
		//a1 : Animal
		//실행시 객체 내부에 해당타입이 존재하지 않는 경우 : 실행시 오류 발생/컴파일 단계에서는 오류가 발생하지 않음
		if(a1 instanceof Tiger) {//false : a1 객체는 tiger 타입이 존재하지 않습니다.
			Tiger ttt1 = (Tiger)a1;	
		}else {
			System.out.println("해당 객체는 Tiger 타입이 존재하지 않습니다.");
		}
		//Tiger tt22 = (Tiger)a1;
		
		//4.Lionchild : lionchild / lion /animal
		
		LionChild lc1 = new LionChild();
		
		lc1.age	= 30;	//animal
		lc1.lionCry = "어흥";	//lion
		lc1.lionchildCry = "응애";	//lionchild
		
		System.out.println("=============================");
		//lionchild ==> animal 업캐스팅
		Animal a5 =lc1;
			//a5는 animal의 필드/메소드만 접근 : lionchild/lion/animal
		System.out.println(a5 instanceof Animal);
		System.out.println(a5 instanceof Lion);
		System.out.println(a5 instanceof LionChild);
		
		//다운 캐스팅 : Animal ===> Lion
		Lion ll7 = null;	// 객체의 초기화 null
		if(a5 instanceof Lion) {
			ll7 = (Lion)a5;
			System.out.println("a5는 Lion타입으로 잘 캐스팅이 되었습니다.");
		}else {
			System.out.println("a5는 Lion타입으로 다운캐스팅 할 수 없습니다.");
		}
		//ll7 : lion/animal 접근, lionchild/lion/animal을 내포하고 있다.
		ll7.lionCry = "어흥 어흥 어흥"; //lion
		ll7.age = 30;
		
		//117을 lionchild로 다운캐스팅 : 실행할떄 오류가 발생하므로 instanceof가 필요하다.
		
		LionChild lc9 = (LionChild)ll7;
		
	}

}
