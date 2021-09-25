package org.opentutorials.javatutorials.secondweek.work1;

import java.util.Scanner;

public class memo2 {

	public static void main(String[] args) {

		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("크기가 얼마만큼 큰 하트를 만드실건가요? 숫자로 답해주세요.");
		line = input.nextInt();

		for (int i = 0; i < line; i++) 
		for (int j = 0; j%2==0; j++) {
		System.out.print("*"); 	}
			System.out.println("+");
		}
	}
