package chapter01;

public class Calc_03 {

	public static void main(String[] args) {
//		시프트 연산자.
//		역시 bit단위의 연산을 수행하지만 오른쪽 또는 왼쪽으로 이동시켜 값에 대한 변화를 준다.
       /*
		int a = 12; //1100
		int b = 2; 
				
		int c = a >> b; //b만큼 오른쪽으로 이동
		System.out.println("c : " + c);
				
		int d = c << b;
		System.out.println("d : " + d);		
				
		char ch = 'F'; //1000110
		int num = 1;
		char ch_result = (char)(ch >> num);
		System.out.println(ch_result);
		//F는 아스키 코드로 70. 인터넷으로 아스키 코드표 보면서 설명 ㄱㄱ
		//시프트 연산으로 1만큼 bit를 이동시키면 35에 해당하는 #이 출력된다.
				
		//시프트 연산을 통해 오른쪽 혹은 왼쪽으로 이동시키면 
		//정보가 잘려나간 곳은 공백으로 표시된다.
		*/
		System.err.println("--------------------------------------");
		
		//	증감 연산자.
		//	1씩 증가시키거나 1씩 감소시키는 연산자.
		//	비교적 쉽다.
		//	선행증감과 후행증감의 차이점만 알아두자

		int a = 10;
		System.out.println("a : " + ++a); //결과 11
				
		int b = 10;
		System.out.println("b : " + b++); //결과 10
		//여기까지 일단 결과 보여주고 아래쪽 System.out.println()써서 확인시켜주자.
				
		//여기서는 값이 증가되어 있다.
		//b++연산을 수행 한뒤 대기하다가 다시 b를 만났을때 증가된 값을 출력했기 때문.
		System.out.println("b++ : " + b); //결과 11

		//이렇게 보면 쓸모 없어보이는 것 같아도 정말 많이 쓰이는 연산자 중 하나.
		//반복문 들어가면 쓸 일 많아진다.

	}

}