package miniproject1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneManager {
	 private List<Phone> phoneList;
	    private static String rootPath = System.getProperty("user.dir") + File.separator; // 프로젝트의 작업 디렉토리 경로
	    private static String FILE_PATH = rootPath + "PhoneDB.txt"; // 전화번호 데이터를 저장할 파일의 전체 경로
	    final String filePath = "PhoneDB.txt";

    public PhoneManager() {
        this.phoneList = new ArrayList<>();
        load(); // 파일에서 데이터 불러오기
    }

    public void displayList() {
        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println((i + 1) + ". " + phoneList.get(i));
        }
    }

    public void addEntry(String name, String hp, String companyNumber) {
        Phone phone = new Phone(name, hp, companyNumber);
        phoneList.add(phone);
        save(); // 파일에 데이터 저장
    }

    public void deleteEntry(int index) {
        if (index >= 0 && index < phoneList.size()) {
            phoneList.remove(index);
            save(); // 파일에 데이터 저장
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }

    public void searchEntry(String name) {
        boolean found = false;
        for (Phone phone : phoneList) {
            if (phone.getName().equals(name)) {
                System.out.println(phone);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    private void load() {
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            phoneList.clear(); // 기존 데이터를 지우고 새로 불러옴
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String name = data[0].trim();
                String hp = data[1].trim();
                String companyNumber = data[2].trim();
                Phone phone = new Phone(name, hp, companyNumber);
                phoneList.add(phone);
            }
        } catch (IOException e) {
            // 파일이 없을 경우 무시
        	  System.err.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            for (Phone phone : phoneList) {
                writer.write(phone + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
