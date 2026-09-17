import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double temp = scn.nextDouble();

        if (temp < 98.2)
            System.out.println("Low");

        else if (temp >= 98.2 && temp <= 98.8)
            System.out.println("Normal");

        else
            System.out.println("High");

        scn.close();
    }
}
