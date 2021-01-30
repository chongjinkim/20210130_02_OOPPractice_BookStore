package codes;

public class User {

	// 멤버변수에 값 대입을 안할 경우에는, 기본값 대임
	// ex) String - null, int - 0, boolean - false;

	String name = "미입력";
	int birthYear = 0; // 생년이 0이면 미입력으로 간주를 한다.
	int point = 0;// 기본값은 충전 포인트 없는 상태. 0원

	// 기능 1. 사용자 기본 정보 출력
	// 결과자료형 : 없음,
	// 이름 : printUserInfo
	// 실행 시 필요한 재료? 없다.

	void printUserInfo() {
		// 출력형태
		// ========사용자정보========//
		// 이름 : 김종진
		// 나이 : 31세(2021년 기준)
		// 보유 포인트 : 10000P
		// ========================

		System.out.println("=======사용자정보======");
		System.out.println("이름 : " + name);
		//나이는 따로 계산하지 않고, 클래스에 만들어둔 메쏘드 활용
		System.out.println("나이 : " + getKoreanAge(2021) +"세");
		System.out.println("보유 포인트 : " + point + "P");
		System.out.println("====================");

	}

	// 기능 2. 사용자의 나이 계산 기능.
	// 결과자료형 : int
	// 이름 : getKoreanAge
	// 실행 시 필요한 재료? 몇년도에 대한 나이가 궁금한지, 년도를 받아서 계산,

	int getKoreanAge(int year) {

		int myAge = year - birthYear + 1;

		// 계산 결과를 이 메쏘드의 결과로 지정

		return myAge;
	}

}
