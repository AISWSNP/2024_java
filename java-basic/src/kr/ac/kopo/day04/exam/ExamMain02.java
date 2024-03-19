package kr.ac.kopo.day04.exam;

/*
 	12345
 	23456
 	34567
 	45678
 	56789
 */

public class ExamMain02 {

	public static void main(String[] args) {
		
		// 방법2
		for(int i = 1; i <= 5; i++) {
			// j가 반복할 개수를 의미
			for(int j = 1; j <= 5; j++) {
				System.out.print(i + j - 1);
			}
			System.out.println();
		}
		
		/*
		// 방법1
		for(int i = 1; i <= 5; i++) {
			// j가 출력할 정수를 의미
			for(int j = i; j <= i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
	}
}
