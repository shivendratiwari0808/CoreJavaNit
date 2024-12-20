 class Prime1{
	int n;
	public static void k1(){
	if(n==1)
	{
	System.out.println("not a prime no : "+n);
	}
	else
	{
		for(int i=1;i<=n;i++)
		{	
			int c=0;
			if(n%i==0)
			c++;
		}
			if(c==2)
			{
			System.out.println("prime no");
			}
			else
			{
			System.out.println("composite no");
			}
	}
	}
	public static void main(String[]args){
	Prime1 number=new Prime1();
	number.n=11;

	number.k1();
	}
}		
	