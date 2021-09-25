package org.opentutorials.javatutorials.secondweek.work1;

public class trianglearrayloop {

	public static void main(String[] args) {
		String[][] array = {
                {" "," "," ","*"," "," "," "}, //문자로 삼각형 모양 만들기
                {" "," ","*"," ","*"," "," "},
                {" ","*"," ","*"," ","*"," "} 
                };
	
                
                
		 for (int i = 0; i < array.length; i++) { // 배열의 길이만큼 세로(줄바꿈)가 만들어짐
	            for (int j = 0; j < array[0].length; j++) { // 인덱스가 0으로 고정된 가로(*)가 만들어짐
	                System.out.print(array[i][j]); // 가로X세로 배열을 출력
	            }
	            System.out.println(); // 세로 길이만큼 줄바꿈
          
					}
	

// TODO Auto-generated method stub

	}
}
