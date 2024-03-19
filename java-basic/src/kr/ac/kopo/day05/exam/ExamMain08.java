package kr.ac.kopo.day05.exam;

/*
 	----*----
 	---***---
 	--*****--
 	-*******-
 	*********
 	-*******-
 	--*****--
 	---***---
 	----*----
 */
public class ExamMain08 {

	public static void main(String[] args) {
		int nSpace = 4;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= nSpace || j >= 10-nSpace) {
					System.out.print('-'); 
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i < 5)
				nSpace--;
			else
				nSpace++;
		}
		
		/*
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5-i; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= 2*i-1; j++) {
					System.out.print('*');
				}
			} else {
				for(int j = 1; j <= i-5; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= 2*(10-i)-1; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		*/
	}
}













