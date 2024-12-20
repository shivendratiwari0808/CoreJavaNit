package wrapperClass;

public class StringObjectIntoPrimitiveType {

	public static void main(String[] args) {
		try {
			String str1="100a"; //ptv
			String str2="200";
			int n1=Integer.parseInt(str1);
			int n2=Integer.parseInt(str2);
			System.out.println(n1+n2);
		}
		catch(NumberFormatException e){
			System.out.println("dont take charatecrs string while converting into int ptv");
		}

	}

}
