package Exam;

import java.util.TreeSet;

public class FindCommon {
	public static void main(String[] args) {

		int[] arr1 = {1,3,4,5};
		int[] arr2 = {3,4,6,10};
		int[] arr3 = {6,20,20};
		
		findCommonItem(arr1, arr2, arr3);
	}
	
	static void findCommonItem(int[] arr1, int[] arr2, int[] arr3) {
		int[][] arrAll = {arr1, arr2, arr3};
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for (int i = 0; i < arrAll.length; i++) {
			for (int j = 0; j < arrAll[i].length; j++) {
				for (int k =0; k < arrAll.length-1; k++) {
					if (k==i) k++;
					for (int l=0; l <arrAll[k].length; l++) {
						if(arrAll[i][j]==arrAll[k][l]) {
							treeSet.add(arrAll[k][l]);
						}
					}					
				}				
			}		
		}
		
		treeSet.forEach((n)->System.out.println(n));		
	}
	
}
