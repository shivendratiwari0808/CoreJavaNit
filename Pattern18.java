class Pattern18{
	public static void main(String[]args)
	{
	int nr=4,a,r,c;
	a=nr*(nr+1)/2;
		for(r=nr;r>=1;r--)
		{
			for(c=1;c<=r;c++)
			{
			System.out.print(c + " ");
			}
			System.out.println();
		}
		
	}
}