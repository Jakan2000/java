class Largestnumber 
{
	public static void main(String[] args) 
	{
		int []a={1,3,2};
		int big=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		System.out.println("The largest value in the given array is "+big);
	}
}
