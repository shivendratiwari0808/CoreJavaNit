/* 4. Write a java program to print Fibonacci Series.
input :- 5
output :-  0, 1, 1, 2, 3. */



class Fibonacci{

	public static void main(String[]args){

		int f1=0,f2=1,f3;
		for(int i=0;i<5;i++){
		System.out.println(f1);
		f3=f1+f2;
		f2=f1;
		f1=f3;
	 	}
          }
}