package firstproj;
import java.util.Scanner;
public class Recatengle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the width of your rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("enter the height of your rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height;
        System.out.println("the area of your rectangle is : " + area);
        scanner.close();
    }
}