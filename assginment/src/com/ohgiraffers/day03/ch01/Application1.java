package com.ohgiraffers.day03.ch01;

public class Application1 {

	public static void main(String[] args) {
		
		/* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
		 * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 더하기 결과  : 50
		 * 빼기 결과 : -10
		 * 곱하기 결과 : 600
		 * 나누기한 몫 : 0
		 * 나누기한 나머지 : 20
		 * */

		int firstNumber = 20;
		int secondNumber = 30;

		System.out.println("더하기 결과 : " + (firstNumber+secondNumber));
		System.out.println("빼기 결과 : " + (firstNumber-secondNumber));
		System.out.println("곱하기 결과 : " + (firstNumber*secondNumber));
		System.out.println("나누기한 몫 : " + (firstNumber/secondNumber));
		System.out.println("나누기한 나머지 : " + (firstNumber%secondNumber));
	}
}
