package Exam;

import java.util.Scanner;

public class CaseReverseStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("주어진 문자열");
		String str = scanner.nextLine();
		char[] strArr = str.toCharArray();
		String convertStr = "";
		
		//대문자 65~90, 소문자 97~122
		for (int i = 0; i < strArr.length; i++) {
			if ((int)strArr[i]>=65&&(int)strArr[i]<=90) {
				convertStr += (char)((int)strArr[i]+32);
			} else if ((int)strArr[i]>=97&&(int)strArr[i]<=122) {
				convertStr += (char)((int)strArr[i]-32);
			} else {
				convertStr += strArr[i];
			}
		}		
		
		System.out.println(convertStr);		
		scanner.close();
	}
}
