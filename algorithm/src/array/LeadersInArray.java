package array;

public class LeadersInArray {
	
	static void findLeader(int arr [], int n)
	{
		
		for (int i = 0 ; i <arr.length;i++)
		{  
		     int count = 0;
		for (int j =i+1;j<arr.length;j++) {
		  
			if(arr[i]<arr[j])
			{
				count++;
			}
		}
			
		if(count==0)
		{
			System.out.println(arr[i]);
		}
		}
	}

	public static void main(String[] args) {
	int a [] = {16,17,4, 3, 5, 2};
	
	findLeader(a, a.length);
	}

}
