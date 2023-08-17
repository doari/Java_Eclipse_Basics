package chapter01;

public class Calc_02 {

	public static void main(String[] args) {
		
		//논리 연산자.
		//비교 연산자를 통한 연산이 2개 이상 필요할 때 사용한다.

		int myAge = 30;
		int limit = 35;

		//&&은 앞쪽의 연산이 false일때 뒤쪽연산을 수행하지 않고 넘어간다.
		//&&는and의 뜻. '~하고'라는 의미로 이해하면 도움이 된다. 
		//둘 다 참일때만 참
		boolean result = (limit - myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과: " + result);


		int n1 = 10;
		int n2 = 20;
		//||은앞쪽의연산이false여도 뒤쪽연산을수행한다.
		//||는or의 뜻. '~거나'라는의미로이해하면도움이된다. 
		//한쪽만 참이어도 참
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("||연산결과: " + result2);

		//! 는not의 뜻. true는 false로, false는 true로 바꿔서나타낸다.
		System.out.println("!연산결과: " + !result2);
		
		System.err.println("------------------------------------");
		
//		비트 연산자.
//		논리 연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
//		일반적으로 다음에 배울 시프트 연산자와 더불어 암호화, 복호화 작업에 사용되며.
		

		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //논리곱(and) - 2진수로바꿨을 때 두값이모두1 일때만결과가1. 나머지는0
		System.out.println("c : " + c);

		int a2 = 12;
		int b2 = 8;
		int c2 = a2 | b2; //논리합(or) - 2진수로바꿨을 때 두값이모두0일때만결과가0. 나머지는1
		System.out.println("c2 : " + c2);

		int a3 = 9;
		int b3 = 11;
		int c3 = a3 ^ b3; //배타적or(xor) - 2진수로바꿨을때 두값이 서로같을때는0.서로다를때는1
		System.out.println("c3 : " + c3);  

	}

}