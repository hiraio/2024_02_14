package edu.java.contact01;

// 데이터 클래스(이름, 전화번호, 이메일)
public class Contact {
	// 멤버 변수

	private String name;
	private String phone;
	private String email;
	// 기본 생성자
	public Contact() {
		
	}
	
	// 매개변수 생성자
	public Contact( String name, String phone, String email) {
		
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	// getter/setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String i) {
		this.phone = i;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString()
	public String toString() {
		return "Contact [ name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	public void displayInfo() {
		System.out.println("---------------------------------------");
		System.out.println("1. 등록|2. 전체검색 |3. 상세검색|4. 수정| 0.종료");
		System.out.println("---------------------------------------");
		}
	
} // end Contact 
