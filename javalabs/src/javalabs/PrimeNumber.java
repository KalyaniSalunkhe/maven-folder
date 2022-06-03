package javalabs;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	
				int n;
				int p;
				int i;
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the Limit :");
				n=sc.nextInt();
				System.out.println("all the prime number upto "+n+"is :");
				for( i=2; i<n; i++)
				{
					p=0;
					for (int j=2; j<i ;  j++)
					{
						if (i%j==0)
						{
							p=1;
						}
					}
					if (p==0)
					{
						System.out.println(i);
					}
				}
			}
		


	}


