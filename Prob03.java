import java.util.Scanner;
public class Prob03{
	public static void main(String[]args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� ");
		int inputInt = keyboard.nextInt();
		
		if(inputInt < 2 || inputInt > 9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
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