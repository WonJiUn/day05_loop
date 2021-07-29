package day05_loop;

public class Quiz02 {
	public static void main(String[] args) {
		
		
		//±¸±¸´Ü
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " x " + j);
			}
		}
		
		
		//2
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		
		
		//3
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
		
	}
}
