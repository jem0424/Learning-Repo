import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		createHashMap(arr);

	}
	static void createHashMap(int arr[]) {
		HashMap hmap =new HashMap();// instantiate HashMap
		for(int i = 0; i < arr.length;i++) {//iterate through array
			Integer c = hmap.get(arr[i]); // Gets element from array
			if (hmap.get(arr[i]) == null) {
				hmap.put(arr[i], 1);//Inserts 1 if null
			} else {
				hmap.put(arr[i], ++c); //Increments the integer by 1 if exists
			}
		}
		System.out.println(hmap);
	}
}
