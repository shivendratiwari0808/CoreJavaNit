class Pattern16{
	public static void main(String[]args)
	{
	int nr=3,a,r,c;
	a=nr*(nr+1)/2;
		for(r=1;r<=nr;r++)
		{
			for(c=1;c<=r;c++)
			{
			System.out.print(a-- + " ");
			}
			System.out.println();
		}
		
	}
}