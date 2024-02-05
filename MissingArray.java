package assignments;
import java.util.Scanner;
public class MissingArray {
	
	public static int missingNum(int arr[])
	{
		int n=arr.length;
		
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			sum=sum-arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {1,2,4,5};
		System.out.println("missing num is :"+missingNum(arr));
	}

}

