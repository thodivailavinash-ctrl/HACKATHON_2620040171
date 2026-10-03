import java.util.Scanner;
class Calculator{
    public static double calculateTotalWaste(double point1Waste, double point2Waste){
        return point1Waste + point2Waste;
    }
}
public class ThreeC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double point1 = sc.nextDouble();
        System.out.println("Entered waste at point 1: " + point1);
        double point2 = sc.nextDouble();
        System.out.println("Entered waste at point 2: " + point2);
        double totalWaste = Calculator.calculateTotalWaste(point1, point2);
        System.out.println("Total waste: " + totalWaste);
    }
}
