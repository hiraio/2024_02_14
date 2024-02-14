package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {

	public static final int MENU_QUIT = 0; // 종료
	public static final int MENU_INSERT = 1; // 등록
	public static final int MENU_SELECT_ALL = 2; // 전체 검색
	public static final int MENU_SELECT = 3; // 상세 검색
	public static final int MENU_UPDATE = 4; // 수정
	public static final int MAX = 100; // 연락처 최대 저장 개수

	// 연락처 저장 배열
	public static Contact[] contactList = new Contact[MAX];
	public static int count = 0; // 배열에 데이터를 저장하면 증가

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			int select = sc.nextInt();
			Contact c1 = new Contact();
			c1.displayInfo();
			switch (select) {
			case MENU_INSERT:

				System.out.println("-----------");
				System.out.println("연락처 등록 메뉴");
				System.out.println("-----------");
				System.out.println("이름 입력>");
				String name = sc.next();
				

				System.out.println("전화번호 입력>");
				String phone = sc.next();
				c1.setPhone(phone);
				
				System.out.println("이메일 입력>");
				String email = sc.next();
				c1.setEmail(email);
				
				System.out.println("연락처 등록 완료!");
				contactList[count] = c1;
				
				count++;
				break;
				
			  	
				
			case MENU_SELECT_ALL:

				System.out.println("연락처 개수 : " + count);
				for(int i=0; i < count; i++) {
					System.out.println(contactList[i].toString());
				}
			
				break;

			case MENU_SELECT:
				System.out.println("검색할 인덱스 입력> ");
				int num = sc.nextInt();
				System.out.println(contactList[num]);
				c1.displayInfo();
				
				break;
			
			case MENU_UPDATE:
				System.out.println("수정할 인덱스 입력>");
				int num1 = sc.nextInt();
				System.out.println("이름 입력>");

				String name1 = sc.next();
				c1.setName(name1);
				System.out.println("전화번호 입력>");
				String phone1 = sc.next();
				c1.setPhone(phone1);
				System.out.println("이메일 입력>");
				String email1 = sc.next();
				c1.setEmail(email1);
				contactList[num1] = c1;
				System.out.println("연락처 수정 완료!");
			
				break;
				
			case MENU_QUIT:
				run = false;
				System.out.println("종료합니다");
				break;
			
			default:
				break;
				
			
			}
		
		}

	} // end main()

} // end contactMain01
