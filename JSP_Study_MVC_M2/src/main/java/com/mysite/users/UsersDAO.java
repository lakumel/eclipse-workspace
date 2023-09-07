package com.mysite.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysite.common.JDBCUtil;

public class UsersDAO {
	
	private Connection conn=null;
	private PreparedStatement pstmt = null;
	private ResultSet rs=null;
	
	private final String USERS_INSERT=
			"insert into users (id,password,name,role) values (?, ?,?,?)"; 

	private final String USERS_UPDATE="update users set password = ?, name = ?, role = ? where id = ?";
	private final String USERS_DELETE="";
	private final String USERS_GET= "select * from users where id = ?";
	private final String USERS_LIST=" select * from users order by id desc";
	private final String USERS_LOGIN = "select * from users where id =? and password =?";
	
	
	
	//1.Users 테이블의 값을 넣는 메소드
	public void insertUsers(UsersDTO dto) {
		
		try {
			conn=JDBCUtil.getConnection();
			
			pstmt=conn.prepareStatement(USERS_INSERT);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getRole());
			
			pstmt.executeUpdate();
			
			System.out.println("USERS 테이블에 값이 잘 insert 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("USERS 테이블에 값이 insert 실패 되었습니다.");
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	
	
	//update
	//USERS_UPDATE="update users set password = ?, name = ?, role = ? where id = ?";
	
	public void updateUsers(UsersDTO dto) {
		System.out.println("updateUsers 메소드 호출");
		
		try {
			conn=JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USERS_UPDATE);
			pstmt.setString(1, dto.getPassword());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getRole());
			pstmt.setString(4, dto.getId());
			
	   
	        pstmt.executeUpdate();
			
			System.out.println("업데이트 성공");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("업데이트 실패");
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	//상세페이지(get) : 레코드 1개 리턴타입usersDTO
	
	public UsersDTO getUsers(UsersDTO dto) {
		UsersDTO users=new UsersDTO();
		
		try {
			conn=JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USERS_GET);
			pstmt.setString(1,dto.getId());
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				users.setId(rs.getString("ID"));
				users.setPassword(rs.getString("PASSWORD"));
				users.setName(rs.getString("NAME"));
				users.setRole(rs.getString("ROLE"));
			}
			System.out.println("users 테이블에서 상세 레코드가 잘 처리 되었습니다.");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("users 테이블에서 상세 레코드가 실패 되었습니다.");
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return users;
	}
	
	
	
	//2.users 테이블의 모든 레코드를 출력 메소드(board에서는 5번)
	public List<UsersDTO> getUsersList(UsersDTO dto){
		System.out.println("getUsersList 메소드 호출 - 유저 리스트 페이지");
		
		List<UsersDTO>usersList = new ArrayList<UsersDTO>();
		
		try {
			conn=JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USERS_LIST);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				UsersDTO users= new UsersDTO();
				
				users.setId(rs.getString("ID"));
				users.setPassword(rs.getString("PASSWORD"));
				users.setName(rs.getString("NAME"));
				users.setRole(rs.getString("ROLE"));
				
				//userslist에 dto 추가
				usersList.add(users);
			}
			System.out.println("usersList에 모든 레코드 읽기 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("userList에 모든 레코드 읽기 실패");
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		
		return usersList;
		
	}
	
	//로그인 처리 메소드
	// USERS_LOGIN = "select * from users where id =? and password =?";
	public UsersDTO login(UsersDTO dto) {
		UsersDTO users = null;
		
		try {
			conn=JDBCUtil.getConnection();
			pstmt=conn.prepareStatement(USERS_LOGIN);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			
			rs=pstmt.executeQuery();
			
			//레코드가 존재할때 
			while(rs.next()) {
				users=new UsersDTO();
				users.setId(rs.getString("ID"));
				users.setName(rs.getNString("NAME"));
				users.setPassword(rs.getString("PASSWORD"));
				users.setRole(rs.getString("ROLE"));
				
				System.out.println("인증 성공 : DB에 해당 ID와 Password가 존재함");
			}
			
			//rs의 값이 존재하면 : 인증 성공
			//rs의 값이 존재하지 않으면 : 인증 실패
			System.out.println("로그인 메소드 잘 작동");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("로그인 처리시 오류 발생");
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return users;
	}
	
	
	

}







