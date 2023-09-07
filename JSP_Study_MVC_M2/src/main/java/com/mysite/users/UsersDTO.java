package com.mysite.users;

public class UsersDTO {

	private String id;
	private String password;
	private String name;
	private String role;
	
	//기본 생성자
	
	public UsersDTO() {}
	
	//getter/setter
	
	public String getId() {
		return id;
	}
	public void setId(String i) {
		this.id=i;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role=role;
	}
	
	//toString 오버라이딩 객체 자체를 출력시 필드의 내용을 출력
	
	@Override
	public String toString() {
		return "UsersDTO [id=" + id + ", password = "+ password +", name = " + name + ", role = " + role + "]";
	}
	
	
	
	
	
	
}
