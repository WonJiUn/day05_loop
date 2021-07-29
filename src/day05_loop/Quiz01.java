package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
		
		
		//1
		for(int i = 1; i<=4; i++) {
			System.out.println(i + ". hello");
		}
		
		//2
		int sum = 0;
		int i;
		
		for(i = 1; i<=100; i++) {
			sum += i;
			if(sum == 528)
				System.out.println("i = " + i);
		}
		
		
		//3
		for(int j = 1; j<=25; j++) {
			//System.out.print(j + "\t");
			
			//if(j%5 == 0) {
			//	System.out.println();
			//}
			
			if(j%5 == 0) {
				System.out.println(j);
			}
			else {
				System.out.print(j + "\t");
			}
		}
		
		
		
		
	}
}
