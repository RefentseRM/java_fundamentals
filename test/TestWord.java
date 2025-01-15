public class TestWord{
	
	public static String word(String a, String b, String c){
		if(a.length()>b.length() && a.length()>c.length()){
			System.out.println("The longest word is: " + a);
			return a; 
		}
		return null;
	}  
	public static void main(String [] args){
		String a = "King";
		String b = "bag";
		String c = "dad";

		word( a, b , c);

	
	}
}