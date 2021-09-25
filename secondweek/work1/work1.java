package org.opentutorials.javatutorials.secondweek.work1;

import java.util.Scanner;

public class work1 {
 //TODO 실수입력받을때 메세지 뜨게 만들기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**구구단을 외자**");
		System.out.println("정수를 입력하면 9단까지 출력해드려요!");

		int input; // 1. 유저한테서 받은 입력값(=input) 변수 선언
		input = scan.nextInt(); // 입력값 저장

		int value = 0; // 반복문 초기식 : 변수 값(value) 0을 저장 = 0부터 시작해서
		while (value < 9) { // 반복문 조건식 : 변수 값(value)가 9보다 작은게 참이라면
			value++; // 반복문 증감식 : value 시작 후 1씩 커지기
			int final_value = input * value;
			System.out.println(input + "X" + value + "는?");
			// int correct = (int) final_value; //Double-> Int로 형변환

			System.out.println("=" + final_value); // 입력값(input)과 value를 곱한 결과값

		}

	}
}

// TODO Auto-generated method stub