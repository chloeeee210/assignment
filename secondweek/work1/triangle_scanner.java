package org.opentutorials.javatutorials.secondweek.work1;

import java.util.Scanner;

public class triangle_scanner {

	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("크기가 얼마만큼 큰 삼각형을 만드실건가요? 숫자로 답해주세요.");
		line = input.nextInt(); // 입력값을 정수형으로 저장

		for (int i = 0; i < line; i++) { //i가 0이고 입력값까지 세로 행을 출력(출력문이 println이기 때문에)
			for (int j = line; j > i; j--) { // 입력값(line)까지만 공백을 출력한다 하지만 반복문이 재실행될수록 공백이 출력되는 수는 줄어듦(j--)
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) { // 두 번째 반복문을 끝내고 실행되는 반복문. 이때 j<i인 이유는 *값이 1,2,3 차례대로 1씩 커져야 하기 때문이다.  
				System.out.print("* ");
				
			}
			System.out.println("");
		}
	}
}
