package Exam;

class Function {
	public static int findCharIndex(String str, char targetChar) {
		char[] strArr = str.toCharArray();
		int num = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i]==targetChar) {
				num = i ;
				break;
			}
		}		
		return num;
	}
	
	public static int countWords(String str) {
		String[] strArr = str.split("\s+");		
		return strArr.length;
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2 ; i<num; i++) {
			if (num%i==0) {				
				return false;
			}
		}
		return true;
	}
	
	public static int calculateDigitSum(int num) {
		int convertNum = num;
		int result = 0;
		
		while (convertNum>0) {
			result += convertNum%10;
			convertNum=convertNum/10;			
		}
		
		return result;
	}
}

public class FunctionMake {
	public static void main(String[] args) {
		String str = "I am a boy";
		char c = 'm';
		System.out.println(Function.findCharIndex(str, c));
		
		System.out.println(Function.countWords(str));

		int num = 113;
		System.out.println(Function.isPrime(num));
		
		System.out.println(Function.calculateDigitSum(num));
	}
}
