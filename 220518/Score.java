// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수는: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수는: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수는: ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3; // 그때그때 계산하는 것보단 변수 선언을 하면 나중에 어느때라도 부를 수 있다

		System.out.println("총점은: " + sum);
		System.out.println("평균점수는: " + avg);
	}
}