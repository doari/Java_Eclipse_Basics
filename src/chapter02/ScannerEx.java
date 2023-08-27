package chapter02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 키보드의 값을 입력 받기 위한 Scanner class
		System.out.print("정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("n= :"+n);
				
		
		System.out.println("---------------------------------");

		System.out.print("문자열를 입력하세요 : ");
		Scanner scan2=new Scanner(System.in);
		String str1=scan2.next();
		System.out.println("str1= :"+str1);
		
		
		System.out.println("---------------------------------");
		
		System.out.print("문자열를 입력하세요 : ");
		Scanner scan3=new Scanner(System.in);
		String str2=scan3.nextLine();
		System.out.println("str2= :"+str2);
			
				
		
	}

}
