import java.util.Scanner;

public class B2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int i = scan.nextInt();
		
		
		for (int j = 0; j < i; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// 백준 2438번 별찍기
/*

수 입력 : 5
*
**
***
****
*****



 */
