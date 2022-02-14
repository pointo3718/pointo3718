import java.util.Scanner;
public class Prob03{
	public static void main(String[]args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 ");
		int inputInt = keyboard.nextInt();
		
		if(inputInt < 2 || inputInt > 9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}else{
			int b = 1;
			for (int a = 0;a<inputInt; ){
				++a;
				int c = a * b;
				System.out.println(a+" ! = "+c);
				b = c;
			}
		}
	}
}