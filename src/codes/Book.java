package codes;

public class Book {
	
	String title = "미입력";
	int limitAge = 0;//0이면 전체 이용가로 취급
	int rentFee = 500;
	
	User rentUser = null;//책을 빌려간 사람은 처음에는 없다고 명시를 한다.

}
