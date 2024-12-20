class College{
	
	String name;
	int physics,chemistry,math,biology,hindi,english;
	int average,totalMark;
	public void studentDetails(String name){
	this.name=name;
	}
	public void physics(int physics){
	this.physics=physics;
	}
	public void chemistry (int chemistry){
	this.chemistry=chemistry;
	}
	public void math(int math){
	this.math=math;
	}
	public void biology(int biology){
	this.biology=biology;
	}
	public void hindi(int hindi){
	this.hindi=hindi;
	}
	public void english(int english){
	this.english=english;
	}
	public void calculate(){
	totalMark=physics+chemistry+math+biology+hindi+english;
	average= totalMark/6;
	}

	
	public void display(){
	
	System.out.println();
	System.out.println("Govt. T.R.S. college rewa (M.P.) ");
	System.out.println("    Semster exam 2024 ");
	System.out.println();
	System.out.println("Student Name :"+name);
	System.out.println(" -:SIX SUBJECT MARKS:- ");
	System.out.println("Physics :"+physics);
	System.out.println("Chemistry :"+chemistry);
	System.out.println("Math-matics :"+math);
	System.out.println("Biology :"+biology);
	System.out.println("Hindi :"+hindi);
	System.out.println("English :"+english);
	
	System.out.println("The Total Marks :"+totalMark);
	System.out.println("Student Average is :"+average);
		
	}
	
}