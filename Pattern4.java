/* 
   1 
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1

*/


class Pattern4{
	public static void main(String[]args){
	
	int n=5;
	    
         for(int r=1;r<=n;r++){
		
		for(int c=1;c<=r;c++)
		{
			if(r%2==0 && c%2==0){
			System.out.print(" 1");	
			}
			else if(r%2!=0 && c%2!=0){
				System.out.print(" 1");
			}
			else {
			System.out.print(" 0");
			}
		}
		System.out.println();
	}
	
    }
}