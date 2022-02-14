public class Prob02{
	public static void main(String[]args){

		int limit = 50;
		boolean prime = false;

		int i ;
		int j ;
		
		for (i=2;i<=limit; i++ ){
			for (j=2;j<i ;j++ ){
				if(i % j == 0){
				break;
				}

			}
			if (i == j){
				System.out.println(i);
			}
			
		}
	}
}