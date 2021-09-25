package org.opentutorials.javatutorials.secondweek.work1;

public class looponlytriangle {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) { // (반복문1)i=0부터 3까지 참이므로 아래 반복문을 4번 실행
			for (int j = 3; j > i; j--) { // (반복문2) j가 3부터 1씩 줄어들고 i=0일때 참이어서 두번째 반복문으로 넘어온 것이고
				// 3>0, 2>0, 1>0 총 세 번 반복되고 0>0일때 거짓이므로 j의 4번째 값 0일때 이 반복문은 종료되어 blank를 세 개 출력 후 세 번째 반복문으로 넘어간다.
				// 그 후 i=1일때 i의 값이 1로 커졌고 j는 점점 감소하는 값이므로 2번 반복하게 된다.
				// i = 2일때 j는 3인 경우에만 참이므로 반복문이 1번만 실행되어  공백을 1개 출력하고 다음 반복문1이 반복될 때 i는 3이상이므로
				// 반복문2는 무조건 거짓이 되어 종료되고 어떠한 값도 출력하지 않는다.
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) { //반복문 2를 실행하고나서 i = 0일때 0<0으로 거짓이므로 반복문이 종료된다.
										// 반복문2를 실행 후 i = 1로 0<1이므로 반복문이 한 번 실행된 후 다음 루프 시 j가 1로 커지므로
				// *(출력값)이 1개만 출력되고 종료된다.
				System.out.print("* ");
			}
			System.out.println(""); // (반복문1)이 참일때 줄바꿈 즉 4개의 행이 있는 도형이 그려짐
		}
	}
}
