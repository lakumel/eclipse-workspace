package chapter12.ex05;

public class Fruit_Test {
	public static void main(String[] args) {
		//1.인터페이스는 객체화가 불가능. 타입으로 지정해서 사용
		
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Strawberry();
		
		//배열에 넣지 않고 출력
		
		f1.name();
		f1.eat();
		f1.color();
		
		f2.name();
		f2.eat();
		f2.color();

		f3.name();
		f3.eat();
		f3.color();
		
		
		
		System.out.println("============");
		//배열에 넣어서 출력
		Fruit[] arr = new Fruit[] {f1, f2, f3};
		
		System.out.println("==for 문을 사용해서 출력 ==");
		for(int i = 0; i <arr.length; i++) {
			arr[i].name();
			arr[i].eat();
			arr[i].color();
			System.out.println();
		}
		System.out.println("==enhanced for 문==");
		for(Fruit l : arr) {
			l.name();
			l.eat();
			l.color();
			System.out.println();
		}
				
		
		

	}

}
