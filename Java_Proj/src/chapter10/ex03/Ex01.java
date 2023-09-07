package chapter10.ex03;
//상속, 메소드 오버 라이딩(인스턴스 메소드일때), 업캐스팅, 다운캐스팅, 배열에 객체를 넣고 빼기...


//부모 클래스: 자식 클래스의 공통적으로 적용되는 필드, 메소드 정의
class Human{//사람(부모클래스) <===>(자식클래스) 학생, 교수, 근로자
	
	//기본생성자가 생략되어 있다.
	//Human(){}
	
	//필드 : 상속받을 자식클래스의 공통으로 사용되는 속석을 정의하고 있다.
	String name;
	int age;

	//메소드 : 인스턴스 메소드
	void eat() {
		System.out.println("Human - 모든 사람은 잠을 잡니다.");
	}

}

//자식 클래스
class Student extends Human{
	//기본생성자가 생략되어 있다. <== 상속 관계에서는 기본생성자 내부에 부모 클래스의 기본 생성자를 호출하도록 되어 있다.
	Student (){
		super();	//super(); : 부모클래스의 생성자를 호출 : 생략되어 있다.
	}
	
	// Human의 필드와 메소드가 
	//필드
	int stuID;		//학생에게만 적용되는 필드
	
	//메소드:학생클래스에서만 적용되는 메소드
	void goToSchool() {
		System.out.println("Student - 학생은 학교에 갑니다.");
	}
	
