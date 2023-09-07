package chatper02.ex04;

public class PrimaryDataType {
	public static void main(String[] args) {
		
		
		/*
		(자바의)자료형 :
				- 기본 자료형 : RAM STACK(스텍) 공간에 변수명과 변수의 값이 저장
					- 8가지 기본 자료형 : boolean, 정수( byte, short, int, long), 실수 ( float, double), 문자(char)
					- 정수형 자료형의 기본은 : int			<=== long 으로 선언후 변수의 값(리터럴)을 담을때 , l,L
					- 실수형 자료형의 기본은 : double		<=== float 선언된 변수에 값을 넣을때, f, F
					
				- 참조 자료형 : RAM STACK (스택) 공간에 힙에 저장된 참조 주소를 가지고 있다. Heap (힙)의 실제 값이 저장이 됨
					- 무한대 (객체 (String) / 배열 / ...)
						
			//리터럴 : 변수에 할당된 값을 통칭해서 리터럴 
		 
		*/
		
		
		//1.boolean : true나 false 값만 저장할 수 있는 자료
		
		boolean bool1 = true;
		
		boolean bool2 ;
		bool2 = false ;
		
		//boolean bool3 = 123;			//오류가 발생한다. true나 false만 넣을 수 있다. 다른값 넣으면 오류
		
		System.out.println(bool2);			//false
			
		//변수의 값 수정
		bool2 = true;					//어디에 출력하느냐에 따라 새로운 값을 할당을 한다.
		
		
		System.out.println(bool1);		//true
		System.out.println(bool2);		//true
		
		
		// 상수: 변수 이름 앞에 final키가 붙은 것, 상수명은 변수명과 구분하기 위해서 대문자로 사용
		final boolean BOOL4 = false;
		System.out.println(BOOL4); 		//false
		
		//상수는 값을 수정할 수 없다.
		
		//BOOL4 =true ;				//오류 발생 : 상수는 값을 수정할 수 없다.
		
		
		//2. 정수형 자료형 (byte (1byte), short(2byte), int (4byte), long(8byte) )
		
		// byte : 1byte (-2^7 ~ +2^7 -1) 까지의 값을 저장  1byte : 8bit
					// -128~ + +127 범위
		
		byte val1 = -128;		// -129 이하을 넣으면 오류 발생
		byte val2 = 127;		// 128 이상을 넣으면 오류 발생

		
		// short : 2byte ( = 16bit, -2^15 ~ +2^15 -1) 범위의 값을 할당 할 수 있다.
						// -32,768 ~ +32,767 범위
		
		short val3 = -32768 ;
		short val4 = 32767 ;
		
		//short val5 = -32769 ; 			// -32769 이하이면 오류
		// short val6 = 32768 ;				// 32768 이상이면 오류
				
		
		// int :4byte(= 32bit , -2^31 ~ +2^31 -1) 범위의 값을 지정
				// -2,147,483,648 ~ +2,147,483,647 까지의 범위
		
		int val5 =-2147483648;
		int val6 = 2147483647;
				
		
		
		// long : 8byte( = 64bit, -2^63~ +2^63 -1)범위의 값을 지정
				// -9,223,372,036,854,775,808 ~ + 9,223,372,036,854,775,807 까지의 값을 지정
				// long 형으로 선언된 변수에 값을 할당할때 주의할점, 리터럴의 값을 넣을때 대문자 L 또는 소문자 l을 넣어야 한다.
		
		long val7 = -9223372036854775808L;
		long val8= 9223372036854775807L;
		
		long val9 = 123456;		//int 자료형 보다 큰 값을 넣을때 L
		
		
		
		// 3. 실수형(소수점을 넣는) 자료형		: double 이 기본이여서, float 자료형에 값을 할당 할때, f,F 
		//		--float		: 4byte,	소수점 7자리까지 정밀도를 유지
		//		--double	: 8byte,	소수점 15자리까지 정밀도가 유지
		
		//float val10= 1.123456789;		//double 일때는 문제가 없지만 float 일때는 문제가 일어난다.
		
		float val10= 1.123456789F;		// 소수점 이하 9자리까지 넣었지만 F(7자리까지만 유지)
		System.out.println(val10);		//==> 출력하면 1.1234568로 출력, 7자리만 출력
		
		double val11 = 1.12345678910111213;
		System.out.println(val11);  		//1.1234567891011122
		
		
		//4. 문자 (char) : 1글자 , 문자열 : 한글자 이상 ,String <=====(참조 자료형, 객체형) ,리터럴의 값을 넣을때 : ""
			// -- 리터럴에 값을 넣을때 : ''
			// -- 리터럴에 문자를 넣을 수 있다.(A,B,C,a,b,c)
			// -- 리터럴에 특수 문자 : #,!, %
			// -- 아스키 코드 값으로 넣을 수 있다. : 숫자, 문자, 영문자, 특수문자		<===7bit
			// -- 유니코드 값으로 넣을 수 있다. : '\u0041'	, 2byte, 3byte		<==한글, 중국어, 일본어, ...........
			// -- 한글 1자, 중국어 1자, 일본어 1자 .
		//직접 문자를 대입 : 영어(대문자, 소문자), 숫자, 특수문자		<==『7bit』로 된 코드 값을 가진다. 이것을 『아스키 코드』라고 부른다.
		//유니코드 :2byte~3byte로 된 코드 값 , 한국어,일본어,중국어..........
		
		
		
		char val12 = 'A';			//A의 아스키 코드 값 : 65
		char val13= 'B';
		//char val14= 'ab';			//오류 발생
		
		char val14='a';
		char val15='가';				//한글은 유니코드라 int로 변환이 안된다.
		char val16 = '#';
		char val17 ='1';
		
		System.out.println(val12);			//A라고 출력
		System.out.println((int)val12);		//65로 출력(아스키 코드값)
		
		System.out.println(val13);			//B
		System.out.println((int)val13);		//66
		
		System.out.println(val14);			//a
		System.out.println((int)val14);		//97
		
		System.out.println(val15); 			//가
		System.out.println((int)val15); 	//44032(유니코드 값 출력)
		
		// 숫자 (아스피 코드 값으로) char 변수에 값 할당.
		char val18 = 65;		//A
		
		System.out.println(val18);
		
		//유니 코드 값으로 char 변수에 값을 저장
		
		char val19 = '\u0041';		//A
		char val20 = '\uac00';		//가
		char val21 = '\u0033';		//3
		char val22 = '\uc591';		//양
		char val23 = '\uc6b0';		//우
		char val24 = '\uc131';		//성
		
		
		System.out.println(val19);	//A
		System.out.println(val20);	//가
		System.out.println(val21); 	//3
		System.out.println(val22); 	//양
		
		
		System.out.println("나의 이름은 " + val22 + val23 + val24 + " 입니다.");
		
		
		//자신의 이름을 유니코드 char 변수에 할당해서
		//나의 이름은 000입니다.			<==출력
		
		//1.println() : 문자열과 변수를 출력시 +
		System.out.println("나의 이름은 " + val22 + val23 + val24 + " 입니다.");
		
		//2.print()	: 문자열과 변수를 출력시 + ,   \
		System.out.print("나의 이름은 " + val22 + " " + val23 + val24 + " 입니다. \n");
		
		//3.printf() : 문자열 내에서, 뒤의 변수값을 불러들임 "%s" : 문자열, "%d" : 정수 , "%f" : 실수
				// "%c" : 문자열의 변수값을 불러들인다.
		System.out.printf("나의 이름은 %c %c%c 입니다. \n", val22, val23, val24);
		
		
		// 참조 자료형 : String (객체) 	: 문자열을 저장하는 자료형 : ""
			String val25 = "오늘의 날씨는 흐립니다.";

			System.out.println(val25);
		
		
	}

}
