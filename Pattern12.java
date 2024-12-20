  class Pattern12{
	public static void main(String[]args)
	{
	int nr=10,r,c;
	for(r=1;r<=nr;r++)
	{
		for(c=1;c<=nr;c++)
		{
			if(c==r)
			{
			System.out.print("1 ");
			}
			else if(r>c)
			{
			System.out.print("0 ");
			}
			else
			{
			System.out.print("2 ");
			}

		}
		System.out.println();
	}
}
}
