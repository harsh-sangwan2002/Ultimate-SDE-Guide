import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int unitsConsumed = scn.nextInt(), price = 0;

        if (unitsConsumed <= 50)
            price = unitsConsumed;

        else if (unitsConsumed > 51 && unitsConsumed <= 100)
            price = 50 + (unitsConsumed - 50) * 2;

        else
            price = 50 + 50 * 2 + (unitsConsumed - 100) * 4;

        System.out.println(price);
        scn.close();
    }
}
