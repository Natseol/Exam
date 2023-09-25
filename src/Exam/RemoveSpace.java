package Exam;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주어진 문자열");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		String convertStr = "";
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i]!=' ') {
				convertStr +=strArr[i];
			}
		}
		
		System.out.println(convertStr);
		scanner.close();
	}
}
