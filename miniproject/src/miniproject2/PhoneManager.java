package miniproject2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PhoneManager {
	private List<Phone> phones; //Phone 객체의 리스트로 전화번호 목록 저장
	// 프로젝트의 작업 디렉토리 경로
	private static String rootPath = System.getProperty("user.dir") + File.separator ; // 프로젝트의 작업 디렉토리 경로
    private static String FILE_PATH = rootPath + "PhoneDB.txt"; // 전화번호 데이터를 저장할 파일의 전체 경로
    String filePath = "files/PhoneDB.txt";
	
	
	//생성자-파일에서 전화번호 목록 로드
	public PhoneManager() {
		this.phones = loadPhones(); // 시작할때 전화번호 목록 로드
	}
	
	//파일로부터 전화번호 목록을 로드하는 메소드
	private List<Phone> loadPhones(){
		List<Phone> phoneList = new ArrayList<>();
		File file = new File(FILE_PATH);
		if (!file.exists()) {
			System.err.println("파일이 존재하지 않습니다." + FILE_PATH);
			return phoneList;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) { // 파일의 끝까지 한 줄씩 읽음
				String[] data = line.split(","); // 쉼표로 구분된 데이터 파싱
				if(data.length ==3) {	// 정확하게 3개의 데이터 요소가 있는지 확인
					phoneList.add(new Phone(data[0], data[1], data[2])); // Phone 객체 생성 및 추가
				}else {
					System.err.println("데이터 형식 오류:" + line);
				}
			}
		} catch (IOException e) {
			System.err.println("파일을 읽을 수 없습니다.:" + e.getMessage());
		}
		return phoneList;
	}
	
	// 전화번호 목록을 파일에 저장하는 메서드
	public void savePhone() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
			for (Phone phone : phones) {
				bw.write(phone.toString()); // Phone 객체를 문자열로 변환하여 파일에 쓰
				bw.newLine(); 
			}
		} catch (IOException e ) {
			System.err.println("파일쓰기 오류 : " + e.getMessage());
		}
	}
	
	// 전화번호 추가 메서드
	public void addPhone(String name, String mobile, String office) {
		phones.add(new Phone(name, mobile, office)); // 새 Phone 객체를 리스트에 추가
		savePhone(); // 변경사항을 파일에 즉시 저장
	}
	
	// 전화번호 삭제 메서드
	public void deletePhone(int no) {
		phones.removeIf(phone -> phone.getNo() == no); // 일치하는 전화번호 삭제
		savePhone(); //변경사항을 파일에 즉시 저장
	}
	
	// 키워드로 전화번호 검색하는 메서드
	public List<Phone> serchPhones(String keyword){
		return phones.stream()
				.filter(phone -> phone.getName().contains(keyword)) //이름에 키워드 포함된 전화번호 필터링
				.collect(Collectors.toList()); // 결과를 리스트로 수집
	}
	
	// 전체 전화번호 목록 반환하는 메서드
	public List<Phone> getPhones(){
		return phones;
	}

}