	//메소드 오버라이딩 : 부모클래스에서 정의한 메소드를 자식클래스가 재정의해서 사용함
	@Override
	void eat() {
		System.out.println("Student - 학생은 식당에서 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

class Professor extends Human{
	//human의 필드와 메소드
	
	int professorID;
	void goToTeach() {
		System.out.println("교수는 학생을 가르치러 학교에 갑니다.");
	}
	
	//메소드 오버라이딩 : human의 eat()를 재정의
	@Override
	void eat() {
		System.out.println("Professor - 교수는 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Professor [professorID=" + professorID + ", name=" + name + ", age=" + age + "]";
	}
	
}

class Worker extends Human{
	//human의 필드와 메소드를 상속
	
	int workerID;
	void goToWork() {
		System.out.println("근로자는 일하러 일터로 출근 합니다.");
	}
	
	//메소드 오버라이딩
	@Override
	void eat() {
		System.out.println("Worker - 근로자는 맛있게 식사를 합니다.");
	}

	@Override
	public String toString() {
		return "Worker [workerID=" + workerID + ", name=" + name + ", age=" + age + "]";
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		//1.상속에서 부모클래스의 필드와 메소드 상혹확인
		
		//human 클래스 h1 객체생성 : h1 : human 타입만 내포 하고 있음.
		Human h1 = new Human(); 	
			//h1 : human의 필드와 메소드만 접근
			//h1 : human을 객체화 했기 때문에 자식클래스(student/professor/worker)를 내포하고 있지 않아서 다운 캐스팅 할 수 없다.
		
		//다운캐스팅 오류발생 : 명시해야 한다. : <== 주의 : 런타임 오류 발생 : instanceof를 사용해서 해당타입이 존재하는지 확인후 캐스팅 필요.
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//false
		System.out.println(h1 instanceof Professor); 	//false
		System.out.println(h1 instanceof Worker); 		//false
		
		//Student ss1 = h1;
		//오류 : 컴파일 오류(이클립스에서 오류를 발생을 시킴), 런타임 오류(실행시 오류 발생)
		if(h1 instanceof Student) {
			Student ss1 = (Student)h1;		//h1에 Student 타입이 존재할때는 실행하도록 
		}else {
			System.out.println("h1에는 Student 타입이 존재하지 않습니다.");
		}
		
		System.out.println("==========================================");
		//student 클래스 s1이라는 객체를 생성
		Student s1 = new Student(); 			//s1이라는 객체는 2개의 타입을 모두 가지고 있다. Human이라는 타입을 내포하고 있고 student 타입을 내포하고 있다.
		//s1 : Human 필드와 메소드, Student 필드와 메소드를 모두 접근이 가능하다.
												//s1 : Human/Student 내포하고 있고, Student 타입으로 지정되어 있다.
		//s1은 Human의 필드 메소드, Student 필드 메소드 모두 접근
		s1.name = "홍길동"; 		//Human
		s1.age = 20;			//Human
		
		s1.stuID = 1234; 		//student에 필드
		
		Human s2 = new Student(); 				//s2 : Human/Student 내포하고 있고, Human 타입으로 지정되어 있다.
			//s2:Human 의 필드와 메소드만 접근
		s2.name = "이순신";
		s2.age = 30;
		
		//s2는 Human/Student 타입으로 이동이 가능하다. 	
		
		//s2 : Human =====> Student  : 다운캐스팅 : 명시
		System.out.println(s2 instanceof Student); 	//true
		
		Student ss2 = null;
		
		if(s2 instanceof Student) {
			ss2 = (Student) s2;
		}
		
		//ss2 : Human/Student 모두 내포하고 있고 Human에서 Student 타입으로 다운캐스팅
		//: Human에 있는 필드와 메소드 Student 필드와 메소드를 모두 사용이 가능하다.
		ss2.name = "세종대왕"; 		//Human
		ss2.age = 50;				//Human
		
		ss2.stuID = 2345; 			//Student
		
		//업캐스팅 : ss2 : Student(자식) ===>Human(부모) : 명시하지 않아도 자동으로 캐스팅이 된다.
		System.out.println(ss2 instanceof Human);	//true
		
		Human hh1 = ss2; 		//업캐스팅은 캐스팅시 instanceof를 사용하지 않아도 됨....컴파일 단계에서 오류가 발생하기 때문
		
		
		//자식을 객체화 해서 부모타입으로 지정후 배열이나 컬렉션에 저장후에 끄집어내서 출력함
		
		Student s10 = new Student(); 	//hs에는 두개의 타입이 내포되어 있다. Human과 student
		Professor p10 = new Professor(); //hp : Human/professor 을 내포하고 있다.
		Worker w10 = new Worker(); 	//hw : Human/worker을 내포하고 있다.
		
		//각 객체의 필드의 값을 입력
		//s10
		s10.name = "김똘똘";
		s10.age = 30;
		s10.stuID = 1234;
		
		//p10
		p10.name = "김교수";
		p10.age = 40;
		p10.professorID = 2345;
		
		//w10
		w10.name = "홍근로자";
		w10.age = 20;
		w10.workerID = 3456;
		
		//위의 객체를 배열이나 컬렉션(arraylist/vector/set/map)에 넣어서 처리를 함.
		
		//배열이나 컬렉션의 저장되는 것은 동일한 타입으로 지정이 되어야 한다.
		//s10 : Student 타입으로 되어 있다. p10: professor, w10 : worker 	<== Human이라는 타입을 모두 가지고 있다.
		
		
		//s10, p10, w10은 자동으로 업캐스팅 되어서 Human타입으로 저장됨
		Human[] arr = new Human[] {s10, p10, w10};
		
		//arr[0] : Human / Student 
		//arr[1] : Human / Professor
		//arr[2] : Human / Worker
		
		//배열의 각 방의 값을 끄집어 내어서 변수에 재할당한다.
		Human h20 = arr[0] ;
		Human h21 = arr[1] ;
		Human h22 = arr[2] ;
		
		//배열의 각 방의 내용을 끄집어 낼때 다운캐스팅 하면서 끄집어낸다.
		Student s20 =(Student) arr[0]; 	//human 타입에서 student 타입으로 다운캐스팅
		Professor s21 =(Professor) arr[1]; //Human 타입에서 professor 타입으로 다운 캐스팅
		Worker s22 = (Worker) arr[2]; //Human 타입에서 Worker타입으로 다운 캐스팅
		
		//각 객체의 필드의 내용을 출력
		System.out.println(" // Student 객체 정보 출력");
		System.out.println(s20);
		System.out.println(" // Professor 객체 정보 출력");
		System.out.println(s21);
		System.out.println(" // Worker 객체 정보 출력");
		System.out.println(s22);
		
		//3.메소드 오버 라이딩 테스트
		
		//3-1. Human객체 생성후 eat() 메소드 호출 
		Human h30 = new Human(); 		//h30 객체는 human타입만 내포하고 있다.
		h30.eat(); 		//human 클래스의 eat(); 메소드 호출
		
		//3-2. student 객체를 생성시 student 타입으로 지정
		Student s30 = new Student(); //s30은 Human 타입과 Student 타입을 내포하고 있다.
		s30.eat(); 		//Student 클래스의 eat(); 메소드 호출
		
		//
		Professor p30 = new Professor();
		Worker w30 = new Worker();
		
		p30.eat(); 		//Professor 클래스의 eat(); 메소드 호출
		w30.eat();		//worker 의 타입이 지정되어 있기에 worker 타입의 eat(); 메소드 호출
		
		System.out.println("===오버라이딩된 메소드가 출력됨=====");
		//자식클래스를 생성하면서 부모클래스 타입으로 지정후 오버 라이딩된 매소드 호출
		Human h40 = new Student(); 				//h40은 Human/Student을 내포하고 있다.
		Human h41 = new Professor();			
		Human h42 = new Worker();				
		
		//Human 클래스의 eat() 메소드 호출
		h40.eat();		//h40 : Human클래스의 eat이라는 메소드를 호출시 student 클래스의 오버라이딩된 eat()이 작동을 한다.
		h41.eat();		//h41 : Human클래스의 eat이라는 메소드를 호출시 professor 클래스의 오버라이딩된 eat()이 작동을 한다.
		h42.eat();		//h42 :  Human클래스의 eat이라는 메소드를 호출시 worker 클래스의 오버라이딩된 eat()이 작동을 한다.
		
		
		//부모의 메소드(eat();)를 호출시 자식 클래스의 오버라이딩된 메소드가 출력됨(eat()) <==매우 매우 중요함.

		
		
		
	}

}
