class Sample{
	int x;
	int y;
	
	public Sample(){
	x=10;
	y=20;
	}
	public Sample(int x, int y){
	this.x=x;
	this.y=y;
	}
	public void modify(Sample s){
	System.out.println("x: "+x", "+"y :"+y);
	this.x=11;
	this.y=21;
	System.out.println("x :"+s.x+", "y :"+s.y);
	}

}
public class LabTask{
	public static void main(String[]args){
	Sample s1=new Sample();
	System.out.println("x :"+s1.x+", "y :"+s1.y);
	System.out.println();
	s1.modify(s1);
	System.out.println();
	System.out.println("x :"+s1.x+", "+"y :"+s1.y);
	}	
	
}