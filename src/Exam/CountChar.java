package Exam;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주어진 문자열");
		String firstStr = scanner.nextLine();
		char[] firstArr = firstStr.toCharArray();


		char secondChar=0;
		int secondStrLengh=0;
		while(secondStrLengh!=1) {
			System.out.println("특정 문자");
			String secondStr = scanner.nextLine();
			char[] secondArr = secondStr.toCharArray();
			secondStrLengh=secondArr.length;
			secondChar=secondArr[0];
		}

		int count=0;
		for (int i = 0; i < firstArr.length; i++) {
			if(firstArr[i]==secondChar) {
				count++;
			}
		}

		System.out.println(count);		
		scanner.close();
	}
}
