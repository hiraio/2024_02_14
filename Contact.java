package edu.java.contact01;

// 데이터 클래스(이름, 전화번호, 이메일)
public class Contact {
	// 멤버 변수(필드, 프로퍼티)
	private String name;
	private String phone;
	private String email;
	
	// 기본 생성자
	public Contact() {}

	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}




