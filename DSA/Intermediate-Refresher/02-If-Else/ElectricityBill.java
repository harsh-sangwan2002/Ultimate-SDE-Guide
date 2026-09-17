import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int units = scn.nextInt(), price = 0;

        if (units >= 1 && units <= 50)
            price = units;

        else if (units <= 100)
            price = 50 + (units - 50) * 2;

        else
            price = 50 + 2 * 50 + (units - 100) * 4;

        System.out.println(price);

        scn.close();
    }
}
