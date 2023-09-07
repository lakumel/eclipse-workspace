package chapter16.ex03;

class Tiger {String name = "호랑이";}
class Lion{String name = "사자";}
class Eagle{String name = "독수리";}

class Animal<T>{
	private T t;
	
	//getter
	
	public T getT() {
		return t;
	}
	//setter
	public void setT(T t) {
		this.t = t;
	}
	
	
}


public class Ex01 {
	public static void main(String[] args) {
		//Animal Generic 클래스에 tiger, lion, eagle 클래스를 setter 주입을 하고 getter로 가져와서 필드의 내용을 출력
		// 완료시간 : 17:50분까지 : 다하면 메일
		
		System.out.println("===tiger===");
		Animal<Tiger> tiger = new Animal<Tiger>();
		tiger.setT(new Tiger());
		System.out.println(tiger.getT().name);
		
		System.out.println("===lion===");
		Animal<Lion> lion = new Animal<Lion>();
		lion.setT(new Lion());
		System.out.println(lion.getT().name);
		
		System.out.println("==eagle==");
		Animal<Eagle> eagle = new Animal<Eagle>();
		eagle.setT(new Eagle());
		System.out.println(eagle.getT().name);

	}
}
