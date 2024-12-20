/*

	        1
	      2   2
	    3   3   3
	  4   4   4   4

*/


class pattern1{
	public static void main(String[]args){
	
	int num=4;
	
	for(int r=1;r<=num;r++){
		
		for(int s=r;s<=num;s++){
		System.out.print("  ");
		}
		
		for(int c=1;c<=r;c++){
		
		System.out.print(r+"   ");
		}
		
		System.out.println();
	}
	
	
     }
}
