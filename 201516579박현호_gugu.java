import java.util.Scanner;

public class gugudan {
	
	public static void main(String[] args) {
		
		System.out.print("몇 단을 계산하시겠습니까? : ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i=1; i<10; i++) {
			int result = num * i;
			System.out.println(num +"*"+ i+ "=" + result);
		}

	}
}
