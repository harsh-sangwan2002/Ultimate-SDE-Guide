import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt(), nst = m;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("* ");

            System.out.println();
        }
        
        scn.close();
    }
}
