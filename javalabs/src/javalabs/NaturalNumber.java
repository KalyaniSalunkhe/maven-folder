package javalabs;

public class NaturalNumber {
			static int addition =0;
			public static int sum(int n)
			{
				//int sum =0;
				for(int i=1;i<=n;i++)
				{
					if(i%3==0 || i%5==0)
					{
						addition=i+addition;
					}

				}
				return addition;
				//System.out.println("Addition of "+n+ " natural number is :"+sum);
			}

			

			public static void main(String[] args) 
			{
				sum(10);
				System.out.println("Addition of  natural number is :"+addition);
			
			}
		


	}


