package javalabs;

public class PowerOfTwo {

		public static boolean isPowerOftwo(int n)
		{
			if(n ==0)
			{
				return false;
			}
			while(n!=1)
			{
				if (n%2!=0)
				{
					return false;
				}
				n=n/2;
			}
			return true;

		}
		
		public static void main(String[] args) 
		{
			boolean var=isPowerOftwo(6);
			System.out.println(var);
		}
	}


