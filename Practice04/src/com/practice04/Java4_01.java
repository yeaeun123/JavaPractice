package com.practice04;

public class Java4_01 {

	public static void main(String[] args) {
		// Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로 확인
		
	
				
				int[] intArray = new int[5];
						
				intArray[0] = 3;
				intArray[1] = 7;
				intArray[2] = 12;
				
				
				int result = 0;
				
				for(int i =0; i< intArray.length; i++) { //length는 length-1이기 때문에 같다는 기호를 빼준다.
					result = result +intArray[i];
				}
				System.out.println(result);
				
			
		}
	
}
