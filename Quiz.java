package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList num = new ArrayList();
		
		String na, nu;
		
		for(int i = 0; i <= 5 ; i++) {
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		
		System.out.println("번호를 입력하세요");
		int input =sc.nextInt();
		
		if(input == 1) {
			System.out.println("1.연락처 등록: ");
		}else if(input == 2) {
			System.out.println("2.연락처 보기: ");
		}else if(input == 3) {
			System.out.println("3. 연락처 삭제: ");
		}else if(input == 4) {
			System.out.println("4. 모든 연락처 보기: ");
		}else
			System.out.println("종료");
		
		
		
		
		
		

	}
	}
}
