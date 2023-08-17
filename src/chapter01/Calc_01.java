package chapter01;

public class Calc_01 {

	public static void main(String[] args) {
		//산술 연산자는 4칙연산과 나머지 값을 구하는 연산자로 나뉜다.
		/*
		int n1, n2, n3;
		n1 = 20; //n1에20을대입
		n2 = 7; //n2에7을대입
		n3 = n1 + n2; //n1 + n2의값을n3에대입
		System.out.println("n3 = " + n3); //결과27

		n3 = n1 - n2;
		System.out.println("n3 = " + n3); //결과 13

		n3 = n1 / n2;
		System.out.println("n3 = " + n3); //결과 2 - 몫 출력

		n3 = n1 % n2;
		System.out.println("n3 = " + n3); //결과 6 - 나머지 출력
		
		System.err.println("---------------------------------");
		*/
		System.err.println("---------------------------------");
		//대입 연산자.
		//앞에서 많이 사용했듯이 특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자.

		int n1 = 10; //n1이라는 int형 변수에 10이라는 정수를 대입함.
		int n2 = 7;
		System.out.println("=연산자: n1 = " + n1 + ", n2 = " + n2);

		int n3 = 13;
		int n4 = 15;
		System.out.println("+=연산자: n3 += n4 = " + (n3 += n4)); //n3 = n3 + n4을 줄여서 씀
        
		int n5 = 10;
		int n6 = 3;
		System.out.println("/=연산자: n5 /= n6 = " + (n5 /= n6)); //n5 = n5 / n6를 줄여서 씀
		
	}

}
