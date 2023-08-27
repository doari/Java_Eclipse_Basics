package chapter02;

public class Switch {

	public static void main(String[] args) {
		// Switch ~ case
		
		int n=1;
		
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다.");
			break;
		}
		
		System.out.println("-------------------------------------------");

		String str = "C";
		String result;
		
		switch(str) {
		case"A":
			result="90~100점";
			break;
		case"B":
			result="80~89점";
			break;
		case"C":
			result="70~79점";
			break;
		case"D":
			result="60~69점";
			break;
		default:
			result=("60미만");
			break;
		}//switch
		System.out.println("학점은 : " +result);

	}

}
