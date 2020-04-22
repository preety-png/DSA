package array;

public class FibonacciExample {
	
	
	static int getFibonacciSeries(int n )
	{
		int sum = 0;
		int t1=0;
		int t2=1;

		for (int i = 1 ;i <= n ;i++ )
		{
			System.out.println(t1);
			
			sum =t1+t2;
			t1=t2;
			t2=sum;
			
		
		}
		return sum;		
	}

	public static void main(String[] args) {
		 int n=10;
		getFibonacciSeries(n);
		
	}

}
