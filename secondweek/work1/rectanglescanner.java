package org.opentutorials.javatutorials.secondweek.work1;

import java.util.Scanner;

public class rectanglescanner {

	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);

		System.out.print("크기가 얼마만큼 큰 사각형을 만드실건가요? 숫자로 답해주세요.");
		line = input.nextInt(); //입력값을 int값으로 저장

		for (int i = 0; i < line; i++) { // line 즉 입력값만큼 세로행 길이(하지만 println을 쓰지 않으면
			//줄바꿈이 되지 않아 세로행이 될 수 없다)
			for (int j = 1; j <= 2*line-1; j++) { // 입력값과 출력할 문자개수간의 식이
				 //ㄴ2*line-1이므로(d/t 네모사이 세로 공간이 네모와 비슷하기 때문에)
				// ㄴ입력값이 3일때 5개 출력하게 한다.
				System.out.print("□");
				}
			//TODO 코드 위에 주석 적기
			System.out.println(""); 
			} 
		}
	}		
		
			

