import java.math.*;

public class BinarySearch {

	int binarySearch(int data[], int start, int end, int x) {
		int mid = (start + end)/2;
		if (end >= 1) {
			mid = start+(end-1)/2;
		}
		if (data[mid]==x) {
			return mid;
		} else if (x <= data[mid]) {
			return binarySearch(data, x, start, mid -1);
		} else {
			return -1; 
			}
	}
	public static void main(String args[]) {
		BinarySearch bs = new BinarySearch();
		int data[] = {2,3,4,10,40};
		int n = data.length;
		int x = 4;
		int result = bs.binarySearch(data, 0, n-1, x);
		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element present at " + result);
		}
	}
}
