package array;

//find the element/index whose all right hand element is lesser than it

//(Scan from right)

public class LeaderInArray {
	
	public void leaderInArray(int a[])
	{
		int max = a[a.length-1];
		
		System.out.print("leader: "+ max +",");
		
		for(int i =a.length-2;i>=0;i--)
		{
			if(max<a[i])
			{
			max=a[i];
				System.out.print( max +",");
				
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {16, 17, 4, 3, 5, 2};
		LeaderInArray l = new LeaderInArray();
		l.leaderInArray(a);

	}

}
