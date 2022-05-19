// 101쪽 2번(나눈 몫과 나머지) - 큰 수를 먼저 입력하겠습니다~~
// 두 개의 정수를 입력받아서, 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("0보다 큰 정수를 적으세요.");
		int m = input.nextInt();
		System.out.print("앞에 적은 수보다 작은 정수를 적으세요.");
		int s = input.nextInt();
		int quotient = m / s;
		int remainder = m % s;
		
		System.out.print(m +"을 " + s + "로 나눈 몫은 " + quotient + "이고 나머지는 " + remainder + "입니다.");
		// System.out.prinf("%d을 %d로 나눈 몫은 %d이고 나머지는 %d"입니다."
		//                   , m, s, quotient, remainder);
	}
}

/* public class DivMod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int large = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		int small = scan.nextInt();
		
		System.out.println(large +"을 " + small + "로 나눈 몫은 "
		                + (large / small) + "이고 나머지는 "
						+ (large % small) + "입니다."); 구분을 위해서 스페이스로 띄워놓은 공간은 엔터로 줄바꿈을 해도 괜찮지만,
						                               "" 사이의 공간을 엔터로 띄우면 인식을 하지 못해서 에러가 난다
													   숫자만 그때그때 바꿀 수 있는 이런 문자열은 서식이라고 한다
													   
		System.out.printf("Hello World"); // 포맷티드의 약자인 f가 붙은 printf는 서식이 있는 문자열을 출력하는 메소드로 줄바꿈은 일어나지 않는다
		                                  // 줄바꿈을 넣고 싶다면 \n 이라는 줄바꿈 대행문자를 넣어주면 줄바꿈이 일어난다
		System.out.printf("Hello World%d \n, 1"); 서식 문자중에 %d는 정수 하나가 올거라고 위치를 지정해주는 문자로 ,뒤에 무슨 숫자가 올 것인지 나열
		System.out.printf("%dHello %dWorld%d, 2, 3, 4"); 어느 숫자를 넣을 것인지 쉼표로 구분하여 하나씩 나열
		// %d와 \n 사이의 공간은 붙여도 인식된다 정수 여러개를 표현하기 위해 %d%d%d 표현도 가능하다
		// println은 ,기능이 없기 때문에 서식 있는 문자열은 표현 불가능
	}
} */