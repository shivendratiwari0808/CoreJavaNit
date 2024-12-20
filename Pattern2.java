/* 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5



*/

class Pattern2{
	public static void main(String []args){
	
	int num=5;
	
	for(int r=1;r<=num;r++){
	
		for(int c=1;c<=r;c++){
		
		System.out.print(c+ " ");	
		}
		System.out.println();
	}
   }
}