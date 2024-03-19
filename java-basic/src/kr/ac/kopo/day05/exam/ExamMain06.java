package kr.ac.kopo.day05.exam;

/*
 		*
 		**
 		***
 		****
 		*****
 		****
 		***
 		**
 		*
 */

public class ExamMain06 {

	public static void main(String[] args) {

		int nStar = 1;
		
		for(int i = 1 ; i <= 9; i++) {
			for(int j = 1; j <= nStar; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i < 5) {
				nStar++;
			} else {
				nStar--;
			}
		}
	}
}










