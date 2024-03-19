package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 	2 - 10사이의 정수 입력 : 6
	< 1 ~ 100사이의 6의 배수 출력 >
	6  12  18 ... 90 96
	총 XX개
 */
public class HomeworkMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 10사이의 정수 입력 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
		int num = Integer.parseInt(sc.nextLine());
		
		int cnt = 0;
		System.out.println("< 1 ~ 100사이의 " + num + "의배수 출력 >");
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.print(i + "  ");
				++cnt;
			}	
		}
		
		System.out.println();
		System.out.println("총 개수 : " + cnt + "개");
	}
}

