package chapter16.ex02;

class Tiger {
	Tiger(){}
	Tiger(String name){
		this.name = name;
	}
	String name = "호랑이";
}
class Lion{
	Lion(){}
	Lion(String name){
		this.name = name;
	}
	String name = "사자";
}
class Eagle{
	Eagle(){}
	Eagle(String name){
		this.name = name;
	}
	
	String name = "독수리";
}


class Animal{
	
	private Object obj = null;	
	
	//getter : 객체정보 출력
	public Object getObj() {
		return obj;
	}
	
	//setter : obj 필드의 값을 적용
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 Animal 클래스에 tiger , lion, eagle 객체를 setter 주입 ==> object 타입
		 getter 사용해서 가져와서 name 필드를 출력
		 	
		 */
		
		Animal a1 = new Animal();
		
		Tiger t1 = new Tiger("호랑이");
		a1.setObj(t1);
		
		Object o1 = a1.getObj();
		Tiger tt1 = (Tiger) o1;
		System.out.println(tt1.name);
		
		System.out.println("===lion===");
		a1.setObj(new Lion("사자"));
		System.out.println(((Lion)a1.getObj()).name);
	
		System.out.println("=====Eagle===");
		a1.setObj(new Eagle("독수리"));
		System.out.println(((Eagle)a1.getObj()).name);
	
	}

}
