package javalabs;
import java.util.Scanner;


public class SumOfCubeDigit {

	public static void main(String[] args) {
	
	

				Scanner sc=new Scanner(System.in);

				System.out.println("input :");
				int num= sc.nextInt();
				int sum=0;
				
				while(num>0)
				{
					int mod = num%10;
					sum = sum +(int) Math.pow(mod, 3);
					num = num/10;
				}
				System.out.println("Sum of Digits of Cube :"+sum);
			}
		}
	
		