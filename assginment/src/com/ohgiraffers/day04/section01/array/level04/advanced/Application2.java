package com.ohgiraffers.day04.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
	static int strike = 0;
	static int ball = 0;
	static final int[] randomArr = new int[4];
	static int[] compareArr = new int[4];
	static int checkCount = 4;

	public static void main(String[] args) {

        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다. V
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int chance = 10;

		// 난수생성
		for (int i = 0; i < 4; i++) {
			randomArr[i] = random.nextInt(9);

			// 중복검사
			for (int j = 0; j < i; j++) {
				if (randomArr[i] == randomArr[j]) {
					i--;
				}
			}
		}

		for (int param : randomArr) {
			System.out.print(param); // 랜덤 번호 출력
		}

		while (chance > 0) {
			System.out.print("\n"+chance  + "회 남으셨습니다.\n4자리 숫자를 입력하세요 : ");
			String input = scanner.next();

			/**
			 * strike 한 index 는 삭제한 배열로 ball 검사. 그렇지 않으면
			 * random : 4400  input : 4044 경우에 1s 2b가 나옴.
			 */
			int[] removeStrikeIndex = strikeCheck(input);
			ballCheck(removeStrikeIndex);

			if (strike == 4) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.printf("아쉽네요 %dS %dB 입니다.", strike, ball);
			}
			strike = 0;
			ball = 0;
			chance--;
		}
    }


	private static void ballCheck(int[] inputArr) {
		for (int i = 0; i < checkCount; i++) {

			for (int j = 0; j < checkCount; j++) {
				if (compareArr[i] == inputArr[j]) {
					ball++;
					break;  // 랜덤수가 입력받은숫자배열에 2개존재하면 ballCount 가 2번올라감 그래서 끊어줘야함.
				}
			}
		}
	}

	private static int[] strikeCheck(String input) {
		int[] inputArr = new int[input.length()];
		compareArr = randomArr;

		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = input.charAt(i) - '0'; // 문자형 수를 정수형 수로 변환
		}

		for (int i = 0; i < checkCount; i++) {
			if (compareArr[i] == inputArr[i]) {
				inputArr = remove(inputArr, i);
				compareArr = remove(compareArr, i);
				strike++;
				checkCount--;
				i--;
			}
		}

		return inputArr;
	}

	private static int[] remove(int[] a, int index)	{
		if (a == null || index < 0 || index >= a.length) {
			return a;
		}

		int[] result = new int[a.length - 1];

		System.arraycopy(a, 0, result, 0, index);
		System.arraycopy(a, index + 1, result, index, a.length - index - 1);

		return result;
	}
}
