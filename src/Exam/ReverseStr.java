package Exam;

import java.util.Scanner;

public class ReverseStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주어진 문자열");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		String reverseStr="";
		
		for (int i = strArr.length-1; i >= 0 ; i--) {
			reverseStr+=strArr[i];
		}

		System.out.println(reverseStr);
		scanner.close();
	}
}
