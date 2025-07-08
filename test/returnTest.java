public class returnTest{
	
	public void sum(int a, int b){
	int result = (a - b)* 2;
	System.out.println(result);
	return;
	}

	public static void main(String [] args){
		new returnTest().sum(10,5);
	}
}