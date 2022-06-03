package javalabs;

public class IncresingOrder {
	
		public static void checkOrder(int num)
		{
			int temp=num;
			int dig=temp%10;
			
			temp=temp/10;
			boolean flag= true;
			while(temp>0)
			{
				if (dig<=temp%10)
				{
					flag= false;
					break;
				}
				dig =temp%10;
				temp=temp/10;
				


			}
			if(flag==true)
			{
				System.out.println(num+" digits are in increasing order.");
			}
			else
			{
				System.out.println(num+" digits are in decreasing order.");
			}
		}
		
		public static void main(String[] args) 
		{
			checkOrder(1234);
		
		}
	}



