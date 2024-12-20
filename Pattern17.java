class Pattern17{
	public static void main(String[]args)
	{
	int nr=5,a,r,c;
	a=nr*(nr+1)/2;
		for(r=nr;r>=1;r--)
		{
			for(c=r;c>=1;c--)
			{
			System.out.print(c + " ");
			}
			System.out.println();
		}
		
	}
}