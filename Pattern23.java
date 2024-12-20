class Pattern23{
	public static void main(String[]args)
	{
	int n=10,r,c,s;
		
		for(r=1;r<=n;r++)
		{
			for(s=1;s<=n-r;s++)
			{
			System.out.print(" ");
			}
			for(c=1;c<=2*r-1;c++)
			{
			System.out.print("*");
			}
		System.out.println();
		}
		
	}
}
