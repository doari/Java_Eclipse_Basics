package chapter01;

public class Promotion_05 {

	public static void main(String[] args) {
		// 큰 자료형에 작은 자료형을 대입하는 것(자동으로 이루어짐)
		   double d = 100.5; //8byte
		   int n = 200; //4byte
		   d = n; // Promotion ,묵시적인 형변환(자동으로 가능)
		   //n=d; //작은 자료형에 큰 자료형은 담을수 없음
		   System.out.println("d = " + d); //결과 : 200.0
		//------------------------------------------------------ ex1
		   char c = 'A'; //2byte
		   long l = 100;//8byte
		   l = c; // Promotion ,묵시적인 형변환
		   //c=1; //작은 자료형에 큰 자료형은 담을수 없음

		   System.out.println("l = " + l); //결과 65
		//------------------------------------------------------ ex2
	}

}
