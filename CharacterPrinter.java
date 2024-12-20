package functionalinterface;
@FunctionalInterface
interface PrintCharacter{
	public void PrintChar(char c);
}
public class CharacterPrinter {
	public static void main(String[] args) {
		PrintCharacter printer=(c)->System.out.println(c);
		printer.PrintChar('s');
	}
}
