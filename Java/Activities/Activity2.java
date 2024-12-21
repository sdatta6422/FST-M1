package hello;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[10, 77, 10, 54, -11, 10]
				//int[] arr=new int[6];
		int[] arr= {10, 77, 10, 54, -11, 10};
		
		Activity2 arrobj=new Activity2();
		arrobj.addarray(arr);
		

	}
void addarray(int[] arr)
{
	int i;
	int j;
	int sum=0;
	for (i=0;i<arr.length;i++)
	{
		if(arr[i]==10)
		{
			//j=arr[i];
			sum=sum+arr[i];
		}
	}
	
	//return  new int[] {10, 77, 10, 54, -11, 10};
	
	//return arr;
	System.out.println("Original Array:"+"  "+Arrays.toString(arr));
	if(sum==30)
	System.out.println("Result:"+"  "+true);
	else
		System.out.println("Result:"+"  "+false);
		
}
}
