import java.util.Scanner;

public class SpecialCaseInput {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        /*
         * What actually happens
         * 
         * When you type:
         * 
         * 123<Enter>
         * 
         * the input stream contains:
         * 
         * 123\n
         * 
         * nextInt() reads only:
         * 
         * 123
         * 
         * It does not consume the newline (\n) generated when you press Enter.
         * 
         * So now the input stream is effectively:
         * 
         * \n
         * 
         * Then:
         * 
         * String str = scn.nextLine();
         * 
         * reads everything until the next newline.
         * 
         * But the very next thing is already the leftover \n.
         * 
         * Therefore, nextLine() returns:
         * 
         * ""
         * 
         * (empty String).
         */
        // int num = scn.nextInt();
        // String str = scn.nextLine();
        int num = Integer.parseInt(scn.nextLine());
        String str = scn.nextLine();

        System.out.println(num);
        System.out.println(str);

        scn.close();
    }
}
