
public class HelloWorld {
	
	public void name(String str, int n) {
		  int start = 0;
		  int mid = n;
		  int end = str.length();		  
		  System.out.println(str.substring(start,mid) + str.substring(mid+1,end));
	}
	
	
	public static void main(String[] args) {
		HelloWorld Joel = new HelloWorld();
		Joel.name("Joel", 1);
    }
}
