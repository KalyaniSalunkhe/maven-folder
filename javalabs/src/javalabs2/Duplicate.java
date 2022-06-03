package javalabs2;

public class Duplicate {
	
		public static int modifyArray(int a[], int n)
		{
			if(n==0 || n==1)
			{
				return n;
			}
			int [] temp = new int[n];
			int j=0;

			for (int i=0;i<n-1 ;i++ )
			{
				if (a[i]!=a[i+1])
				{
					temp[j++]=a[i];
				}
			}
			return j;

		}
		public static void main(String[] args) 
		{
			int a[] ={1,3,4,5,2,1};
			int n=a.length;
			n= modifyArray(a,n);
			for (int i=0;i<n ;i++ )
			{
				System.out.println(a[i]+ " ");
			}
			
			
		}
	}


