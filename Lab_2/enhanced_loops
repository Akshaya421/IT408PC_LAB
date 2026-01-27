import java.util.Scanner;
class L2P2{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		int c=0;
		for(int i : arr)
		{
			int f=1;
				for(int j=2; j<=i; j++)
				{
					if(i%j==0)
					{
				         f=f+1;
				        }
				}
				if(f==2)
				{
				c+=1;
				}	
		} System.out.println(c);
         	

	
		        		
	}
  /*
  enter the size of array:
4
enter the elements:
1 2 3 4
2
  */
}
