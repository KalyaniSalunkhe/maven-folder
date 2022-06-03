package javalabs;



class Differenceandsq 
{
	static int difference =0;
	public static int calculatediff(int n)
	{
		int sum =0;
		int s=0;
		int sl=0;
		
		for(int i=1;i<=n;i++)
		{
			sum=(i*i)+sum;
			s=i+s;
			sl=s*s;
			difference=sum-sl;
			
		
		}
		return difference;
		//System.out.println("Addition of "+n+ " natural number is :"+sum);
	}

	

	public static void main(String[] args) 
	{
		calculatediff(10);
		System.out.println("diff of  natural number is :"+difference);
	
	}
}
