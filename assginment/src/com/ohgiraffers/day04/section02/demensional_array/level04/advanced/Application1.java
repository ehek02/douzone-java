package com.ohgiraffers.day04.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
		 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 * 
		 * -- 출력 예시 --
		 * ================== A반 성적표 ====================
         * 이름        국어          영어          수학          합계            평균
         * -----------------------------------------------
         * 홍길동       80      90       77      247     82.3
         * 이순신       78      97       86      261     87.0
         * 유관순       71      68       88      227     75.7
         * -----------------------------------------------
         * 합계        229     255      251      735     81.7
		 * */

		String[][] arr = new String[3][4];
		arr[0] = new String[]{"홍길동", "80", "90", "77"}; // 홍길동
		arr[1] = new String[]{"이순신", "78", "97", "86"}; // 이순신
		arr[2] = new String[]{"유관순", "71", "68", "88"}; // 유관순
		int sum = 0;
		int sumsum = 0;

		System.out.println("======= A반 성적표 ========");
		System.out.println("이름 " + "국어 " + "영어 " + "수학 " + "합계 " + "평균 ");
		System.out.println("-------------------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j > 0) {
					sum += Integer.parseInt(arr[i][j]);
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(sum + " " + sum / (float)(arr[i].length-1));
			sum = 0;
		}

		System.out.print("-------------------------\n합계 ");
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum += Integer.parseInt(arr[j][i]);
				if (j == arr.length - 1) {
					sumsum += sum;
					System.out.print(sum + " ");
				}
			}
			sum = 0;
		}
		System.out.println(sumsum + " " + (float) sumsum / (arr.length*3));

	}
}
