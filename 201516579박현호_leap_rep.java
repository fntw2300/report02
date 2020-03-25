import java.util.Scanner;

public class leap_year_rep {

	public static void main(String[] args) {
				
		do {
			System.out.print("윤년 및 평년 확인 : ");
			Scanner input = new Scanner(System.in);
			int year = input.nextInt();
			
			if(year>0) {
				boolean leap = false;
				leap = (year % 4 == 0 && year % 100 !=0 | year % 400 == 0);
				if(leap) {
				   System.out.println(year + "년은 윤년입니다 ");
				  } else {
				   System.out.println(year + "년은 평년입니다.");
				  }
			} else 
				break;
		}while(true);
	}
}