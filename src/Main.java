import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap side1");
        int side1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap side2");
        int side2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap side3");
        int side3 = sc.nextInt();
        sc.nextLine();
        try {
            if (side1 < 0 || side2 < 0 || side3 < 0 || (side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1) {
                throw new IllegalTriangleException();
            }else {
                System.out.println("day la 3 canh tam giac ");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
