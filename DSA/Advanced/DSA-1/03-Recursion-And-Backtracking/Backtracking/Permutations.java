import java.util.Scanner;

public class Permutations {

    public static int factorial(int n) {

        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void printPermutations(String str) {

        int n = str.length(), fact = factorial(n);

        for (int i = 0; i < fact; i++) {

            int temp = i;
            StringBuilder sb = new StringBuilder(str);

            for (int div = n; div >= 1; div--) {

                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }

            System.out.println();
        }
    }

    public static void printPermutations2(int[] arr, int idx, int[] ans, boolean[] vis) {

        if (idx == arr.length) {

            int[] temp = new int[ans.length];

            for (int i = 0; i < ans.length; i++) {
                temp[i] = ans[i];
                System.out.print(temp[i] + " ");
            }

            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!vis[i]) {

                ans[idx] = arr[i];
                vis[i] = true;
                printPermutations2(arr, idx + 1, ans, vis);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printPermutations(str);

        int[] arr = new int[] { 1, 2, 3 };
        int[] ans = new int[3];
        boolean[] vis = new boolean[3];

        printPermutations2(arr, 0, ans, vis);
        scn.close();
    }
}
