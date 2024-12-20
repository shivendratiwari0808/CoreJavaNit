class Pattern19{


	public static void main(String[]args)
	{
	int nr=10,a=1,b,r,c;
	for(r=1;r<=nr;r++)
	{
		b=a+r-1;
		for(c=1;c<=r;c++,a++)
		{
			if(r%2==0)
			{
			System.out.print(b-- + " ");
			}
			else
			{
			System.out.print(a + " ");
			}
		
		}
		System.out.println();
		
	}
}
	
}