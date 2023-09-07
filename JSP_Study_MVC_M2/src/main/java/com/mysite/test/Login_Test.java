package com.mysite.test;

import com.mysite.users.UsersDAO;
import com.mysite.users.UsersDTO;

public class Login_Test {

	public static void main(String[] args) {
		
		//1.DTO에 임시 ID와 Password를 setter 주입
		UsersDTO dto = new UsersDTO();
		dto.setId("ccc");
		dto.setPassword("1111");
		
		//2.DAO의 로그인 메소드 호출:
		UsersDAO dao=new UsersDAO();
		
		//반환받은 users = null인 경우 : 인증 실패
		//반환받은 users = null이 아닌 경우 : 인증 성공
		UsersDTO users = dao.login(dto);
		
		if(users==null) {
			System.out.println("해당 ID와 password가 DB에 존재하지 않습니다.");
		}else {
			System.out.println("로그인 성공 되었습니다.");
		}
		
		
		
		
		

	}

}
