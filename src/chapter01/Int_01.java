package chapter01;

public class Int_01 {

	public static void main(String[] args) {
		
		//byte b = 128; //byte자료형의 표현범위를 벗어나므로 오류가 난다.(-128~127)

		byte b = 127;
		short s = 32767;
		int n = 550;

		System.out.println("b = " + b); //결과 127
		System.out.println("s = " + s); //결과 32767
		System.out.println("n = " + n); //결과 550
		//----------------------------------------------------
		byte b1 =100;
		byte b2 =20;
		
		//byte b3 =b1+b2; // 오류
		int b3 =b1+b2; //
		System.out.println("b3 = " + b3); //결과 120
		
		byte b4 =100;
		byte b5 =90;
		byte b6 =(byte)(b4+b5);
		System.out.println("b6 = " + b6); //결과 -66 => 127이상이므로 오버클럭
	}

}
