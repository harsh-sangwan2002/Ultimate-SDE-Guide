package SumOfSubmatrices;

public class Solution2 {

    public static void generateSubMatrix(int[][] arr) {

        int n = arr.length;

        // top row
        for (int top = 0; top < n; top++) {

            // bottom row
            for (int bottom = top; bottom < n; bottom++) {

                // left column
                for (int left = 0; left < n; left++) {

                    // right column
                    for (int right = left; right < n; right++) {

                        System.out.print("[ ");

                        // Generate Sub-Matrix
                        for (int i = top; i <= bottom; i++) {

                            for (int j = left; j <= right; j++) {

                                System.out.print(arr[i][j] + " ");
                            }

                            System.out.println("]");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 2 }, { 3, 4 } };
        generateSubMatrix(arr);
    }
}
