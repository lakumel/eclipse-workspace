package chapter16.ex07;

//제너릭의 들어오는 타입제안을 위한 클래스 생성
class A{}
class B extends A{}
class C extends B{}

class D<T extends B>{ //T라는 제너릭 타입 변수에 B타입과 C타입만 처리되도록 제한을 가함
						//B,C의 메소드를 사용가능함.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class E<T>{//<T> : 모든 타입을 다 받을 수 있다. : Wrapper class, 참조 자료형
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}


public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
		/*
		  제너릭 클래스로 들어오는 타입을 제안을 할 수가 있다. : extends 키를 사용함.
		  		-- 특정 클래스의 메소드를 매개변수로 들어오는 변수에서 사용 가능하다.
		  		-- 제너릭 타입이 제안되어 있지 않을때 매개변수에 사용가능한 메소드는 object 클래스의 메소드만 사용 가능
		  		
		 */
		//E 클래스를 객체화 했을때 T의 모든 타입이 올 수 있다.
		E<String> e1 = new E<>();
		E<Integer> e2 = new E<>();
		E<Double> e3 = new E<>();
		E<A> e4 = new E<>();
		E<B> e5 = new E<>();
		E<C> e6 = new E<>();
		
		//D 클래스를 객체화 했을때 T에 타입 제한 : B, C 타입만 올 수 있다.
		/*
		 오류 발생
		D<String> d1 = new D<>();	
		D<Integer> d2 = new D<>();
		D<A> d3 = new D<>();
		*/
		D<B> d4 = new D<>();
		D<C> d5 = new D<>();
		
		
		
		
		
		
	}

}
