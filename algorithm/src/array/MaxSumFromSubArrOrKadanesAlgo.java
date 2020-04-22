package array;

public class MaxSumFromSubArrOrKadanesAlgo {

	public static int maxSumOfSubArray(int arr[]) {
		
	   int total =0;
	   int max=Integer.MIN_VALUE;
	   int startIndex=0;
	   int endIndex=0;
	   int tempStart=0;

       for (int i=0;i<=arr.length-1;i++)
        {
    	   total+=arr[i];
    	   
    	   if(total<arr[i])
           {
         	  total=arr[i];
         	 //  startIndex=i;
         	  
           }
    	   
          if(max<total)
          {
        	  max=total;
        	  startIndex=tempStart;
        	  endIndex=i;
        	  
          }
         
         if (total<0) {
        	 total=0; 
         tempStart=i+1;
         }		
	   }
   	   System.out.println("\nMax sum: "+max);	

      findSubArray(arr,startIndex,endIndex);
      
	  return max;
	}
	public static void findSubArray(int arr[], int startIndex, int endIdex) {
      System.out.println("start: "+startIndex+" & end: "+endIdex);
      System.out.println("sub array: ");
		for (int i=startIndex;i<=endIdex;i++) {
			System.out.print(arr[i]+",");
		}
		
	  }

	
	static void maxSumFromSubArrayDP(int[]  a)
	{
		int [] dp = new int[a.length+1];
		dp[0] = 0;
		
		for(int i =1;i<dp.length;i++)
		{
			dp[i]=Math.max(dp[i-1]+a[i-1], a[i-1]);
		}
		
		   int max=dp[0];
		
		 for (int j = 1; j <dp.length ; j++) {
	            if(max<dp[j])
	                max = dp[j];
	        }
		 
		 System.out.println("\nfrom dp: "+max);

	}
	
	public static void main(String[] args) {

		int[] arr = new int[]{4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		int [] ar1={-2, -3, 4, -1, -2, 1, 5, -3};
		int [] ar2= {-2,1,-3,4,-1,2,1,-5,4};
	
		maxSumOfSubArray(arr);	
		maxSumOfSubArray(ar1);
		maxSumOfSubArray(ar2);
		maxSumFromSubArrayDP(ar2);
	  }

}
