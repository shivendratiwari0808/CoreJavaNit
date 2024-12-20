interface I1
{
public void m1();
}
interface I2 extends I1
{
	public void m2();
}
class c implements I2
{

		public void m1(){
		System.out.println("m1 completed in impletation class ");
		}
		
			public void m2(){
			System.out.println("m2 completed in impletation class");
		}
}
class mainclass
{
	public static void main(String[]args){
		c c1=new c();
		c1.m1();
		c1.m2();
		}
}
