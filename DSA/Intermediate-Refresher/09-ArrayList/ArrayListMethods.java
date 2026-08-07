import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        // add
        arr.add(5);
        arr.add(-1);
        arr.add(2);
        System.out.println(arr);

        // get
        System.out.println("1st element is: " + arr.get(0));
        System.out.println("2nd element is: " + arr.get(1));
        System.out.println("3rd element is: " + arr.get(2));

        // set
        // arr.set(5,8); // IndexOutOfBoundsException
        // arr.add(5, 8); // IndexOutOfBoundsException
        arr.add(3, 8);
        arr.add(80);
        System.out.println(arr);

        // size
        System.out.println(arr.size());

        // clear
        arr.clear();
        System.out.println(arr);
    }
}