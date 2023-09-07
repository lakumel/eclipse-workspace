package chapter14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Checked_Exception {
	public static void main(String[] args) {
		/*
		   1.Error vs Exception
		   		- Error : h/w(CPU나 RAM나 하드디스크(HDD) 오류 LAN 오류), OS(S/W), JVM <== 오류는 개발자가 재어가 불가능하다. , Error
		   		- Excepion : JVM 위에서 자바 프래램에서 발생되는 문제들을 예외(Exception)
		   			- 개발자가 제어가 가능한부분
		   			- Exception이 발생되면 그 시점에서 프로그램이 중지되어 버림.
		   			- Exception 이 발생되더라도 프로그램이 종료되지 않도록 처리해야함.
		   			- Exception을 처리하는 방법은 2가지가 있다.
		   				- throws --> 예외를 호출하는 쪽에서 처리하도록 미루는 것
		   					throw : 예외를 강제로 발생시킴
		   				- try ~ catch  ---> 내가 직접 예외를 처리함.
		   2.Exception(예외)
		   		- 일반 예외 (Checked Exception) : 컴파일러가 체크를 하고 이클립스에서 알려줌
		   		- 실행 예외 (Runtime (Unchecked) Exception) : 컴파일러가 체크를 하지 않고 실행시에 예외 발생
		 */
		
		//1.InterruptedException : 인터럽트가 발생되었을때 예외
	    //Thread.sleep(1000); 		//스레드를 1초동안 잠시 멈추어라
		
		//2.ClassNotFoundException : 특정 경로에 해당 클래스가 존재하지 않는 경우 발생 되는 예외
		//Class cls = Class.forName("java.lang.Object");		//Db의 driver 클래스를 로드할때 (오라클/MS-SQL/MYSQL)
		
		//3.IOException : Input, Output에 대한 예외
		InputStreamReader in = new InputStreamReader(System.in);
		
		//in.read(); //IO에 대한 오류
		
		//4.FileNotFoundException : 파일을 찾을 수 없을때 발생하는 오류
		//FileInputStream fis = new FileInputStream("text.txt");
		
		
		
	}

}
