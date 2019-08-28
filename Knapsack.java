
public class Knapsack { 
  
	static int max(int a, int b) {
		return (a > b) ? a : b;
		//returns max of two integers
	}
	//W for capacity, wt for weight, val for value,
	//n for number of items
	static int knapSack(int W, int wt[], int val[], int n) {		
		//base case if number of items or capacity is 0
		// not totally necessary
		if (n == 0 || W == 0) {
			return 0;
		}
		//if weight of the nth item weighs more than capacity
//		 than don't use nth item. Use items before it.
//		else return max of cases. first case including the nth item value
//		and second case without nth item
		if (wt[n - 1] > W) {
			return knapSack(W, wt, val, n-1);
		} else {
			return max(val[n-1] + knapSack(W - wt[n-1], wt, val,n-1), knapSack(W,wt,val,n-1));			
		}
	}
	public static void main(String args[]) 
    { 
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = val.length; 
        System.out.println(knapSack(W, wt, val, n)); 
    } 
} 