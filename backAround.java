

public class backAround {
	public static void main(String[] args ) {
		backAroundFunc("cat");
	}
	static void backAroundFunc(String str) {
		  int lastCharInt = str.length()-1;
		  String lastChar = str.substring(lastCharInt);
		  String newWord = lastChar + str + lastChar ;
		  System.out.println(newWord);
		  
		}
}
