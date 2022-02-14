import java.util.Scanner;
public class Prob01{
	public static void main(String[]args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 ");
		int intputInt = keyboard.nextInt();
	
		if (intputInt < 2 || intputInt >9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		for(int a= 0;a<9;){
			++a;
			System.out.println(intputInt+" * "+a+" = "+ intputInt*a );
		}
		
	}
}