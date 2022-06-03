package Com.cg.demo;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{ 
		int n=100;
		if (n==0||n==1)
		{
			System.out.println("it is not a primenumber");
			return;
		}
		for( int i=2;i<=n;i++)
		{
			if (n%i==0)
			{
				 System.out.println("number is not prime no");
				 return;
				 
			}
			else
			{
				System.out.println("number is a prime number");
			}
		}
		
		
		
	}
		
		     
    
		
			
		}
