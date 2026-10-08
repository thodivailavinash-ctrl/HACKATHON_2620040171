import java.util.Scanner;
public class ThreeB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double wasteCollected = sc.nextDouble();
        System.out.println("Waste Collected: " + wasteCollected);
        if(wasteCollected >= 100.0){
            System.out.println("Collection Target Achieved");
        }
        else{
            System.out.println("More Waste Collection Required");
        }
    }
}
