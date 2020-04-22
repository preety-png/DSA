package array;

public class SubArrayFromSumExample {
	
	static void getArrayFromSum(int arr[], int sum )
	{
		int start=0;
		int end =0;
		int arrSum ;
		for (int i=0;i<arr.length-1;i++)
		{
			arrSum=arr[i];
			for (int j=i+1;j<arr.length;j++) {
				 arrSum+= arr[j];
			
		   if(arrSum==sum)	
		   {
			   start=i;
			   end=j;
			   System.out.println("start index -------"+i);
			   System.out.println("end index -------"+j);
			  
		   }
	    }
	  }
		
		 printArr(arr,start,end);
	}
	
	
	static void subarrayForGivenSumEfficient(int arr[], int sum )
	{
		int start=0;
		int end =0;
		int arrSum = 0 ;
		for (int i=0;i<arr.length;i++)
		{	
			arrSum=arrSum+arr[i];
			
			while(arrSum>sum&&start<i) {
 			arrSum=arrSum-arr[start];	
				start++;
			}
			
			   if(arrSum==sum)	
		      {
			   
			   end=i;
			   System.out.println("start index -------"+start);
			   System.out.println("end index -------"+end);
			   break;
			  
		     }
			   
	    }
		
		 printArr(arr,start,end);
	  }
	
	
	
	static void printArr(int arr[], int start, int end){
		System.out.print("Elements--");
	  for (int i =start;i<=end ;i++ )
	  {
		  System.out.print(arr[i]+",");
	  }
	}

	public static void main(String[] args) {
	
		int arr []= {1,2,12,4,4,3};
		//getArrayFromSum(arr,11);
		subarrayForGivenSumEfficient(arr,3);
	}

}
