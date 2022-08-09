import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();
        Rectangle hinhchunhat = new Rectangle(width,height);
        System.out.println("Your rectangle " + hinhchunhat.display());
        System.out.println("Area rectangle is : " + hinhchunhat.getArea() );
        System.out.println("Perimeter rectangle is : " + hinhchunhat.getPerimeter() );

    }
}
