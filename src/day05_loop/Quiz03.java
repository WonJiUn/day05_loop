package day05_loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		
		//for문을 이용해 A부터 Z까지 차례대로 출력
		for(char c = 'A'; c <='Z'; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum += i;
			}
			
		}
		System.out.println("sum : " + sum);
		
		//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <=6; dice2++) {
				if(dice1 + dice2 == 6) {
					System.out.println("주사위1 : " + dice1 +  ", 주사위2 : " +  dice2);
				}
			}
		}
		
		//수를 입력받고 입력받은 수가 9면 종료되는 프로그램을 만드시오
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("9가 입력되어 프로그램을 종료합니다.");
				break;
			}
			System.out.println("내가 입력한 수는 : " + num);
		}
		
		
		//이중 for문을 이용하여 ★을 한줄에 7개, 총 7줄 출력하시오
		
		for(int i = 1; i<=7; i++) {
			for(int j = 1; j<=7; j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		
		
	}
}
