package chapter01;

public class Demotion_06 {

	public static void main(String[] args) {
		// 작은 자료형에 큰 자료형을 대입하는 것(자동으로 이루어지지 않음)
		   char c = 'B'; //2byte
		   int num1 = c + 1; //여기까지는 프로모션 캐스팅
		   //c = n; //c는 2byte, n은 4byte이므로 오류 발생   
		   c = (char)num1; //이렇게 수정=>명시적인 형변환
		   System.out.println("c = " + c);
		//------------------------------------------------------ ex1
		   float f = 5.5f;
		   int num2 = 0;//이렇게 수정=>명시적인 형변환
		   num2 = (int)f; //같은 4byte여도 자료형이 일치하지 않으면 대입되지 않음. 고로 캐스팅
		   System.out.println("n = " + num2);
		//결과는 5 인데, float에서 int로 캐스팅되면서 소수점 이하 자리를 상실함
		//------------------------------------------------------ ex2
	}

}
