/* 1. WAP using suitable input stream to input hours and minutes,convert
hours to minutes and minutes to hours.Display with suitable message.*/


/*class Hours
{	public void Hour
	public static void main(String[] args) 
	{
		int hours,minutes;
	}
}

*/













class Clock{
	public static void timeConverter(int hr, int min){
	System.out.println(" hours stored :"+hr+"hours");
	System.out.println(hr+" hours in minutes :"+(hr*60)+"minutes");
	System.out.println();
	System.out.println("minuts stored :"+min+"minutes");
	System.out.println(min+"minutes in hours :"+(min/60)+"hours");
}
public static void main(String[]args){
	System.out.println("main starts");
	timeConverter(5,180);
	System.out.println("main ends");

}
}