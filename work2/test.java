package org.opentutorials.javatutorials.work2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**구구단을 외자**");
		System.out.println("문자를 제외한 모든 숫자를 입력하시면 9단까지 계산해드려요!");
		double input; // 1. 유저한테서 받은 입력값(=input) 변수 선언
		input = scan.nextDouble(); // Double로 반환
		
		// 2. if 숫자값이 입력되면, int value 이하 다음을 실행
		String c1;
		c1 = scan.next();
		char c2 = ' ';
		c2 = scan.next().charAt(0);
		scan.close();

		if (c2!= input) { // 2번일 경우 만약 입력값(숫자)와 문자열 c1이 같지 않다면
			int value = 0; // 반복문 초기식 : 변수 값(value) 0을 저장
			while (value < 9) { // 반복문 조건식 : 변수 값(value)가 9보다 작은게 참이라면
				value++; // 반복문 증감식 : value 시작 후 1씩 커지기
				System.out.println(input + "X" + value + "는?");
				System.out.println(input * value); // 입력값(input)과 value를 곱하면?
			}
			scan.close();

		} else {
			System.out.println("숫자만 입력해 주세요.");
		}


	}

}

// TODO Auto-generated method stub
