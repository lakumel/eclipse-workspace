package chapter08.ex03;

public class Car {  //외부 패키지에서 접근이 가능하다.
	
	private String company;
	private String carName;
	private int carMaxspeed;
	private double carWeight;
	
	//getter , setter 를 생성해서 각 필드의 값을 넣고 (setter) 출력(getter)
	public String getcompany() {
		return company;
	}public void setcompany(String company) {
		this.company = company;
	}
	public String getcarName() {
		return carName;
	}
	public void setcarName(String carName) {
		this.carName = carName;
	}
	public int getcarMaxspeed() {
		return carMaxspeed;
	}
	public void setcarMaxspeed(int carMaxspeed) {
		this.carMaxspeed = carMaxspeed;
	}
	public double getcarWeight() {
		return carWeight;
	}
	public void setcarWeight(double carWeight) {
		this.carWeight = carWeight;
	}
	
	
	public static void main(String[] args) {
		//car 객체를 생성후 각 메소드에 setter를 호출해서 값을 넣고,
		//getter를 사용해서 출력
		
		Car c1 = new Car();
		
		c1.setcompany("현대");
		c1.setcarName("아반테");
		c1.setcarMaxspeed(200);
		c1.setcarWeight(2000.0);
		
		System.out.println("======================");
		
		System.out.println(c1.getcompany());
		System.out.println(c1.getcarName());
		System.out.println(c1.getcarMaxspeed());
		System.out.println(c1.getcarWeight());
		
	}

}
