package chapter01;

public class Calc_04 {

	public static void main(String[] args) {
//		삼항 연산자(조건 연산자).
//		하나의 조건을 정의하여 그 조건이 참일 경우 true를, 거짓일 경우 false값을 얻어내기 위한 연산자.
       /*
		int a = 10;
		int b = 15;
		boolean result;		
		result = ++a >= b ? true : false;
		System.out.println("result :" + result);
				
		int n1 = 10;
		int n2 = 20;
		char result2;
		result2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		//삼항연산의 값을 받을 변수의 자료형과 ?뒤의 결과값의 타입이 같아야 한다.
		*/
		System.err.println("--------------------------------------");
		
		//자료형, 연산자 문제
        
		int a = 10;
		int b = 12;
		//++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
		//오류나므로 주석처리 하고 코드 작성없이 결과 도출해 보라 하자

		//풀이
		int a1 = 10;
		int b1 = 12;
		boolean result;
		result = ++a1 >= b1 || 2 + 7 <= b1 && 13 - b1 >= 0 && (a1 += b1) - (b1 % a1) > 10;
		System.out.println(result); 

		//결과 = true
	}

}