class prime
{
	public static void main(String args[])
	{
		int counter;
		counter=get_array();
		System.out.println("No. of prime numbers: " + counter);
		System.out.println("No. of non-prime numbers: " + (100-counter));
	}
	public static int get_array()
	{
		long[] arr=new long[100];
		int i,a,a2,a3,a4,a5,a6,a7,pcount=0;
		boolean prim;
		for(i=0;i<100;i++)
		{
			
			a=(int)System.nanoTime()%10;
			a7=(int)System.nanoTime()%10;
			a2=(int)System.nanoTime()%10;
			a3=(int)System.nanoTime()%10;
			a4=(int)System.nanoTime()%10;
			a5=(int)System.nanoTime()%10;
			a6=(int)System.nanoTime()%10;
			arr[i]=((a*1000000)+(a2*100000)+(a3*10000)+(a4*1000)+(a5*100)+(a6*10)+a7);
		}
		for(i=0;i<100;i++)
		{
			System.out.println(arr[i]);
			prim=check_prime(arr[i]);
			if(prim==true)
				pcount+=1;
		}
		return pcount;
	}
	public static boolean check_prime(long num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
}
