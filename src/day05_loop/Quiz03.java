package day05_loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		
		//for���� �̿��� A���� Z���� ���ʴ�� ���
		for(char c = 'A'; c <='Z'; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ����
		
		int sum = 0;
		
		for(int i = 1; i<=20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum += i;
			}
			
		}
		System.out.println("sum : " + sum);
		
		//�� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷�
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <=6; dice2++) {
				if(dice1 + dice2 == 6) {
					System.out.println("�ֻ���1 : " + dice1 +  ", �ֻ���2 : " +  dice2);
				}
			}
		}
		
		//���� �Է¹ް� �Է¹��� ���� 9�� ����Ǵ� ���α׷��� ����ÿ�
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("�����Է� : ");
			int num = sc.nextInt();
			
			if(num == 9) {
				System.out.println("9�� �ԷµǾ� ���α׷��� �����մϴ�.");
				break;
			}
			System.out.println("���� �Է��� ���� : " + num);
		}
		
		
		//���� for���� �̿��Ͽ� ���� ���ٿ� 7��, �� 7�� ����Ͻÿ�
		
		for(int i = 1; i<=7; i++) {
			for(int j = 1; j<=7; j++) {
				System.out.print("�� ");
			}
			System.out.println();
		}
		
		
	}
}
