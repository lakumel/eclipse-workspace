package chapter10.ex04;

class Car{
	String companyName = "현대자동차";
	int carYear; 	//생산년도
}

class Hcar extends Car{
	//
	String carName; 		// 차 이름 (에코스, 제네시스, 아반테, 봉고)
	int maxSpeed;			// 최대 스피드
	int oilLiter;			// 각차의 오일이 최대 몇리터인지
}

class BMW extends Car{
}


public class Ex02 {
	Car[] arr = null;
	void carInfo(Car c1, Car c2, Car c3, Car c4) {
		//1.현대자동차 객체를 인풋으로 받아서 arr 배열변수에 저장
		arr = new Car[] {c1, c2, c3, c4};
		//2.현대자동차의 배열에 저장된 최대스피드의 평균을 출력
		avgMaxSpeed(arr);
		//3.현대자동차 배열에 저장된 오일의 합을 출력
		System.out.println("현대 자동차의 오일의 전체 합계는 : " + sumOil(arr) + " 입니다.");
		sumOil(arr);
		
	}
	void avgMaxSpeed(Car[] arr) {
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i <arr.length; i++) {
			//다운캐스팅 적용
			if(arr[i] instanceof Hcar) {
				sum+= ((Hcar)arr[i]).maxSpeed; //sum = sum +maxSpeed 
			}
		}
		avg = (double)(sum/arr.length);
			
		System.out.printf("현대자동차의 평균 스피드는 : %.2f 입니다. " , avg );
		System.out.println();
	}

	int sumOil(Car[] arr) {
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			//다운캐스팅
			if(arr[i] instanceof Hcar) {
			sum+=((Hcar)arr[i]).oilLiter;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		//현대자동차의 객체를 생성해서 필드의 값 입력
									//연식 차명 최대스피드 오일용량
		Hcar h1 = new Hcar(); 		//2000/에코스/350/60
		Hcar h2 = new Hcar();		//2010/제네시스/300/50
		Hcar h3 = new Hcar();		//2022/그렌져/250/55
		Hcar h4 = new Hcar();		//2023/아반테/200/40
		
		h1.carYear = 2000;
		h1.carName = "에코스";
		h1.maxSpeed = 350;
		h1.oilLiter = 60;
		
		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;
		
		h3.carYear = 2022;
		h3.carName = "그렌저";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;
		
		h4.carYear = 2023;
		h4.carName = "아반테";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;
		
		Ex02 e2 = new Ex02();
		
		e2.carInfo(h1, h2, h3, h4);
		
	}

}

/*실제로 내가 풀어본 문제
package chapter10.ex04;
class Car{
	String companyName = "현대자동차";
	int carYear; 	//생산년도
}
class Hcar extends Car{
	String carName; 		// 차 이름 (에코스, 제네시스, 아반테, 봉고)
	int maxSpeed;			// 최대 스피드
	int oilLiter;			// 각차의 오일이 최대 몇리터인지
}

class BMW extends Car{
}

public class Ex02 {
	Car[] arr = null;
	void carInfo(Car c1, Car c2, Car c3, Car c4) {
		arr = new Car[] {c1, c2, c3, c4};
		//현대자동차 객체를 인풋으로 받아서 arr 배열변수에 저장
		//현대자동차의 배열에 저장된 최대스피드의 평균을 출력
		//현대자동차 배열에 저장된 오일의 합을 출력
		System.out.println("배열에 저장된 객체의 모든 오일의 합은 " + sumOil(arr) + " 입니다.");
		avgMaxSpeed(arr);
	}

	void avgMaxSpeed(Car[] arr) {
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] instanceof Hcar) {
				// arr[i] : Car 객체 ==> HCar 타입으로 변환 
				Hcar h1 = (Hcar) arr[i]; 
				sum+= h1.maxSpeed;   // sum = sum + maxSpeed 
			}
		}
		double avg = (double)sum/arr.length;
		System.out.println("배열에 저장된 객체의 모든 자동차의 평균은 : " + avg );
	}

	int sumOil(Car[] arr) {
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] instanceof Hcar) {
				sum+=((Hcar)arr[i]).oilLiter;
			}
		}
		return sum;
	}
	public static void main(String[] args) {

		//현대자동차의 객체를 생성해서 필드의 값 입력
									//연식 차명 최대스피드 오일용량
		Hcar h1 = new Hcar(); 		//2000/에코스/350/60
		Hcar h2 = new Hcar();		//2010/제네시스/300/50
		Hcar h3 = new Hcar();		//2022/그렌져/250/55
		Hcar h4 = new Hcar();		//2023/아반테/200/40

		h1.carYear = 2000;
		h1.carName = "에코스";
		h1.maxSpeed = 330;
		h1.oilLiter = 60;

		h2.carYear = 2010;
		h2.carName = "제네시스";
		h2.maxSpeed = 300;
		h2.oilLiter = 50;

		h3.carYear = 2022;
		h3.carName = "그렌저";
		h3.maxSpeed = 250;
		h3.oilLiter = 55;

		h4.carYear = 2023;
		h4.carName = "아반테";
		h4.maxSpeed = 200;
		h4.oilLiter = 40;

		Ex02 e2 = new Ex02();

		e2.carInfo(h1, h2, h3, h4);

	}

} 
 */
