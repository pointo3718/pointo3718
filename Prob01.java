import java.util.Scanner;
public class Prob01{
	public static void main(String[]args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� ");
		int intputInt = keyboard.nextInt();
	
		if (intputInt < 2 || intputInt >9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}
		for(int a= 0;a<9;){
			++a;
			System.out.println(intputInt+" * "+a+" = "+ intputInt*a );
		}
		
	}
}