/* Q1.

Write a program to input three angles of a triangle and check whether a triangle is possible or not. If possible then check whether it is an acute-angled triangle, right-angled or an obtuse-angled triangle otherwise, display 'Triangle not possible'.

Sample Input: Enter three angles: 40, 50, 90

Sample Output: Right=angled Triangle
*/





	class Tringle{
		public static void main(String[]args){
		int angle1=20;
		int angle2=30;
		int angle3=35;
		int tringle;
		tringle=angle1+angle2+angle3;


		if(tringle==180 && angle1>0 && angle2>0 && angle3>0)
		{
			if(angle1<90 && angle2<90 && angle3<90)
			{
			System.out.println("acute-angled tringle");
			}
			else if(angle1==90 || angle2==90 || angle3==90)
			{
			System.out.println("right-angled tringle");
			}
			else
			{
			System.out.println("obtuse-angled-tringle");
			}
			
		}
			
	}

}
		
