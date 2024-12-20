class Pattern13{
	public static void main(String[]args)
	{
	int nr=4,r,c;
	for(r=1;r<=nr;r++)
	{
		for(c=1;c<=nr;c++)
		{
			if(c<=nr-r)
			{
			System.out.print("1 ");
			}
			else
			{
			System.out.print(r+ " ");
			}
		}
		System.out.println();
	}
}
} 