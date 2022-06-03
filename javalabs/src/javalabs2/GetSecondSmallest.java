package javalabs2;

class GetSecondSmallest 
{
	static int temp,size;

	
	public static int getSecondSmallest(int [] a)
	{
		//size=a.length;	
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length ; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	public static void main(String[] args) 
	{
		int [] n={3,5,6,8,7,9};
		int res;
		res = getSecondSmallest(n);
		System.out.println(res);
	}
}
