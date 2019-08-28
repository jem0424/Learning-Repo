import java.util.*;

public class BasicLinkedHashMap {
	public static void main(String a[]) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("one","Joel");
		lhm.put("two", "Edward");
		lhm.put("three", "Munoz");
		System.out.println(lhm); //prints elements in same order as inserted
		System.out.println("Getting value for key 'one': " + lhm.get("one"));
		System.out.println("Size of map: " + lhm.size());
		System.out.println("Is map empty? " + lhm.isEmpty());
		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
		System.out.println("Contains value 'Joel'" + lhm.containsValue("Joel"));
		System.out.println("delete element one " + lhm.remove("one"));
		System.out.println(lhm);
	}

}
