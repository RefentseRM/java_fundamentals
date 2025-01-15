public class TestNum{
	
	public static int num(int a, int b, int c){
		if(a>b && a>c){
			System.out.println("The biggest number is: " + a);
			return a; 
		}
		return 0;
	}  
	public static void main(String [] args){
		int a = 10;
		int b = 2;
		int c = 7;

		num( a, b , c);

	
	}
}