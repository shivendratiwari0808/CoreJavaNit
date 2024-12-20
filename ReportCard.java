/*  */






class ReportCard{
	public static void generateResult(){
	int average=65; //local variable declared
	}
	public static void display(){
	//System.out.println(average); //cant access the local variable of another method
	}
	public static void main(String[]args){
	System.out.println("main chalu");
	generateResult();
}
}