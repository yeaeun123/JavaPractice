package miniproject1;

import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		
		 PhoneManager manager = new PhoneManager();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("***************************************************");
	        System.out.println("*             전화번호 관리 프로그램              *");
	        System.out.println("1. 리스트   2. 등록   3. 삭제  4. 검색   5.종료");

	        while (true) {
	            System.out.print("> 메뉴번호: ");
	            int menu = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (menu) {
	                case 1:
	                    System.out.println("[전체 리스트]");
	                    manager.displayList();
	                    break;
	                case 2:
	                    System.out.print("이름: ");
	                    String name = scanner.nextLine();
	                    System.out.print("휴대전화: ");
	                    String hp = scanner.nextLine();
	                    System.out.print("회사번호: ");
	                    String companyNumber = scanner.nextLine();
	                    manager.addEntry(name, hp, companyNumber);
	                    System.out.println("등록되었습니다.");
	                    break;
	                case 3:
	                    System.out.print("삭제할 메뉴번호: ");
	                    int index = scanner.nextInt() - 1;
	                    manager.deleteEntry(index);
	                    break;
	                case 4:
	                    System.out.print("검색할 이름: ");
	                    String searchName = scanner.nextLine();
	                    manager.searchEntry(searchName);
	                    break;
	                case 5:
	                    System.out.println("***************************");
	                    System.out.println("***       감사합니다.   ***");
	                    System.out.println("***************************");
	                    System.exit(0);
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	                    
	            }
	        } 
	    }
	

	}


