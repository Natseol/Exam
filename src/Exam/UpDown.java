package Exam;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int comNumber = (int)(Math.random()*1000);
		int count=11;		

		while (count-->1) {
			System.out.println("남은 횟수:"+count);
			int inputNum = scanner.nextInt();
			
			if (comNumber > inputNum) {
				System.out.println("큰 수 입니다");
			}
			else if (comNumber < inputNum) {
				System.out.println("작은 수 입니다");
			}
			else {
				System.out.println("정답입니다");
				break;
			}

			if (count==1) {
				System.out.println("재시작 하시겠습니까? (1:도전, 다른입력:포기)");
				inputNum = scanner.nextInt();
				if (inputNum==1) {
					comNumber = (int)(Math.random()*1000);
					count=11;
				}
			}
		}
		scanner.close();
	}
}
