/* Q.11 Write a program in
Java to calculate and display the hypotenuse of a Right-Angled Triangle by
taking perpendicular and base as inputs.

 h = √p2 + b2  */





import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of perpendicular (p): ");
        double p = scanner.nextDouble();

        System.out.print("Enter the value of base (b): ");
        double b = scanner.nextDouble();

     
        double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (h) is: " + h);

        scanner.close();
    }
}
