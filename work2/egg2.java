package org.opentutorials.javatutorials.work2;

public class egg2 {
	public static void main(String[] args) {
		System.out.println("**싱거운 계란후라이 만들기**");
		String kitchen = "후라이팬, 접시, 냉장고, 포크";
		String fridge = "냉장고"; // 냉장고가 있고
		int egg = 30; // 계란이 30개 있습니다.

		if (fridge.equals("냉장고") && egg >= 1) {// 냉장고의 계란이 1개 이상 있다면
			System.out.println("계란 1개를 꺼내고 냉장고 문을 닫습니다"); // 계란 꺼내기

			boolean exist_fan = true; // 후라이팬을 꺼냅니다. "꺼내는" 동작 자체는 구현하지 못하겠음,,
			if (exist_fan = true)
			{// 후라이팬이 있다면,
				System.out.println("후라이팬을 하이라이트에 올려주세요");
				System.out.printf("기름을 후라이팬에 %dml 둘러줍니다.", 5);
			}
			double oliveoil = 5.0; // 올리브유가 5ml 있다
			System.out.println("\n하이라이트 전원을 켭니다");
			boolean power = true; // 전원을 켠다
			int level = 6; // 불세기를 6으로 설정한다
			if (power = true && level >= 5) {// 전원이 켜졌고 불세기가 5보다 크거나 같다면
				System.out.printf("계란을 %d분 동안 익힙니다", 3);
			} else {
				System.out.println("계란이 없어서 후라이를 못만들어요");
			}
			boolean fried_egg = true; // 계란이 익혀졌습니다!
			int time = 3; // 3분이 지났습니다
			if (fried_egg = true && time >= 3)
			
			{// 3분이 지나고 익은 계란이 있다면
				System.out.println("\n계란이 익혀졌습니다. 전원을 끕니다.");
			}
			int plate = 1; // 접시가 1개 있다
			System.out.println("후라이팬에 있는 익혀진 계란을 담으세요");
			boolean completed_egg = true; // 완성된 계란후라이가 있다
			int fork = 4; // 포크가 4개 있다
			if (completed_egg = true && fork >= 1)

			{// 만약 포크가 1개 이상이고 완성된 계란 후라이가 있다면
				System.out.println("포크를 사용해서 접시에 담긴 계란후라이를 드세요!");
			}
			int egginfridge = 29; // 냉장고에 계란이 29개 있습니다.
			boolean empty_plate = true; // 접시가 비었습니다. 계란이 사라졌습니다.
			int unused_fork = 3; // 안 쓴 포크가 3개 남았습니다.

		} else {
			System.out.println("계란이 없습니다."); // 만약 계란이 없다면, False 라면
		}
	}
	// TODO Auto-generated method stub

}
