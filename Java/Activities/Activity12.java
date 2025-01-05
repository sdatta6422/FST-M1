package hello;

interface Addable 
{
	int add(int a,int b);
}

public class Activity12 {
	
	public static void main(String args[])
	{
		Addable v1= (a,b)->(a+b);
		System.out.println(v1.add(10,20));
		//Addable v2;
		Addable v2= (int a,int b)->
		{
			return (a+b);
		};
		
		System.out.println(v2.add(10,10));
	}

}

	
	

