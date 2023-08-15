package chapter01;

public class Char_04 {

	public static void main(String[] args) {
		
		char ch = 'A'; //문자형은 홑따옴표 안에 넣어야 하며 한글자이상 넣을 수 없다.
		System.out.println("ch = " + ch); //결과 : A

		char ch2 = '\u0041'; //문자열이 들어간 것 같지만, 유니코드로 A를 의미하는 한글자가 들어간 것.
		System.out.println("ch2 = " + ch2); //결과 : A

		char ch3 = 65 + 1; //아스키코드 65에 + 1
		System.out.println("ch3 = " + ch3); //결과 : B
	}

}
