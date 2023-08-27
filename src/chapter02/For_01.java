package chapter02;

public class For_01 {

	public static void main(String[] args) {
		for(int i=0; i<=3;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n------------------------------");

		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n------------------------------");
		
		for(int i=10; i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println("\n------------------------------");
		
		for(int i=1; i<=10;i++) {
			if(i%3==0) {
			System.out.print(i+"는(은)3의 배수 입니다. ");
			}
		}
		System.out.println("\n------------------------------");
		//보너스 난수 발생
		int ramdom=new Ramdom().nextInt(8)+2;
		
		for(int i=1; i<=9;i++) {
			System.out.println(ramdom+" * "+i+" = "+(ramdom*i));
		}
		
	}

}
