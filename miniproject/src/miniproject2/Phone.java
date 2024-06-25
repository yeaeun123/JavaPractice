package miniproject2;

public class Phone {
	private String name;
	private String mobile;
	private String office;
	private static int lastNo = 0; // 마지막으로 할당된 고유 번호를 추적
	private int no; // 개별 전화번호의 고유번호
	
	
	public Phone(String name, String mobile, String office) {
		
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.no = ++lastNo; // 고유 번호를 자동으로 증가시켜 할당
	}


	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}


	@Override
	public String toString() {
		return String.format("%s, %s, %s", name, mobile, office); 
	} // 전화번호 정보를 쉼표로 구분된 문자열로 포맷하여 반환
	



	

}
