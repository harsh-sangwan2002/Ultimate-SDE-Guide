public class Reverse {

    private static long[] reverse(long num) {

        StringBuilder sb = new StringBuilder("");
        long temp = num, trailingZeroes = 0;

        while (temp % 10 == 0) {
            temp = temp / 10;
            trailingZeroes++;
        }

        while (num != 0) {
            long ld = num % 10;
            sb.append(ld);
            num /= 10;
        }

        return new long[] { Long.parseLong(sb.toString()), trailingZeroes };
    }

    private static long reverseDecimalNumber(double num) {

        String str = String.valueOf(num);
        long multiplier = str.length() - str.indexOf(".") - 1;
        long number = Math.round(num * Math.pow(10, multiplier));

        long res = 0;

        while (number != 0) {
            long ld = number % 10;
            res = res * 10 + ld;
            number /= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        long x = 123400;
        long[] res = reverse(x);

        for (int i = 0; i < res[1]; i++)
            System.out.print(0 + "");

        System.out.println(res[0]);

        double d = 123.456;
        System.out.println(reverseDecimalNumber(d));
    }
}
