package chapter08.ex03;

class Student{			//default : 외부 패키지에서 접근이 불가능하다.
	
	//외부에서 접근 불가한 필드, 외부 클래스에서 필드에 직접 값을 접근할 수 없도록 설정.
	private String stuName ;		//<==
	private String stuAddr;
	private int Age;
	private double Weight;
	
		//getter, setter 를 사용해서 : 접근 지정자를 public
			//private 필드에 값을 넣을때 (setter),
			//private 필드에 값을 불러올때 (getter)를 사용한다.
	
	
	//stuName 필드에 대한 getter : 필드의 값을 리턴
	public String getstuName() {
		return stuName;
	}
	//stuName 필드에 대한 setter : 필드의 값을 외부에서 주입
	public void setstuName(String stuName) {
		this.stuName = stuName;
	}
	
	//getter 
	public String getStuAddr() {
		return stuAddr;
	}
	//setter
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}
	
	//getter : age 필드에 대한
	public int getAge () {
		return Age;
	}
	//setter :age 필드에 대한
	public void setAge(int Age) {
		this.Age = Age;
	}
	//getter : weight 에 대한
	
	public double getWeight() {
		return Weight;
	}
	//setter : weight 에 대한
	public void setWeight(double Weight) {
		this.Weight = Weight;
		
		
		
	}
}


public class Private {

	public static void main(String[] args) {

		
		Student s1 = new Student();
	
		//private 필드에 직접 접근불가 : 외부클래스에서 : getter , setter 를 사용해서 값을 출력하고 입력
//		s1.stuName = "홍길동"; 			//이 필드의 접근 제어자가 private
//		System.out.println(s1.stuName); //private
		
		//getter 를 사용해서 필드의 내용을 출력
		System.out.println(s1.getstuName());
		
		//setter를 사용해서 필드의 값을 입력
		s1.setstuName("홍길동");
		System.out.println(s1.getstuName());
		
		//setter를 사용해서 필드의 값입력
		s1.setStuAddr("서울");
		s1.setAge(25);
		s1.setWeight(75.5);
		
		System.out.println("=====================================");
		//getter를 사용해서 필드의 값을 출력
		System.out.println(s1.getstuName());
		System.out.println(s1.getStuAddr());
		System.out.println(s1.getAge());
		System.out.println(s1.getWeight());
		
		
		
		
	}

}
