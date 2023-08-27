package chapter02;

public class If_02 {

	public static void main(String[] args) {
		// if~else
		int n =49;
		String str=null;
		
		if(++n >=50) {
			str="n은 50이상인 수";
		}else {
			str="n은 50미만의 수";
		}
		System.out.println(str);
		System.out.println("-----------------------------------------------");
		/*
		변수 age에 나이를 대입하고,30세 이상이면
		"드실만큼 드셨네요",그렇지 않으면 "더 드세요"를 출력하는 if문을 구현 한 후
		마지막으로 "감사합니다"라는 문자을 출력해보자.
		*/
		int age =31;
		
		
		if(age >=30) {
			str="드실만큼 드셨네요";
		}else {
			str="더 드세요";
		}
		System.out.println(str+ "~. 감사합니다");
		
		System.out.println("-----------------------------------------------");
		
		int num=85;
		String grade=null;
		
		if(num>=90)
			grade="A";
		else if(num>=80)
			grade="B";
		else if(num>=70)
			grade="C";	
		else if(num>=60)
			grade="D";
		else grade="F";
		System.out.println("당신의 학점은 : "+ grade);

	}

}
