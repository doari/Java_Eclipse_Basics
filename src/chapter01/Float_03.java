package chapter01;

public class Float_03 {

	public static void main(String[] args) {
		//float f = 3.14; //java에서 실수는 기본적으로 double형으로 인식하기 때문에 float자료형을 	      
		//사용한다는 것을 명시해줘야 한다. (3.14f)

		float f1, f2;
		f1 = 3.14f;
		f2 = 150; //실수에도 정수 대입이 가능. 실수에 정수를 대입하면 자동 실수화 됨. 결과보자
		
		double d=121.2;//8byte
		
		System.out.println("f1 = " + f1); //결과 3.14 
		System.out.println("f2 = " + f2); //결과 150.0
		System.out.println("d = " + d); //결과 121.2

	}

}
